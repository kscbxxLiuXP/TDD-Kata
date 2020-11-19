import java.util.ArrayList;
import java.util.List;

public class Kata {

    // the name can be String and String[], so we define it as an Object type variable
    // and we verify its real type using instanceof
    public String greet(Object name) {
        //if null , return directly
        if (name == null) {
            return "Hello, my friend.";
        }

        // name is a String that satisfy requirement 1. 2. 3
        if (name instanceof String) {
            //All char in name is UPPERCASE
            if (((String) name).toUpperCase().equals(name)) {
                return greetUpperCase((String) name);
            }
            return "Hello, " + name + ".";
        }

        // name is a String array that satisfies requirement 4-8
        if (name instanceof String[]) {
            String[] names = (String[]) name;

            // we deal with lowercase name and UPPERCASE name differently
            // So the first step is separate them
            List<String> lowerList = new ArrayList<String>();
            String upper = null;
            for (int i = 0; i < names.length; i++) {
                if (names[i].toUpperCase().equals(names[i])) {
                    upper = names[i];
                } else {
                    lowerList.add(names[i]);
                }
            }

            //greet with array that only contains lowercase name
            String returnValue = greetArray((lowerList.toArray(new String[0])));

            //concatenate lowercase greet and UPPERCASE shouting together if it has
            if (upper == null) {
                return returnValue;
            } else {
                return returnValue + " AND " + greetUpperCase(upper);
            }
        }
        return "";
    }

    //Refactoring: extract method that greet with many people
    private String greetArray(String[] strings) {
        //we first split element if it has a ',' inside
        strings = splitStringWithComma(strings);
        //when there are only two elements
        if (strings.length == 2) {
            return "Hello, " + strings[0] + " and " + strings[1] + ".";
        }
        //when there are more than 2 elements
        String hello = "Hello, ";
        String upperCase = null;
        for (int i = 0; i < strings.length - 1; i++) {
            hello += strings[i] + ", ";
        }
        return hello + "and " + strings[strings.length - 1] + ".";
    }

    //Refactoring: extract method that shout  (UPPERCASE input)
    private String greetUpperCase(String string) {
        return "HELLO " + string + "!";
    }

    //Refactoring: temp replace, deal with String element with comma according to requirement 7 and 8
    private String[] splitStringWithComma(String[] names) {
        //we use a namelist to store the names after splitting with ','
        List<String> nameList = new ArrayList<String>();

        for (int i = 0; i < names.length; i++) {

            if (!names[i].contains("\"")) {
                //split the element with ','
                String[] splitResult = names[i].split(",");
                for (String s : splitResult) {
                    nameList.add(s);
                }
            } else {
                //we do not split the element which starts with \"
                //which according to requirement8, it escapes the splitting rule
                //so the element is directly added to the namelist
                nameList.add(names[i].substring(1, names[i].length() - 1));

            }

        }

        // return the array
        return nameList.toArray(new String[0]);
    }
}

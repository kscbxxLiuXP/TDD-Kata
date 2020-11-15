import java.util.ArrayList;
import java.util.List;

public class Kata {


    public String greet(Object name) {
        if (name == null) {
            return "Hello, my friend.";
        }
        if (name instanceof String) {
            if (((String) name).toUpperCase().equals(name)) {
                return greetUpperCase((String) name);
            }
            return "Hello, " + name + ".";
        }
        if (name instanceof String[]) {
            String[] names = (String[]) name;


            List<String> lowerList = new ArrayList<String>();
            String upper = null;
            for (int i = 0; i < names.length; i++) {
                if (names[i].toUpperCase().equals(names[i])) {
                    upper = names[i];
                } else {
                    lowerList.add(names[i]);
                }
            }
            String returnValue = greetArray((lowerList.toArray(new String[0])));
            if (upper == null) {
                return returnValue;
            } else {
                return returnValue + " AND " + greetUpperCase(upper);
            }
        }
        return "";
    }

    private String greetArray(String[] strings) {
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

    private String greetUpperCase(String string) {
        return "HELLO " + string + "!";
    }

    private String[] splitStringWithComma(String[] names) {
        List<String> nameList = new ArrayList<String>();
        for (int i = 0; i < names.length; i++) {
            String[] splitResult = names[i].split(",");
            for (String s : splitResult) {
                nameList.add(s);
            }
        }
        return nameList.toArray(new String[0]);
    }
}

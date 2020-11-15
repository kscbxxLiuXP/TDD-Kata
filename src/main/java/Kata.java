public class Kata {


    public String greet(Object name) {
        if (name == null) {
            return "Hello, my friend.";
        }
        if (name instanceof String) {
            if (((String) name).toUpperCase().equals(name)) {
                return "HELLO " + name + "!";
            }
            return "Hello, " + name + ".";
        }
        if (name instanceof String[]) {
            String[] newV = (String[]) name;
            //when there are only two elements
            if (newV.length == 2) {
                return "Hello, " + newV[0] + " and " + newV[1] + ".";
            }
            //when there are more than 2 elements
            String hello = "Hello, ";
            for (int i = 0; i < newV.length - 1; i++) {
                hello = hello + newV[i] + ", ";
            }
            return hello + "and " + newV[newV.length - 1] + ".";
        }
        return "";

    }
}

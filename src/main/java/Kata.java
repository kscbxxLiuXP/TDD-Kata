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
            return "Hello, " + newV[0] + " and " + newV[1] + ".";
        }
        return "";

    }
}

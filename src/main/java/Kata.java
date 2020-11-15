public class Kata {


    public String greet(String name) {
        if (name == null) {
            return "Hello, my friend.";
        }
        if(name.toUpperCase().equals(name)) {
            return "HELLO " + name +"!";
        }
        return "Hello, " + name + ".";
    }
}

import org.junit.Assert;
import org.junit.Test;


public class TDD {

    @Test
    public void testGreetNormalSingleStringName() {
        //The first requirement that with only a single normal string input
        String name = "Bob";
        Kata kata = new Kata();
        String returnValue = kata.greet(name);

        assert returnValue.equals("Hello, Bob.");
    }

    @Test
    public void testGreetNullSingleStringName() {
        // The second requirement that should handle with single null String input
        String name = null;
        Kata kata = new Kata();
        String returnValue = kata.greet(name);
        assert returnValue.equals("Hello, my friend.");
    }

    @Test
    public void testGreetHandleShouting() {
        // The third requirement that greets ALL-UPPERCASE String input
        String name = "JERRY";
        Kata kata = new Kata();
        String returnValue = kata.greet(name);
        Assert.assertEquals(returnValue, "HELLO JERRY!");
    }

    @Test
    public void testGreetWithTwoElementArray() {
        // The 4th requirement that should accepts String array as input which only has two elements
        String[] names = new String[]{"Jill", "Jane"};
        Kata kata = new Kata();
        String returnValue = kata.greet(names);
        Assert.assertEquals(returnValue, "Hello, Jill and Jane.");
    }

    @Test
    public void testGreetWithArbitraryElementArray() {
        // The 5th requirement that should accepts String array as input which has more than two elements
        String[] names = new String[]{"Amy", "Brian", "Charlotte"};
        Kata kata = new Kata();
        String returnValue = kata.greet(names);
        Assert.assertEquals(returnValue, "Hello, Amy, Brian, and Charlotte.");
    }

    @Test
    public void testMixingOfNormalAndShoutedNames() {
        // The 6th requirement that should accepts String array as input which contains UPPERCASE name
        String[] names = new String[]{"Amy", "BRIAN", "Charlotte"};
        Kata kata = new Kata();
        String returnValue = kata.greet(names);
        Assert.assertEquals(returnValue, "Hello, Amy and Charlotte. AND HELLO BRIAN!");
    }

    @Test
    public void testGreetArrayContainsComma() {
        // The 7th requirement that accepts elements contains comma in the String.
        // It should split the name that contains ','
        String[] names = new String[]{"Bob", "Charlie,Dianne"};
        Kata kata = new Kata();
        String returnValue = kata.greet(names);
        Assert.assertEquals(returnValue, "Hello, Bob, Charlie, and Dianne.");
    }

    @Test
    public void testGreetArrayEscapeIntentionalComma() {
        // The 8th requirement that escape the rule in requirement7 if the element itself contains '\"'
        String[] names = new String[]{"Bob", "\"Charlie, Dianne\""};
        Kata kata = new Kata();
        String returnValue = kata.greet(names);
        Assert.assertEquals(returnValue, "Hello, Bob and Charlie, Dianne.");
    }


}

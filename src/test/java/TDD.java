import org.junit.Assert;
import org.junit.Test;


public class TDD {

    @Test
    public void testGreetNormalSingleStringName() {

        String name = "Bob";
        Kata kata = new Kata();
        String returnValue = kata.greet(name);

        assert returnValue.equals("Hello, Bob.");
    }

    @Test
    public void testGreetNullSingleStringName() {

        String name = null;
        Kata kata = new Kata();
        String returnValue = kata.greet(name);
        assert returnValue.equals("Hello, my friend.");
    }

    @Test
    public void testGreetHandleShouting(){
        String name = "JERRY";
        Kata kata = new Kata();
        String returnValue = kata.greet(name);
        Assert.assertEquals(returnValue, "HELLO JERRY!");
    }

    @Test
    public void testGreetWithTwoElementArray(){
        String[] names = new String[]{"Jill","Jane"} ;
        Kata kata = new Kata();
        String returnValue = kata.greet(names);
        Assert.assertEquals(returnValue, "Hello, Jill and Jane.");
    }

}

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


}

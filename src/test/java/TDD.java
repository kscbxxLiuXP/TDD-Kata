import org.junit.Test;


public class TDD {

    @Test
    public void testGreetNormalSingleStringName() {

        String name = "Bob";
        Kata kata = new Kata();
        String returnValue  = kata.greet(name);

        assert returnValue.equals("Hello, Bob");
    }
}

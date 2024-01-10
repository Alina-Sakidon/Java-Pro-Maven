import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CalcTest {

    private Calc calc;

    @Before
    public void preconditions() {
        calc = new Calc();
    }

    @Test
    public void performSum() {
        int result = calc.perform(6, 2, Operator.SUM);

        Assert.assertEquals(8, result);
    }

    @Test
    public void performMinus() {
        int result = calc.perform(6, 2, Operator.MINUS);

        Assert.assertEquals(4, result);
    }

    @Test
    public void performDivide() {
        int result = calc.perform(6, 2, Operator.DIVIDE);

        Assert.assertEquals(3, result);
    }

    @Test
    public void performThrow() {

        Assert.assertThrows(IllegalArgumentException.class,
                () -> calc.perform(6, 2, null));
    }
}
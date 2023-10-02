import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        Assertions.assertEquals(8, calculator.addNumbers(6,2));
    }

    @Test
    public void testSubtraction() {
        Assertions.assertEquals(4, calculator.subtraction(8, 4));
    }

    @Test
    public void testDivide() {
        Assertions.assertEquals(2, calculator.divide(8, 4));
    }

    @Test
    public void testMultiply() {
        Assertions.assertEquals(8, calculator.multiply(4, 2));
    }
}

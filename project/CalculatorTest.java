import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testAddNegative() {
        assertEquals(-1, calculator.add(2, -3));
    }

    @Test
    public void testAddZero() {
        assertEquals(2, calculator.add(2, 0));
    }

    @Test
    public void testSubtract(){
        assertEquals(-1, calculator.subtract(2, 3));
    }

    @Test
    public void testSubtractNegative() {
        assertEquals(5, calculator.subtract(2, -3));
    }

    @Test
    public void testSubtractZero() {
        assertEquals(2, calculator.subtract(2, 0));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    public void testMultiplyNegative() {
        assertEquals(-6, calculator.multiply(2, -3));
    }

    @Test
    public void testMultiplyZero() {
        assertEquals(0, calculator.multiply(2, 0));
    }

    @Test
    public void testDivide(){
        assertEquals(2, calculator.divide(6, 3));
    }

    @Test
    public void testDivideNegative() {
        assertEquals(-2, calculator.divide(6, -3));
    }

    @Test
    public void testModulus() {
        assertEquals(2, calculator.modulus(2, 3));
    }

    @Test
    public void testModulusNegative() {
        assertEquals(-2, calculator.modulus(-5, 3));
    }

    @Test
    public void testAddException() {
        assertThrows(ArithmeticException.class, () -> calculator.add(Integer.MAX_VALUE, 50));
    }

    @Test
    public void testSubtractException() {
        assertThrows(ArithmeticException.class, () -> calculator.subtract(Integer.MIN_VALUE, 50));
    }

    @Test
    public void testMultiplyException() {
        assertThrows(ArithmeticException.class, () -> calculator.multiply(Integer.MAX_VALUE, 2));
    }

    @Test
    public void testDivideException() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(2, 0));
    }

    @Test
    public void testModulusException() {
        assertThrows(IllegalArgumentException.class, () -> calculator.modulus(2, 0));
    }
}

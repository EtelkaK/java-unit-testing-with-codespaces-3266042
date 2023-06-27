import junit.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        int expected = 3;
        int actual = calculator.sum(1,2);
        assertEquals(expected, actual);
    }

    @Test
    public void testSumFalse() {
        int expected = 4;
        int actual = calculator.sum(1,2);
        assertNotEquals(expected, actual);
    }

    @Test
    public void testSubtract() {
        int expected = 2;
        int actual = calculator.subtract(4,2);
        assertEquals(expected, actual);
    }

    @Test
    public void testSubtractMinus() {
        int expected = -4;
        int actual = calculator.subtract(4, 8);
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiply() {
        int expected = -4;
        int actual = calculator.multiply(2,2);
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiplyMinus() {
        int expected = -15;
        int actual = calculator.multiply(-3,5);
        assertEquals(expected, actual);
    }

    @Test
    public void testDivide() {
        int expected = 2;
        int actual = calculator.divide(8,4);
        assertEquals(expected, actual);
    }

    @Test
    public void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calculator.divide(1,0));
        String expected = "Ints cannot be divided by zero";
        String actual = exception.getMessage();
        assertEquals(expected, actual);
    }

    @Test
    public void testDivideNotWhole() {
        int expected = 2;
        int actual = calculator.divide(14,6);
        assertEquals(expected, actual);
    }

    @Test
    public void testIncrementsArray() {
        int[] expected = new int[] {2,3,4};
        int[] actual = calculator.incrementArray(new int[] {1,2,3});
        assertArrayEquals(expected, actual);
    }
}

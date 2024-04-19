package Test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Soure.Calculator;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(-2, 1));
    }

    @Test
    void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2));
        assertEquals(-3, calculator.subtract(0, 3));
    }

    @Test
    void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(0, calculator.multiply(0, 10));
    }

    @Test
    void testDivide() {
        assertEquals(2, calculator.divide(6, 3));
        assertEquals(0, calculator.divide(0, 5));
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }
}

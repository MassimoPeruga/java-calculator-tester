package org.learning.unit_testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        assertEquals(5, Calculator.add(2, 3));
    }

    @Test
    void subtract() {
        assertEquals(-1, Calculator.subtract(2, 3));
    }

    @Test
    void divide() {
        assertEquals(2, Calculator.divide(6, 3));
    }

    @Test
    void divideByZero() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.divide(1, 0));
    }

    @Test
    void multiply() {
        assertEquals(6, Calculator.multiply(2, 3));
    }
}
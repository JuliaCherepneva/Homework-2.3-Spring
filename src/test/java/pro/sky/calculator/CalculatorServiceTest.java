package pro.sky.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceTest {
    private final CalculatorServiceImpl service = new CalculatorServiceImpl ();

    @Test
    public void testPlus() {
        assertEquals(3, service.plus(1, 2));
        assertEquals(1, service.plus(-1, 2));
        assertEquals(-1, service.plus(1, -2));
        assertEquals(-3, service.plus(-1, -2));
        assertEquals(2, service.plus(0, 2));
        assertEquals(1, service.plus(1, 0));
    }

    @Test
    public void testMinus() {
        assertEquals(1, service.minus(2, 1));
        assertEquals(-3, service.minus(-1, 2));
        assertEquals(3, service.minus(1, -2));
        assertEquals(-2, service.minus(0, 2));
        assertEquals(1, service.minus(1, 0));
        assertEquals(1, service.minus(-1, -2));
    }

    @Test
    public void testMultiply() {
        assertEquals(2, service.multiply(1, 2));
        assertEquals(-2, service.multiply(-1, 2));
        assertEquals(-2, service.multiply(1, -2));
        assertEquals(0, service.multiply(0, 2));
        assertEquals(0, service.multiply(1, 0));
        assertEquals(2, service.multiply(-1, -2));
    }

    @Test
    public void testDivide() {
        assertEquals(2, service.divide(2, 1));
        assertEquals(-1, service.divide(-2, 2));
        assertEquals(-1, service.divide(2, -2));
        assertEquals(0, service.divide(0, 2));
        assertEquals(2, service.divide(-4, -2));
        assertThrows(IllegalArgumentException.class, () -> service.divide(2, 0));
    }



}

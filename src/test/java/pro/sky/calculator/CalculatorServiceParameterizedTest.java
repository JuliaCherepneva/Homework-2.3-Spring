package pro.sky.calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceParameterizedTest {
    private final CalculatorServiceImpl service = new CalculatorServiceImpl ();

    @ParameterizedTest
    @MethodSource ("arguments")
    void testPlus(int a, int b){
        assertEquals(a + b, service.plus(a,b));
    }

    @ParameterizedTest
    @MethodSource ("arguments")
    void testMinus(int a, int b){
        assertEquals(a - b, service.minus(a,b));
    }

    @ParameterizedTest
    @MethodSource ("arguments")
    void testMultiply(int a, int b){
        assertEquals(a * b, service.multiply(a,b));
    }

    @ParameterizedTest
    @MethodSource ("arguments")
    void testDivide(int a, int b){
        if (b == 0) {
            assertThrows(IllegalArgumentException.class, () -> service.divide(a, b));
            return;
        }
        assertEquals(a / b, service.divide(a,b));
    }


    private static Stream<Arguments> arguments () {
        return Stream.of(
                Arguments.of(1,2),
                Arguments.of(-1,2),
                Arguments.of(1,-2),
                Arguments.of(-1,-2),
                Arguments.of(0,2),
                Arguments.of(2,0));
    }
}

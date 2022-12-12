package assignment1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void multiply() {
        Calculator calc = new Calculator();

        assertEquals(2, calc.multiply(2,1));
        assertEquals(0, calc.multiply(0,70));
    }

    @Test
    void divide() {
        assertThrows(ArithmeticException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                Calculator calc = new Calculator();
                calc.divide(3,0);
            }
        });
    }
}
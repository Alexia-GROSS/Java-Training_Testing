package assignment1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    public Calculator calc = new Calculator();

    @Test
    void multiply() {
        assertEquals(2, calc.multiply(2,1));
        assertEquals(0, calc.multiply(0,70));
    }

    @Test
    void divide() {
        assertThrows(ArithmeticException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                calc.divide(3,0);
            }
        });
    }

    @Test
    void sum(){
        assertEquals(4, calc.sum(2, 2));
    }

    @Test
    void substract(){
        assertEquals(8, calc.substract(10, 2));
    }
}
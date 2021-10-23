import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    //Alt-Einfg
    Calculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void add() {
        int a = 1;
        int b = 2+3;
        double result = calculator.add(a,b);
        Assertions.assertEquals(3, result);
    }

    @Test
    void subtract() {
        int a = 2;
        int b= 3;
        double subtract = calculator.subtract(b,a);
        Assertions.assertEquals(1,subtract);
    }

    @Test
    void multiply() {
        Assertions.assertEquals(4,calculator.multiply(2,2));
        Assertions.assertEquals(4,calculator.multiply(3,3));
    }

    @Test
    void divide() {
    }

    @Test
    void modulo() {
    }

    @Test
    void sum() {
    }

    @Test
    void printResult() {
    }
}
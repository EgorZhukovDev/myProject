package util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void sumTestMethod() {
        int sum = calculator.sum(10, 15);
        Assertions.assertEquals(25, sum);
 }
     @Test
    public void evenOrOdd_evenNumber() {
        boolean even = calculator.evenOrOdd(10);
        Assertions.assertTrue(even);

 }

    @Test
    public void evenOrOdd_oddNumber() {
        boolean odd = calculator.evenOrOdd(9);
        Assertions.assertFalse(odd);
    }

    @Test
    public void divideTestMethod() {
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }
}

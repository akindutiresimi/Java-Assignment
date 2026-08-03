import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test

    public void testThatIAdd2NumbersResultIsNumberOnePlusNumberTwo() {

    Calculator calc = new Calculator();

    int result = calc.add(3, 4);

    int expected = 7;

    assertEquals(expected, result);
    }

    @Test
    public void testThatISubtractTwoNumbersDifferenceIsNumberOneMinusNumberTwo() {
    Calculator calc = new Calculator();
    int difference = calc.subtract(9, 4);
    int expected = 5;
    assertEquals(expected , difference );
    }

    @Test
    public void testDivideByZeroArithmeticExceptionIsThrown() {
    Calculator calc = new Calculator();
    assertThrows(ArithmeticException.class, () -> calc.divide(10, 0));
}

}

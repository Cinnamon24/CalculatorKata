package calculator;

import calculator.impl.CalculatorImpl;
import calculator.impl.KataCalculatorImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final String DEPRECATION = "deprecation";
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new KataCalculatorImpl();
    }


    @Test
    public void shouldReturnSumOfTwoDigitsWhenFunctionExecute() {
        calculator = new CalculatorImpl();
        assertEquals(8d, calculator.add(3.0, 5), 0);
    }

    @Test
    public void shouldReturnZeroWhenStringIsEmpty() {
        assertEquals(ZERO, calculator.add(""));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void shouldThrowUnsupportedOperationExceptionWhenParamsAreIntegers() {
        assertEquals(ZERO, calculator.add(ZERO, ZERO));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void shouldThrowUnsupportedOperationExceptionWhenParamsAreDoubles() {
        assertEquals(5d, calculator.add(3.0, 2.0), 0);
    }

    @Test
    public void shouldReturnDigitWhenStringContainOneNumber() {
        assertEquals(ONE, calculator.add("1"));
    }

    @Test
    public void shouldReturnCorrectResultWhenStringContainTwoNumbers() {
        assertEquals(3, calculator.add("1,2"));
    }
}

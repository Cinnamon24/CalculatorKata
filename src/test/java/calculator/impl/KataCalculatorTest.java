package calculator.impl;

import calculator.Calculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataCalculatorTest {
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new KataCalculatorImpl();
    }

    @Test
    public void shouldReturnZeroWhenStringIsEmpty() {
        assertEquals(ZERO, calculator.add(""));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void shouldThrowUnsupportedOperationExceptionWhenParamsAreIntegers() {
        calculator.add(ZERO, ZERO);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void shouldThrowUnsupportedOperationExceptionWhenParamsAreDoubles() {
        calculator.add(3.0, 2.0);
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

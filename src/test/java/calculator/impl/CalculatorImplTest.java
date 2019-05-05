package calculator.impl;

import calculator.Calculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorImplTest {
    private static final String EMPTY_STRING = "";
    private static final double DOUBLE_THREE = 3.0;
    private static final int INTEGER_THREE = 3;
    private static final double DOUBLE_EXPECTED_RESULT = 6.0;
    private static final int INTEGER_EXPECTED_RESULT = 6;
    private static final int ZERO = 0;

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new CalculatorImpl();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void shouldThrowUnsupportedOperationExceptionWhenParamsIsString() {
        calculator.add(EMPTY_STRING);
    }

    @Test
    public void shouldReturnSumOfTwoNumbersWhenFunctionExecute() {
        assertEquals(INTEGER_EXPECTED_RESULT, calculator.add(INTEGER_THREE, INTEGER_THREE));
    }

    @Test
    public void shouldReturnSumOfTwoNumbersWithFloatPointWhenFunctionExecute() {
        assertEquals(DOUBLE_EXPECTED_RESULT, calculator.add(DOUBLE_THREE, DOUBLE_THREE), ZERO);
    }
}
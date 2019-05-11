package calculator.impl;

import calculator.Calculator;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class KataCalculatorImpl implements Calculator {
    private static final int ZERO = 0;


    @Override
    public int add(String numbers) {
        return StringUtils.isEmpty(numbers) ? ZERO : calculate(numbers.split(","));
    }

    @Override
    public int add(int first, int second) {
        throw new UnsupportedOperationException();
    }

    @Override
    public double add(double first, double second) {
        throw new UnsupportedOperationException();
    }

    private int calculate(String[] numbersArray) {
        return Arrays.stream(numbersArray).map(Integer::parseInt).reduce(Integer::sum).get();
    }
}
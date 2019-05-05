package calculator.impl;

import calculator.Calculator;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class KataCalculatorImpl implements Calculator {
    private static final int ZERO = 0;
    private static final int MAX_AVAILABLE_SIZE = 2;

    @Override
    public int add(String numbers) {
        int sum = ZERO;
        if (StringUtils.isEmpty(numbers)) {
            return sum;
        } else {
            String[] numbersArray = numbers.split(",");
            sum = calculate(numbersArray);
        }

        return sum;
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
        if (numbersArray.length > MAX_AVAILABLE_SIZE) {
            throw new IllegalArgumentException();
        }

        return Arrays.stream(numbersArray).map(Integer::parseInt).reduce(Integer::sum).get();
    }
}
package calculator.impl;

import calculator.Calculator;

import java.security.InvalidParameterException;
import java.util.Arrays;

public class KataCalculatorImpl implements Calculator {
    @Override
    public int add(String numbers) {
        int sum = 0;
        if (numbers.isEmpty()) {
            return 0;
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
        if (numbersArray.length > 2) {
            throw new IllegalArgumentException();
        }
        if (numbersArray.length == 1) {
            return Integer.parseInt(numbersArray[0]);
        }
        return Integer.parseInt(numbersArray[0]) + Integer.parseInt(numbersArray[1]);
    }
}
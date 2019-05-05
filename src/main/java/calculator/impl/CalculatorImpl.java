package calculator.impl;

import calculator.Calculator;

public class CalculatorImpl implements Calculator {
    @Override
    public int add(String numbers) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int add(int first, int second) {
        return first + second;
    }

    @Override
    public double add(double first, double second) {
        return first + second;
    }
}

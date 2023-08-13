package com.bin.tdd;

public class AiCalculator {

    private Calculator calculator;

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public int divBySum(int start, int end, int div) {
        return calculator.sum(start, end) / div;
    }
}

package com.bin.tdd;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorTest {

    @DataProvider(name = "testCase")
    public Object[][] testCase() {
        return new Object[][]{
                {1, 1, 2},
                {1, 100, 5050},
                {100, 1, 5050},
                {-100, 100, 0},
                {-100, -99, -199},
                {1, 10000, 50005000}
        };
    }

    @Test(dataProvider = "testCase")
    public void sum(int start, int end, int expected) {
        Calculator calculator = new Calculator();

        int result = calculator.sum(start, end);

        Assertions.assertEquals(expected, result);
    }


}

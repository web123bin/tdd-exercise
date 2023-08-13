package com.bin.tdd;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AiCalculatorTest {

    private AiCalculator aiCalculator;
    private Calculator calculator;

    @BeforeTest
    public void before() {
        aiCalculator = new AiCalculator();
        calculator = mock(Calculator.class);
        aiCalculator.setCalculator(calculator);
    }

    @DataProvider(name = "testCase")
    public Object[][] testCase() {
        return new Object[][]{
                {1, 1, 2, 1, 2},
                {2, 2, 4, 2, 2}
        };
    }

    @Test(dataProvider = "testCase")
    public void divBySum(int start, int end, int mockSum, int div, int expected) {
        when(calculator.sum(start, end)).thenReturn(mockSum);

        int result = aiCalculator.divBySum(start, end, div);

        Assertions.assertEquals(expected, result);
    }

}

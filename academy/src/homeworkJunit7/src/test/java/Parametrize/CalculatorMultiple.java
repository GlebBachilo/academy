package Parametrize;

import by.academy.Junit.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class CalculatorMultiple extends Assert {

    private int value1;
    private int value2;
    private int result;

    public CalculatorMultiple(int value1, int value2, int result) {
        this.value1 = value1;
        this.value2 = value2;
        this.result = result;
    }

    @Parameterized.Parameters(name = "{index}:getSum({0}*{1})={2}")
    public static Iterable<Object> dataForMultiple() {
        return Arrays.asList(
                new Object[][]{{5, 3, 15}, {4, 5, 20}, {6, 3, 12}});
    }

    @Test
    public void testMultiple() {
        assertEquals(result, Calculator.getMultiple(value1, value2));
    }

    @Test
    public void test() {
        assertEquals(10, Calculator.getMultiple(5, 2));
    }
}
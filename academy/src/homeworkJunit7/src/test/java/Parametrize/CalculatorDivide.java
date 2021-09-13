package Parametrize;

import by.academy.Junit.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class CalculatorDivide extends Assert {

    private int value1;
    private int value2;
    private int result;

    public CalculatorDivide(int value1, int value2, int result) {
        this.value1 = value1;
        this.value2 = value2;
        this.result = result;
    }

    @Parameterized.Parameters(name = "{index}:getDivide({0}/{1})={2}")
    public static Iterable<Object[]> dataForDivide() {
        return Arrays.asList(
                new Object[][]{{3,1,3},{17,5,3},{18,3,6}});
    }

    @Test
    public void testDivide() {
        assertEquals(result, Calculator.getDivide(value1, value2));
    }

    @Test
    public void test() {
        assertEquals(5, Calculator.getDivide(15,3 ));
    }
}
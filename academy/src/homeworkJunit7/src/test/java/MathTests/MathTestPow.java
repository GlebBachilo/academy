package MathTests;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class MathTestPow extends Assert {


    @Test
    public void test1() {
        Math.pow(-5,2);
    }
    //@Ignore
    @Test
    public void test2() {
        assertEquals(23,Math.pow(5,2),0.000001);
    }

}


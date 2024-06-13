package day1;

import org.checkerframework.checker.units.qual.C;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTests {

    @Test
    public void testCalculator1(){
        Calculator calculator = new Calculator();
        double expected = 2.5;
        Assert.assertEquals(calculator.divide(10,4), 2.5);
    }

    @Test
    public void testCalculator2(){
        Calculator calculator = new Calculator();
        double expected = 2.5;
        Assert.assertEquals(calculator.divide(0,0), Double.NaN);
    }
}

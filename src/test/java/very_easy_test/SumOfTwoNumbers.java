package very_easy_test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SumOfTwoNumbers {
    public static int sum(int a, int b) {
        return a + b;
    }

    @Test
    public void testSum(){
        Assert.assertEquals(SumOfTwoNumbers.sum(3,2), 5);
    }

    @Test
    public void testSum1(){
        Assert.assertEquals(SumOfTwoNumbers.sum(-3,-6), -9);
    }

    @Test
    public void testSum2(){
        Assert.assertEquals(SumOfTwoNumbers.sum(7,3), 10);
    }
}

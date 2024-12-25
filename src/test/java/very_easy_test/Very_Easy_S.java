package very_easy_test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Very_Easy_S {


    public static int convert(int minutes) {
        return minutes * 60;

    }

    @Test
    public void testConvert(){
        Assert.assertEquals(300,convert(5));
    }

    @Test
    public void testConvert1(){
        Assert.assertEquals(180, convert(3));
    }
    @Test
    public void testConvert2(){
        Assert.assertEquals(120, convert(2));
    }

    @Test
    public void testConvert3(){
        Assert.assertEquals(0, convert(0));
    }

    @Test
    public void testConvert4(){
        Assert.assertEquals(-60, convert(-1));
    }
}

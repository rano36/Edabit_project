package hard;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Program {

    public static String checkSeven(int [] arr){
        for (int num : arr){
            if (String.valueOf(num).contains("7")){
                return "Boom!";
            }
        }
        return "There is no number 7 in the array";
    }

    @Test
    public void checkSevenTest(){
        Assert.assertEquals(checkSeven(new int[]{1, 2, 3, 4, 5, 6, 7}), "Boom!");
    }

    @Test
    public void checkSevenTest1(){
        Assert.assertEquals(checkSeven(new int[]{8, 6, 33, 100}), "There is no number 7 in the array");
    }

    @Test
    public void checkSevenTest2(){
        Assert.assertEquals(checkSeven(new int[]{2, 55, 60, 97, 86}), "Boom!");
    }
}

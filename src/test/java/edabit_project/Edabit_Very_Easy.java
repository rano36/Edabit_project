package edabit_project;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Edabit_Very_Easy {
    public static int increment(int number) {
        return number + 1;
    }
    @Test
    public void testIncrement() {
        int input = 7;
        int expected = 8;
        int result = Edabit_Very_Easy.increment(input);
        Assert.assertEquals(expected, result);  
    }
}

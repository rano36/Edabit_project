package edabit_project;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Edabit_Easy {
        public static boolean checkEnding(String str1, String str2) {
            return str1.endsWith(str2);
        }
        @Test
        public void testChekingTrue(){
            Assert.assertTrue(Edabit_Easy.checkEnding("abc", "bc"));
            Assert.assertTrue(Edabit_Easy.checkEnding("feminine", "nine"));
        }
        @Test
        public void testCheckingFalse(){
            Assert.assertFalse(Edabit_Easy.checkEnding("abc", "d"));
            Assert.assertFalse(Edabit_Easy.checkEnding("samurai", "zi"));
            Assert.assertFalse(Edabit_Easy.checkEnding("convention", "tio"));
        }

    }




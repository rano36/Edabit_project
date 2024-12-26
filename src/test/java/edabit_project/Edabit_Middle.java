package edabit_project;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Edabit_Middle {
        public static List<Double> otherSides(double x) {
            double hypotenuse = 2 * x;
            double otherSide = x * Math.sqrt(3);
            List<Double> sides = new ArrayList<>();
            sides.add(Math.round(hypotenuse * 100.0) / 100.0);
            sides.add(Math.round(otherSide * 100.0) / 100.0);

            return sides;
        }
        @Test
        public void testOtherSides() {
            List<Double> result = Edabit_Middle.otherSides(1);
            Assert.assertEquals(2.0, result.get(0));
            Assert.assertEquals(1.73, result.get(1));

            result = Edabit_Middle.otherSides(12);
            Assert.assertEquals(24.0, result.get(0));
            Assert.assertEquals(20.78, result.get(1));

            result = Edabit_Middle.otherSides(2);
            Assert.assertEquals(4.0, result.get(0));
            Assert.assertEquals(3.46, result.get(1));

            result = Edabit_Middle.otherSides(3);
            Assert.assertEquals(6.0, result.get(0));
            Assert.assertEquals(5.2, result.get(1));
        }
    }



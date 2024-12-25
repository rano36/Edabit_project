package edabit_project;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Edabit_Very_Easy {
    public static int increment(int number) {
        return number + 1;
    }
    @Test
    public void testIncrement() {
        int input = 7;  // Пример входного числа
        int expected = 8;  // Ожидаемый результат
        int result = Edabit_Very_Easy.increment(input);  // Вызов функции
        Assert.assertEquals(expected, result);  // Проверка, что результат совпадает с ожиданием
    }
}

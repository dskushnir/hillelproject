package ua.hillel.dskushnir.lesson02;

import org.junit.Assert;
import org.junit.Test;

public class Task6Test {
    @Test
    public void shouldSumArray() {
        int[] array = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int sum = Task6.sumArray(array);
        Assert.assertEquals(10, sum);
    }
}

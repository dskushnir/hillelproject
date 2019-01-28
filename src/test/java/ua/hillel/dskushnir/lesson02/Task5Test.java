package ua.hillel.dskushnir.lesson02;

import org.junit.Assert;
import org.junit.Test;

public class Task5Test {
    @Test
    public void shouldTwoDivArray() {
        int[] array = {2,1,1,1,1,1,1,2,2,1};
        int []TwoDivArray = Task5.DivTwoElem(array);
        int[]test={2,2,2};
        Assert.assertArrayEquals(test,TwoDivArray);

    }
}

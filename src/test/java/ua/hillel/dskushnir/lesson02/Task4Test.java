package ua.hillel.dskushnir.lesson02;

import org.junit.Assert;
import org.junit.Test;

public class Task4Test {
    @Test
    public void shouldThreeDivArray() {
        int[] array = {1,2,3,4,5,6,7,8,9,12};
        int []ThreeDivArray = Task4.DivThreeElem(array);
        int[]test={3,6,9,12};
        Assert.assertArrayEquals(test,ThreeDivArray);

    }
}

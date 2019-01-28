package ua.hillel.dskushnir.lesson02;

import org.junit.Assert;
import org.junit.Test;

public class Task1Test {
    @Test
    public void shouldFiveArray() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 12};
        int[] fiveElementArray = Task1.printFirsFiveArrayElements(array);
        int[] test = {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(test, fiveElementArray);


    }
}

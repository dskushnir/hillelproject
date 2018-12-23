package ua.hillel.dskushnir.lesson02;

import org.junit.Assert;
import org.junit.Test;

public class Task8Test {
    @Test
    public void shouldMinArray(){
        int[]array={1,2,3,4,5,6,7,8,9,10};
        int min=Task8.minArray(array);
        Assert.assertEquals(1,min);

    }
    @Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
    public void shouldMinArray2() {
        int[] array = new int[0];
        int min = Task8.minArray(array);
        Assert.assertEquals(1, min);
    }

    @Test
    public void shouldMaxArray(){
        int[]array={1,2,3,4,5,6,7,8,9,10};
        int min=Task8.minArray(array);
        Assert.assertEquals(1,min);

    }
    @Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
    public void shouldMaxArray2() {
        int[] array = new int[0];
        int min = Task8.minArray(array);
        Assert.assertEquals(1, min);
    }
    @Test
    public void shouldMinMaxArray(){
        int[]array={1,2,3,4,5,6,7,8,9,10};
        int sum= Task8.sumMinMaxArray(array);
        Assert.assertEquals(11,sum);

    }

}

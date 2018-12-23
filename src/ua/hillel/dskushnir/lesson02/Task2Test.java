package ua.hillel.dskushnir.lesson02;

import org.junit.Assert;
import org.junit.Test;

public class Task2Test {
    @Test
    public void shouldInitArray(){
        int[]array=new int[15];
        int[]arr=Task2.initArray(array,15);
        int[]test={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Assert.assertArrayEquals(test,arr);
    }
}

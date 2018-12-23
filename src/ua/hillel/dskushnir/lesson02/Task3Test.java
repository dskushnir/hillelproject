package ua.hillel.dskushnir.lesson02;

import org.junit.Assert;
import org.junit.Test;

public class Task3Test {
    @Test
    public void shouldInitArray(){
        int[]array=new int[15];
        int[]arr=Task3.initArray(array,15);
        int[]test={15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
        Assert.assertArrayEquals(test,arr);
    }

}

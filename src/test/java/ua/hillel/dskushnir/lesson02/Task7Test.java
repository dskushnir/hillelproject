package ua.hillel.dskushnir.lesson02;

import org.junit.Assert;
import org.junit.Test;

public class Task7Test {

    @Test
    public void shouldAverageArray(){
        int[] array = {10, 1, 10, 1, 10, 1, 10, 1, 10, 1};
        double test =5.5;
        double ave=Task7.average(array);
        Assert.assertEquals(test,ave,0.00001);
    }
}





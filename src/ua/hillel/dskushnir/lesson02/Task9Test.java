package ua.hillel.dskushnir.lesson02;


import org.junit.Assert;
import org.junit.Test;

public class Task9Test {
    @Test
    public void shouldMultiplicArray(){
       int[]array={1,1,1,1,1,1,1,1,3,3};
       int mult=Task9.multiplicArray(array);
        Assert.assertEquals(9,mult);



    }
}

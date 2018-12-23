package ua.hillel.dskushnir.lesson02;

import org.junit.Assert;
import org.junit.Test;

public class Task10Test {
    @Test
    public void shouldIndexOfArray(){
        int[] array = {14, 45, 75, 5, 99, 110, 5, 75, 9, 65};
        int index=Task10.indexOf(array,5);
        Assert.assertEquals(3,index);
    }
    @Test
    public void shouldIndexOfArray2() {
        int[] array = {14, 45, 75, 5, 99, 110, 5, 75, 9, 65};
        int index = Task10.indexOf(array, 70);
        Assert.assertEquals(-1, index);
    }

}

package ua.hillel.dskushnir.lesson04;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Task2 {
    public static void main(String[] args) {
        int pill1 = 10;
        int pill2 = 11;
        int[] pillsOnScale = new int[10];

        initArray1(pillsOnScale, pill1);
        replaceArray(pillsOnScale,pill2);
        System.out.println("Put 1 pill from the first bottle,2 pills - from the second bottle, 3 pills - from the third bottle -and so on--on the scale ");
        printArray(pillsOnScale);
        System.out.println("Weight of pills =  "+sumArray(pillsOnScale));
        System.out.println("Number of bottle with non-standard pills =" +lastDigit(sumArray(pillsOnScale)));

    }
    private static void initArray1(int[] array, int pill1) {
        for (int i = 0; i < array.length; i++) {
            array[i] = pill1 * (i + 1);
        }
    }
    private static void replaceArray(int []array,int pills2){
        int index = (int)(Math.random()*10)+1;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                array[index] = pills2 * (index + 1);
            }
        }
    }
    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    private static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
    private static int lastDigit(int number) {
        return number % 10; }
}










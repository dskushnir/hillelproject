package ua.hillel.dskushnir.lesson04;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Task2 {
    public static void main(String[] args) {
        int[]scales = new int[];
        shakeArray(scales);
        System.out.println("Bottle of pills");
        printArray(scales);
        System.out.println("Non-standard mass in position =" + indexOfNonstandartMass(scales));
        System.out.println("Non-standard mass in position =" + indexOf(scales));


    }


    private static void shakeArray(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            Random random = new Random();
            int k = random.nextInt(i + 1);
            int a = array[k];
            array[k] = array[i];
            array[i] = a;
        }
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }

    private static int indexOfNonstandartMass(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length + 1; i++) {
            if (array[i] % 10 != 0) {
                index = i + 1;
                break;
            }
        }
        return index;
    }

    public static int indexOf(int[] arr) {
        return IntStream.range(0, arr.length).filter(i -> arr[i] % 10 != 0).findFirst().orElse(-1) + 1;
    }

}







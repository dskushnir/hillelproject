package ua.hillel.dskushnir.lesson04;

import java.awt.*;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] bottlOfPills = {200, 120, 150, 180, 300, 240, 100, 210, 160, 121};
        shakeArray(bottlOfPills);
        System.out.println("Bottle of pills");
        printArray(bottlOfPills);
        System.out.println("Non-standard mass in position =" + indexOfNonstandartMass(bottlOfPills));
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
            if (array[i] % 11 == 0) {
                index = i + 1;
                break;
            }
        }
        return index;
    }

}


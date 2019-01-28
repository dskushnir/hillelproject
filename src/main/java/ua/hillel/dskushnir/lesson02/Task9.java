package ua.hillel.dskushnir.lesson02;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number>0");
        int n = myScanner.nextInt();
        int[]array=new int[n];
        int[]result=initArray(array,n);
        printArray(result);
        System.out.println("product of odd elements =" + multiplicArray(result));
    }
    public static int[]initArray(int[]array,int n) {
        if (n==0 || n<0){
            throw new IllegalArgumentException("Value of n <0 or n+0, enter n>0");
        }

        for (int i = 0; i < n; i++) {
            array[i] = i+n;
        }
        return array;
        }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static int multiplicArray(int[] array) {
        if (array.length == 0 || array.length < 0) {
            throw new IllegalArgumentException("Value of array.length <0 or array.length=0");
        }

        int mult = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                mult *= array[i];
            }
        }
        return mult;
    }
}

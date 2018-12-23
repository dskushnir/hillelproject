package ua.hillel.dskushnir.lesson02;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number>0");
        int n = myScanner.nextInt();
        int[]array=new int[n];
        int[]result=initArray(array,n);
        printArray(result);
        System.out.println(sumArray(result));


    }
    public static int[]initArray(int[]array,int n) {
        if (n==0 || n<0){
            throw new IllegalArgumentException("Value of n <0 or n+0, enter n>0");
        }

        for (int i = 0; i < n; i++) {
            array[i] = i+ n*2;
        }
        return array;

    }
    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static int sumArray(int[]array) {
        if (array.length == 0 || array.length < 0) {
            throw new IllegalArgumentException("Value of array.length <0 or array.length=0");
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}

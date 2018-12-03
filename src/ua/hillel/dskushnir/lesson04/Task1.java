package ua.hillel.dskushnir.lesson04;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Enter  sequence of 10 elements =");
        for (int i = 0; i < array.length; i++) {
            array[i] = myScanner.nextInt();
        }
        int[] number = new int[1];
        System.out.println("Enter 1 number =");
        for (int i = 0; i < number.length; i++) {
            number[i] = myScanner.nextInt();
        }
        int[]result=new int[array.length+number.length];
        mergArray(result,array,number);
        System.out.println(" New result array =");  printArray(result);
    }
    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }
    private static  void mergArray(int[]result,int[] array, int[] number) {
        int arrayIndex = 0;
        int numberIndex = 0;
        int index = 0;

        while (arrayIndex < array.length && numberIndex < number.length) {

            if (array[arrayIndex] < number[numberIndex]) {
                result[index] = array[arrayIndex];
                arrayIndex++;
            } else {
                result[index] = number[numberIndex];
                numberIndex++;
            }
            index++;
        }
        while (arrayIndex < array.length) {
            result[index] = array[arrayIndex];
            arrayIndex++;
            index++;
        }
        while (numberIndex < number.length) {
            result[index] = number[numberIndex];
            numberIndex++;
            index++;
        }

    }
}

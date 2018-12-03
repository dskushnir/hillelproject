package ua.hillel.dskushnir.lesson02;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        int[] array = {10, 45, 70, 5, 99, 100, 5, 75, 9, 65};
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = myScanner.nextInt();
        numeric(array, n);
    }
    private static void numeric(int[] array, int n) {
        int counter =0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n){
                counter++;
                System.out.println("Number found.Index of number = " + i);
            }
            else if (i==array.length-1 && counter==0){
                System.out.println("Number not found");
            }
        }
    }
}

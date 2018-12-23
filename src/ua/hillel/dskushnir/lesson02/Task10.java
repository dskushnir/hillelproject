package ua.hillel.dskushnir.lesson02;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Task10{
    public static void main(String[] args) {
        int[] array = {10, 45, 70, 5, 99, 100, 5, 75, 9, 65};
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = myScanner.nextInt();
        int index =indexOf(array,n);
        if (index!=-1){
            System.out.println("Value is found, index of value ="+ index);
        }else {
            System.out.println("Value is not found");
        }
    }

        public static int indexOf(int[] arr, int n) {
            if (arr.length == 0 || arr.length < 0) {
                throw new IllegalArgumentException("Value of array.length <0 or array.length=0");
            }

            return IntStream.range(0, arr.length).filter(i -> arr[i] == n).findFirst().orElse(-1);
            }
}

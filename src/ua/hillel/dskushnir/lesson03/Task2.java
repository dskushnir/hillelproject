package ua.hillel.dskushnir.lesson03;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number");
        System.out.println();
        int number = myScanner.nextInt();
        String convert = Integer.toBinaryString(number);
        System.out.println("Nuumber to binary =" + convert);
        System.out.println("Amount of symbol One =" + countOfOneToBinaryNumber(convert));
    }

    private static int countOfOneToBinaryNumber(String convert) {
        int counter = 0;
        if ( convert.isEmpty()) {
            System.out.println("String is empty");
        } else {
            for (int i = 0; i < convert.length(); i++) {
                if (convert.charAt(i) == '1') {
                    counter++;
                }
            }
        }
        return counter;
    }
}

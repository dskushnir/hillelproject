package ua.hillel.dskushnir.lesson03;

import java.util.Scanner;

public class Task2OutOfBinaryString {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number");
        System.out.println();
        int number = myScanner.nextInt();
        System.out.println("Nuumber to binary ="+ toBinaryNumber(number));
        System.out.println("Amount of symbol One =" + countOfOneToBinaryNumber(toBinaryNumber(number)));
    }
    private static String toBinaryNumber(int number) {

        StringBuilder convert = new StringBuilder();
        while (number > 0) {
            convert.insert(0, number& 1);
            number>>= 1;
        }
        if (convert.length() == 0) convert.append("0");
        return convert.toString();
    }
    private static int countOfOneToBinaryNumber(String convert) {
        int counter = 0;
        if (convert == null && convert.isEmpty()) {
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


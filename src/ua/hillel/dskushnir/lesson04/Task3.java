package ua.hillel.dskushnir.lesson04;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number > 2");
        int number = myScanner.nextInt();
        System.out.println("Prime number < " + number);
        primeNumber(number);
    }
    private static void primeNumber(int number){
        for (int n = 2; n <= number; n++) {
            boolean primeNumber = true;
            for (int p = 2; p <= Math.sqrt(n-1); p++) {
                if (n % p == 0) {
                    primeNumber = false;
                    break;
                }
            }
            if (primeNumber) {
                System.out.print(n + ",");
            }
        }
    }
}

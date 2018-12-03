package ua.hillel.dskushnir.lesson04;

public class Task5 {
    public static void main(String[] args) {
        int n = 20;
        for (int i = 1; i <= n; i++)
            System.out.println( + nunberFibonacci(i));
    }
    private static int nunberFibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {
            return nunberFibonacci(n - 1) + nunberFibonacci(n - 2);
        }
    }
}

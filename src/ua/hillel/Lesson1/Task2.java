package ua.hillel.Lesson1;

public class Task2 {
    public static void main(String[] args) {
        int n = 10;
        int m = 10;
        int[][] array = new int[n][m];
        initRandomArray(array,100,200);
        printArray(array);
    }
    private static void initRandomArray(int[][] array, int a, int b) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] =( int) (Math.random()*(a-b)+a);
            }
        }
    }
    private static void printArray(int[][] array) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

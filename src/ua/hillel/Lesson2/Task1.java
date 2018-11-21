package ua.hillel.Lesson2;

public class Task1 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        initRandomArray(array, 20, 40);
        printArray(array);
        printFirsFiveArrayElements(array);
    }

    private static void initRandomArray(int[] array, int a, int b) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (a - b) + a);
        }
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void printFirsFiveArrayElements(int[] array) {
        for (int i = 0; i < 5; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

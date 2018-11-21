package ua.hillel.Lesson2;

public class Task5 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        initRandomArray(array, 10, 20);
        printArray(array);
        printDivTwoElem(array);
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
    private static void printDivTwoElem(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 ) {
                System.out.print(array[i] + " ");
            }
        }
    }
}

package ua.hillel.Lesson2;

public class Task9 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        initRandomArray(array, 10, 20);
        printArray(array);
        System.out.println("product of odd elements =" + multiplicArray(array));
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
    private static int multiplicArray(int[] array) {
        int mult = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                mult *= array[i];
            }
        }
        return mult;
    }
}

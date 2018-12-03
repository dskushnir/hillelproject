package ua.hillel.dskushnir.lesson02;

public class Task4 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        initRandomArray(array, 10, 20);
        printArray(array);
        printDivThreeElem(array);
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
    private static void printDivThreeElem(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0 ) {
                System.out.print(array[i] + " ");
            }
        }
    }
}

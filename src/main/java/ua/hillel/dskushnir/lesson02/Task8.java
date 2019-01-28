package ua.hillel.dskushnir.lesson02;

public class Task8 {
    public static void main(String[] args) {

        int n =10;
        int[] array = new int[n];
        initRandomArray(array, 10, 20);
        printArray(array);
        System.out.println("sum min + max  ="+ sumMinMaxArray(array));
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
    public static int minArray(int[]array) {
        if (array.length == 0 || array.length < 0) {
            throw new IllegalArgumentException("Value of array.length <0 or array.length=0");
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    public static int maxArray(int[]array) {
        if (array.length == 0 || array.length < 0) {
            throw new IllegalArgumentException("Value of array.length <0 or array.length=0");
        }
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    public static int sumMinMaxArray(int[]array) {
        if (array.length == 0 || array.length < 0) {
            throw new IllegalArgumentException("Value of array.length <0 or array.length=0");
        }
        return   minArray(array) + maxArray(array);
    }
}

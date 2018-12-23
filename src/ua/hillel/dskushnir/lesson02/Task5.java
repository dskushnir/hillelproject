package ua.hillel.dskushnir.lesson02;

public class Task5 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        initRandomArray(array, 10, 20);
        printArray(array);
        int[] result = DivTwoElem(array);
        printArray(result);
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

    public static int[] DivTwoElem(int[] array) {
        if (array.length == 0 || array.length < 0) {
            throw new IllegalArgumentException("Value of array.length <0 or array.length=0");
        }
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                counter++;
            }
        }
        int[] result = new int[counter];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                result[index] = array[i];
                index++;
            }
        }
        return result;
    }
}

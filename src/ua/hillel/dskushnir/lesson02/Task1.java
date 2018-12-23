package ua.hillel.dskushnir.lesson02;


public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        initRandomArray(array, 10, 20);
        printArray(array);
        int[] result = printFirsFiveArrayElements(array);
        printArray(result);
    }

    private static void initRandomArray(int[] array, int a, int b) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (b - a + 1) + a);
        }
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] printFirsFiveArrayElements ( int[] array){
                int counter = 5;
                int[] result = new int[counter];
                int index = 0;
                for (int i = 0; i < result.length; i++) {
                    result[index] = array[i];
                    index++;
                }
                return result;
            }
}


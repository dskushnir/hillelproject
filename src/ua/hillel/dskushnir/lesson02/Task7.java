package ua.hillel.dskushnir.lesson02;



public class Task7 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        initRandomArray(array, 10, 20);
        printArray(array);
        System.out.println("average ="+ average(array));
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



   public static double average(int[]array) {
        if (array.length == 0 || array.length < 0) {
            throw new IllegalArgumentException("Value of array.length <0 or array.length=0");
        }
        double average = 0;
        double sum = 0;
        double length = (double)array.length;
        for (int j = 0; j < array.length; j++) {
             sum += (double)array[j];

            average = sum / length;
        }
        return average;
    }





}

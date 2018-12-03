package ua.hillel.dskushnir.lesson02;

public class Task2 {
    public static void main(String[] args) {
        int c=1;
        int b= 20;
        int n=(int) (Math.random() * (b-c+1) + c);
        int[] array = new int[n];
        initRandomArray(array,1,n);
        printArray(array);
    }
    private static void initRandomArray(int[]array, int a, int b) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (b-a+1) + a);
        }
    }
    private static void printArray(int[]array){
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}

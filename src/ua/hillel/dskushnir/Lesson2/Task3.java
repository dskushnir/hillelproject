package ua.hillel.dskushnir.Lesson2;

public class Task3 {
    public static void main(String[] args) {
        int c = 1;
        int b = 20;
        int n = (int) (Math.random() * (b - c + 1) + c);
        int[] array = new int[n];
        initArray(array);
        printArray(array);
    }
    private static void initArray(int[]array) {
        for (int i = 0; i < array.length ; i++) {
            array[i] = array.length-i ;
        }
    }
    private static void printArray(int[]array){
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}

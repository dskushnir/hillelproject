package ua.hillel.dskushnir.lesson04;

import java.util.Random;
import java.util.stream.IntStream;


public class Task4 {
    public static void main(String[] args) {
        int[][] chessboard = new int[8][8];
        initChessboard(chessboard);
        shuffle(chessboard);
        printArray(chessboard);
        System.out.println();

        int[] sumOfRows = sumArrayRows(chessboard);

        int[] sumOfColumn = sumArrayColumns(chessboard);

        if ((isBeats(sumOfRows)>0)||(isBeats(sumOfColumn)>0)){
            System.out.println("Beats" );
        }else {
            System.out.println("Not beats");
        }
    }
    private static void initChessboard(int[][] chessboard) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 1; j++) {
                chessboard[i][j] = 1;
            }
        }
        for (int i = 4; i < 8; i++) {
            for (int j = 4; j < 8; j++) {
                chessboard[i][j] = 0;

            }
        }
    }
    private static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static void shuffle(int[][] array) {
        Random random = new Random();

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = array[i].length - 1; j > 0; j--) {
                int m = random.nextInt(i + 1);
                int n = random.nextInt(j + 1);
                int temp = array[i][j];
                array[i][j] = array[m][n];
                array[m][n] = temp;
            }
        }
    }
    private static int[] sumArrayRows(int[][] array) {
        int[] sumOfRows = new int[array.length];
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[0].length; j++)
                sumOfRows[i] += array[i][j];
        return sumOfRows;
    }
    private static int[] sumArrayColumns(int[][] array) {
        int index = 0;
        int sumOfColumns[] = new int[array[index].length];
        for (int i = 0; i < array[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum += array[j][i];
            }
            sumOfColumns[index] = sum;
            index++;
        }
        return sumOfColumns;
    }
    private static int isBeats (int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > 1)
                count ++;
        }
        return count;
    }
}












































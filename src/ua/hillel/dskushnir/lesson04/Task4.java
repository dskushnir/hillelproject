package ua.hillel.dskushnir.lesson04;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[][] chessboard = new int[8][8];
        initChessboard(chessboard);
        shuffle(chessboard);
        printArray(chessboard);



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


}








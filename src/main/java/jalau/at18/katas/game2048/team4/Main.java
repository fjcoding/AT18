package jalau.at18.katas.game2048.team4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static int[][] matrix = new int [4][4];
    public static void main(String[] args) {
        int min = 0;
        int max = 3;
        int randomPositionX = ThreadLocalRandom.current().nextInt(min, max + 1);
        int randomPsotionY = ThreadLocalRandom.current().nextInt(min, max + 1);
        System.out.println(randomPositionX);
        System.out.println(randomPsotionY);
        System.out.println(matrix.length);
        showMatrix();
    }

    static int[][] createMatrix(int randomPositionX, int randomPsotionY) {
        matrix[0][0] = 0;
        matrix[0][1] = 0;
        matrix[0][2] = 0;
        matrix[0][3] = 0;
        matrix[1][0] = 0;
        matrix[1][1] = 0;
        matrix[1][2] = 0;
        matrix[1][3] = 0;
        matrix[2][0] = 0;
        matrix[2][1] = 0;
        matrix[2][2] = 0;
        matrix[2][3] = 0;
        matrix[3][0] = 0;
        matrix[3][1] = 0;
        matrix[3][2] = 0;
        matrix[3][3] = 0;

        matrix [randomPositionX][randomPsotionY]= 2;
        matrix [randomPositionX][randomPsotionY]= 4;

    return matrix;

    }

    static void showMatrix ( ){
        for (int index = 0; index < matrix.length; index++){
            for (int jIndex = 0; jIndex < matrix.length; jIndex++){
                System.out.print(matrix[index][jIndex] + " ");
            }
            System.out.println( );
        }
    }

}


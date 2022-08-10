package jalau.at18.katas.game2048.team3;

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        int[][] matrix = {{0, 0, 0, 2},
                          {0, 0, 2, 2},
                          {0, 0, 0, 0},
                          {0, 0, 0, 0}};
        // double randomNumber = Math.random()*1;
        // double [] randomNumbers = {2, 4};
        showMatrix(matrix);
    }

    public static void rightMove(int[][] matrix) {
        
        // {2,0,2,0}
        // {0,0,2,2}
        // {2,2,2,2}
        // {2,0,2,2}

        // {0,0,0,4}
        // {0,0,2,2}
        // {0,0,0,0}
        // {0,0,0,0}
    }
    public static void downMove(int[][] matrix) {

    }
    public static void leftMove(int[][] matrix) {

    }
    public static void upMove(int[][] matrix) {

    }
    // public static int[][] showMatrix(int[][] matrix){
    public static void showMatrix(int[][] matrix) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}

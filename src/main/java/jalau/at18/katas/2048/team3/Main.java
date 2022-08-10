package jalau.at18.katas.2048.team3;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrix = {{0,0,0,2},{0,0,2,2},{0,0,0,0},{0,0,0,0}};

    }

    public static void rightMove(int[][] matrix) {

    }
    public static void downMove(int[][] matrix) {

    }
    public static void leftMove(int[][] matrix) {

    }
    public static void upMove(int[][] matrix) {

    }
    public int[][] showMatrix(int[][] matrix){
        for(int i =0;i<=4;i++){
            for(int j=0; j<= 4; i++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}

package jalau.at18.katas.game2048.team4.mauricio;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main1 extends Movements {
    public static void main(String[] args) {
        int min = 0;
        int max = 3;
        int randomNum1 = ThreadLocalRandom.current().nextInt(min, max + 1);
        int randomNum2 = ThreadLocalRandom.current().nextInt(min, max + 1);
        int randomNum3 = ThreadLocalRandom.current().nextInt(min, max + 1);
        int randomNum4 = ThreadLocalRandom.current().nextInt(min, max + 1);
        System.out.println("Introduce 2 or 4 to fill the first tile: ");
        int[] numbers = introduceNumber();
        int[][] matrix = generatingAMatrix(randomNum1, randomNum2, randomNum3, randomNum4, numbers[0], numbers[1]);
        for (int i = 0; i < matrix.length; i++) { // this equals to the row in our matrix.
            for (int j = 0; j < matrix[i].length; j++) { // this equals to the column in each row.
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // change line on console as row comes to end in the matrix.
        }
        while (true) {
            Scanner letter = new Scanner(System.in);
            String choose_letter = letter.next();
            if (choose_letter.equals("w") || choose_letter.equals("W")) {
                pressUp(matrix);
                for (int i = 0; i < matrix.length; i++) { // this equals to the row in our matrix.
                    for (int j = 0; j < matrix[i].length; j++) { // this equals to the column in each row.
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println(); // change line on console as row comes to end in the matrix.
                }
            }
            break;
        }
    }

    static int[] introduceNumber() {
        Scanner first_number = new Scanner(System.in);
        Scanner second_number = new Scanner(System.in);
        int[] numbers = new int[2];
        numbers[0] = first_number.nextInt();
        numbers[1] = second_number.nextInt();
        if ((numbers[0] != 2 && numbers[0] != 4) || (numbers[1] != 2 && numbers[1] != 4)) {
            System.out.println("The numbers must be 2 or 4, the numbers will be 2 and 4 by default: ");
            numbers[0] = 2;
            numbers[1] = 4;
        }
        return numbers;
    }

    static int[][] generatingAMatrix(int randomNum1, int randomNum2, int randomNum3, int randomNum4,
            int initial_number_1, int initial_number_2) {
        int matrix[][] = new int[4][4];
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

        matrix[randomNum1][randomNum2] = initial_number_1;
        matrix[randomNum3][randomNum4] = initial_number_2;

        return matrix;

    }

}

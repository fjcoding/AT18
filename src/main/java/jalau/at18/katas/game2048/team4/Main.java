package jalau.at18.katas.game2048.team4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static int[][] matrix = new int[4][4];
    public static String nextDirection;
    public static final int MIN_BOUND = 0;
    public static final int MAX_BOUND = 3;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner keyBoard = new Scanner(System.in);
        System.out.println();
        System.out.println("Welcome to the game. Objective: get tile 2048 by moving existing tiles: up, down, left and right");
        String exit = "Y";
        String continuePlaying;

        System.out.println();
        putNewTwoOnMatrix(matrix);
        putNewTwoOnMatrix(matrix);
        showMatrix();
        System.out.println();

        do {

            isWinner(matrix);
            System.out.println();
            System.out.println(
                    "Type the direction you want to go. Directions: [up, down, left, right] = [w, s, a, d]. If you want to exit type 'q'");
            nextDirection = keyBoard.nextLine();
            directionChecker(nextDirection);
            showMatrix();
            if ("q".equals(nextDirection)) {
                System.out.println("\nIf you want to stop playing type 'q' again. If not type any key.");
                continuePlaying = keyBoard.nextLine();
                if (continuePlaying.equals("q")) {
                    exit = "q";
                }
            }

        } while (!isWinner(matrix) && exit != "q" && !isLoser(matrix)); // The game stops when the player type exit or
                                                                        // wins

        keyBoard.close();

    }

    public static void showMatrix() { // Fix display for larger numbers
        for (int index = 0; index < matrix.length; index++) {
            System.out.println("----------------------------");
            for (int jIndex = 0; jIndex < matrix.length; jIndex++) {
                System.out.print("|  " + matrix[index][jIndex] + "  |");
            }
            System.out.println();
        }
        System.out.println("----------------------------");
    }

    public static boolean isWinner(int[][] matrix) {
        for (int index = 0; index < matrix.length; index++) {
            for (int jIndex = 0; jIndex < matrix.length; jIndex++) {
                if (matrix[index][jIndex] == 2048) {
                    return true;
                }
            }
        }
        return false;
    }

    static void directionChecker(String direction) { //
        switch (direction) {
            case "w":
                System.out.println("You moved the numbers up!");
                moveNumbersUp(matrix);
                putNewTwoOnMatrix(matrix);
                System.out.println();
                break;
            case "a":
                System.out.println("You moved the numbers left!");
                moveNumbersLeft(matrix);
                putNewTwoOnMatrix(matrix);
                System.out.println();
                break;
            case "d":
                System.out.println("You moved the numbers right!");
                moveNumbersRight(matrix);
                putNewTwoOnMatrix(matrix);
                System.out.println();
                break;
            case "s":
                System.out.println("You moved the numbers down!");
                moveNumbersDown(matrix);
                putNewTwoOnMatrix(matrix);
                System.out.println();
                break;
            case "q":
                System.out.println("You are about to Quit!");
                System.out.println();
                break;
            default:
                System.out.println("Type a correct direction. Directions: [up, down, left, right] = [w, s, a, d].");
                System.out.println();
        }
    }

    // Case 1: The number is in a border cell
    // Case 2: The next number is 0
    // Case 3: The next number is the same number (So it has to sum the numbers)
    // Case 4: Th next number is other number (So do nothing)

    public static int[][] moveNumbersUp(int[][] matrix) {
        for (int index = 0; index < matrix.length; index++) {
            for (int jIndex = 0; jIndex < matrix.length; jIndex++) {
                if (matrix[index][jIndex] != 0 && index == 0) { // Case 1
                    continue;
                } else if (matrix[index][jIndex] != 0 && matrix[index - 1][jIndex] == 0) { // Case 2
                    for (int innerIndex = index; innerIndex > 0 && matrix[innerIndex - 1][jIndex] == 0; innerIndex--) {
                        matrix[innerIndex - 1][jIndex] = matrix[innerIndex][jIndex];
                        matrix[innerIndex][jIndex] = 0;
                    } // move till reach a border or a number
                } else if (matrix[index][jIndex] != 0 && matrix[index - 1][jIndex] == matrix[index][jIndex]) { // Case 3
                    matrix[index - 1][jIndex] *= 2;
                    matrix[index][jIndex] = 0;
                } else if (matrix[index][jIndex] != 0 && matrix[index - 1][jIndex] != 0) { // Case 4
                    continue;
                }

            }
        }
        return matrix;
    }

    public static int[][] moveNumbersDown(int[][] matrix) {
        for (int index = 0; index < matrix.length; index++) {
            for (int jIndex = 0; jIndex < matrix.length; jIndex++) {
                if (matrix[index][jIndex] != 0 && index == 3) { // Case 1
                    continue;
                } else if (matrix[index][jIndex] != 0 && matrix[index + 1][jIndex] == 0) { // Case 2
                    for (int innerIndex = index; innerIndex < 3 && matrix[innerIndex + 1][jIndex] == 0; innerIndex++) {
                        matrix[innerIndex + 1][jIndex] = matrix[innerIndex][jIndex];
                        matrix[innerIndex][jIndex] = 0;
                    }
                } else if (matrix[index][jIndex] != 0 && matrix[index + 1][jIndex] == matrix[index][jIndex]) { // Case 3
                    matrix[index + 1][jIndex] *= 2;
                    matrix[index][jIndex] = 0;
                } else if (matrix[index][jIndex] != 0 && matrix[index + 1][jIndex] != 0) { // Case 4
                    continue;
                }
            }
        }
        return matrix;
    }

    public static int[][] moveNumbersLeft(int[][] matrix) {
        for (int index = 0; index < matrix.length; index++) {
            for (int jIndex = 0; jIndex < matrix.length; jIndex++) {
                if (matrix[index][jIndex] != 0 && jIndex == 0) { // Case 1
                    continue;
                } else if (matrix[index][jIndex] != 0 && matrix[index][jIndex - 1] == 0) { // Case 2
                    for (int innerIndex = jIndex; innerIndex > 0 && matrix[index][innerIndex - 1] == 0; innerIndex--) {
                        matrix[index][innerIndex - 1] = matrix[index][innerIndex];
                        matrix[index][innerIndex] = 0;
                    }
                } else if (matrix[index][jIndex] != 0 && matrix[index][jIndex - 1] == matrix[index][jIndex]) { // Case 3
                    matrix[index][jIndex - 1] *= 2;
                    matrix[index][jIndex] = 0;
                } else if (matrix[index][jIndex] != 0 && matrix[index][jIndex - 1] != 0) { // Case 4
                    continue;
                }
            }
        }
        return matrix;
    }

    public static int[][] moveNumbersRight(int[][] matrix) {
        for (int index = 0; index < matrix.length; index++) {
            for (int jIndex = 0; jIndex < matrix.length; jIndex++) {
                if (matrix[index][jIndex] != 0 && jIndex == 3) { // Case 1
                    continue;
                } else if (matrix[index][jIndex] != 0 && matrix[index][jIndex + 1] == 0) { // Case 2
                    for (int innerIndex = jIndex; innerIndex < 3 && matrix[index][innerIndex + 1] == 0; innerIndex++) {
                        matrix[index][innerIndex + 1] = matrix[index][innerIndex];
                        matrix[index][innerIndex] = 0;
                    }
                } else if (matrix[index][jIndex] != 0 && matrix[index][jIndex + 1] == matrix[index][jIndex]) { // Case 3
                    matrix[index][jIndex + 1] *= 2;
                    matrix[index][jIndex] = 0;
                } else if (matrix[index][jIndex] != 0 && matrix[index][jIndex + 1] != 0) { // Case 4
                    continue;
                }
            }
        }
        return matrix;
    }

    public static int[][] putNewTwoOnMatrix(int[][] matrix) { // Recursividad?
        int randomPositionX = ThreadLocalRandom.current().nextInt(MIN_BOUND, MAX_BOUND + 1);
        int randomPositionY = ThreadLocalRandom.current().nextInt(MIN_BOUND, MAX_BOUND + 1);
        while (matrix[randomPositionX][randomPositionY] != 0) { // It searchs a cell with a 0 for putting a 2
            randomPositionX = ThreadLocalRandom.current().nextInt(MIN_BOUND, MAX_BOUND + 1);
            randomPositionY = ThreadLocalRandom.current().nextInt(MIN_BOUND, MAX_BOUND + 1);
        }
        matrix[randomPositionX][randomPositionY] = 2;
        return matrix;
    }

    // Is loser function
    public static boolean isLoser(int[][] matrix) {
        for (int index = 0; index < matrix.length; index++) {
            for (int jIndex = 0; jIndex < matrix.length; jIndex++) {
                if (matrix[index][jIndex] == 0) {
                    return false;
                }
            }
        }
        System.out.println("Game Over");
        return true;
    }

}

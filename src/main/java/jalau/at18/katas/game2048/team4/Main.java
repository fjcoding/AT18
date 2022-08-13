package jalau.at18.katas.game2048.team4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static final int GRID_SIZE = 4;
    public static final int WINNER_NUMBER = 2048;
    private static int[][] matrix = new int[GRID_SIZE][GRID_SIZE];
    private static String nextDirection;
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

    public static boolean isWinner(int[][] matrixToCheck) {
        for (int index = 0; index < matrixToCheck.length; index++) {
            for (int jIndex = 0; jIndex < matrixToCheck.length; jIndex++) {
                if (matrixToCheck[index][jIndex] == WINNER_NUMBER) {
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

    public static int[][] moveNumbersUp(int[][] matrixToMove) {
        for (int index = 0; index < matrixToMove.length; index++) {
            for (int jIndex = 0; jIndex < matrixToMove.length; jIndex++) {
                if (matrixToMove[index][jIndex] != 0 && index == 0) { // Case 1
                    continue;
                } else if (matrixToMove[index][jIndex] != 0 && matrixToMove[index - 1][jIndex] == 0) { // Case 2
                    for (int innerIndex = index; innerIndex > 0 && matrixToMove[innerIndex - 1][jIndex] == 0; innerIndex--) {
                        matrixToMove[innerIndex - 1][jIndex] = matrixToMove[innerIndex][jIndex];
                        matrixToMove[innerIndex][jIndex] = 0;
                    } // move till reach a border or a number
                } else if (matrixToMove[index][jIndex] != 0 && matrixToMove[index - 1][jIndex] == matrixToMove[index][jIndex]) { // Case 3
                    matrixToMove[index - 1][jIndex] *= 2;
                    matrixToMove[index][jIndex] = 0;
                } else if (matrixToMove[index][jIndex] != 0 && matrixToMove[index - 1][jIndex] != 0) { // Case 4
                    continue;
                }

            }
        }
        return matrixToMove;
    }

    public static int[][] moveNumbersDown(int[][] matrixToMove) {
        for (int index = 0; index < matrixToMove.length; index++) {
            for (int jIndex = 0; jIndex < matrixToMove.length; jIndex++) {
                if (matrixToMove[index][jIndex] != 0 && index == MAX_BOUND) { // Case 1
                    continue;
                } else if (matrixToMove[index][jIndex] != 0 && matrixToMove[index + 1][jIndex] == 0) { // Case 2
                    for (int innerIndex = index; innerIndex < MAX_BOUND && matrixToMove[innerIndex + 1][jIndex] == 0; innerIndex++) {
                        matrixToMove[innerIndex + 1][jIndex] = matrixToMove[innerIndex][jIndex];
                        matrixToMove[innerIndex][jIndex] = 0;
                    }
                } else if (matrixToMove[index][jIndex] != 0 && matrixToMove[index + 1][jIndex] == matrixToMove[index][jIndex]) { // Case 3
                    matrixToMove[index + 1][jIndex] *= 2;
                    matrixToMove[index][jIndex] = 0;
                } else if (matrixToMove[index][jIndex] != 0 && matrixToMove[index + 1][jIndex] != 0) { // Case 4
                    continue;
                }
            }
        }
        return matrixToMove;
    }

    public static int[][] moveNumbersLeft(int[][] matrixToMove) {
        for (int index = 0; index < matrixToMove.length; index++) {
            for (int jIndex = 0; jIndex < matrixToMove.length; jIndex++) {
                if (matrixToMove[index][jIndex] != 0 && jIndex == 0) { // Case 1
                    continue;
                } else if (matrixToMove[index][jIndex] != 0 && matrixToMove[index][jIndex - 1] == 0) { // Case 2
                    for (int innerIndex = jIndex; innerIndex > 0 && matrixToMove[index][innerIndex - 1] == 0; innerIndex--) {
                        matrixToMove[index][innerIndex - 1] = matrixToMove[index][innerIndex];
                        matrixToMove[index][innerIndex] = 0;
                    }
                } else if (matrixToMove[index][jIndex] != 0 && matrixToMove[index][jIndex - 1] == matrixToMove[index][jIndex]) { // Case 3
                    matrixToMove[index][jIndex - 1] *= 2;
                    matrixToMove[index][jIndex] = 0;
                } else if (matrixToMove[index][jIndex] != 0 && matrixToMove[index][jIndex - 1] != 0) { // Case 4
                    continue;
                }
            }
        }
        return matrixToMove;
    }

    public static int[][] moveNumbersRight(int[][] matrixToMove) {
        for (int index = 0; index < matrixToMove.length; index++) {
            for (int jIndex = 0; jIndex < matrixToMove.length; jIndex++) {
                if (matrixToMove[index][jIndex] != 0 && jIndex == MAX_BOUND) { // Case 1
                    continue;
                } else if (matrixToMove[index][jIndex] != 0 && matrixToMove[index][jIndex + 1] == 0) { // Case 2
                    for (int innerIndex = jIndex; innerIndex < MAX_BOUND && matrixToMove[index][innerIndex + 1] == 0; innerIndex++) {
                        matrixToMove[index][innerIndex + 1] = matrixToMove[index][innerIndex];
                        matrixToMove[index][innerIndex] = 0;
                    }
                } else if (matrixToMove[index][jIndex] != 0 && matrixToMove[index][jIndex + 1] == matrixToMove[index][jIndex]) { // Case 3
                    matrixToMove[index][jIndex + 1] *= 2;
                    matrixToMove[index][jIndex] = 0;
                } else if (matrixToMove[index][jIndex] != 0 && matrixToMove[index][jIndex + 1] != 0) { // Case 4
                    continue;
                }
            }
        }
        return matrixToMove;
    }

    public static int[][] putNewTwoOnMatrix(int[][] matrixToShow) { // Recursividad?
        int randomPositionX = ThreadLocalRandom.current().nextInt(MIN_BOUND, MAX_BOUND + 1);
        int randomPositionY = ThreadLocalRandom.current().nextInt(MIN_BOUND, MAX_BOUND + 1);
        while (matrixToShow[randomPositionX][randomPositionY] != 0) { // It searchs a cell with a 0 for putting a 2
            randomPositionX = ThreadLocalRandom.current().nextInt(MIN_BOUND, MAX_BOUND + 1);
            randomPositionY = ThreadLocalRandom.current().nextInt(MIN_BOUND, MAX_BOUND + 1);
        }
        matrixToShow[randomPositionX][randomPositionY] = 2;
        return matrixToShow;
    }

    // Is loser function
    public static boolean isLoser(int[][] matrixToCheck) {
        for (int index = 0; index < matrixToCheck.length; index++) {
            for (int jIndex = 0; jIndex < matrixToCheck.length; jIndex++) {
                if (matrixToCheck[index][jIndex] == 0) {
                    return false;
                }
            }
        }
        System.out.println("Game Over");
        return true;
    }
    public static String getNextDirection() {
        return nextDirection;
    }
    public static void setNextDirection(String direction) {
        nextDirection = direction;
    }
    public static int[][] getMatrix() {
        return matrix;
    }
    public static void setMatrix(int[][] newMatrix) {
        matrix = newMatrix;
    }

}

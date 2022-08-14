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
    public static final double PROB_LEVEL = 0.2;
    public static final int RARE_TILE = 4;

    public static void main(String[] args) {
        // Main main = new Main();
        Scanner keyBoard = new Scanner(System.in);
        System.out.println();
        System.out.println(
                "***Welcome to the game. Objective: get tile 2048 by moving existing tiles: up, down, left and right.***");
        String exit = "Y";
        String continuePlaying;
        System.out.println();
        putNewTwoOnMatrix(matrix);
        putNewTwoOnMatrix(matrix);
        showMatrix();
        do {
            // isWinner(matrix);
            System.out.println();
            System.out.println(
                    "Type the direction you want to go. Directions: [up, down, left, right] = [w, s, a, d]. If you want to exit type 'q' and ENTER");
            nextDirection = keyBoard.nextLine();
            directionChecker(nextDirection);
            System.out.println();
            showMatrix();
            if ("q".equals(nextDirection)) {
                System.out.println("\nIf you want to stop playing type 'q' again. If not type any key.");
                continuePlaying = keyBoard.nextLine();
                if (continuePlaying.equals("q")) {
                    exit = "q";
                }
            }
            // The game stops when the player types q to exit, wins or is detected a losing
            // scenario
        } while (!"q".equals(exit) && !isWinner(matrix) && !isLoser(matrix));
        keyBoard.close();
    }

    public static void showMatrix() { // Fixed display for larger numbers
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
                    System.out.println("*** Congratulations, you found tile 2048, You have won the game!! ***");
                    System.out.println();
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
                moveNumbersUp(matrix, MIN_BOUND);
                putNewTwoOnMatrix(matrix);
                break;
            case "a":
                System.out.println("You moved the numbers left!");
                moveNumbersLeft(matrix, MIN_BOUND);
                putNewTwoOnMatrix(matrix);
                break;
            case "d":
                System.out.println("You moved the numbers right!");
                moveNumbersRight(matrix, MIN_BOUND);
                putNewTwoOnMatrix(matrix);
                break;
            case "s":
                System.out.println("You moved the numbers down!");
                moveNumbersDown(matrix, MIN_BOUND);
                putNewTwoOnMatrix(matrix);
                break;
            case "q":
                System.out.println("You are about to Quit!");
                break;
            default:
                System.out.println(
                        "PLease type a correct direction. Directions: [up, down, left, right] = [w, s, a, d]. if you want to exit type 'q'");
        }
    }

    // Case 1: The number is in a border cell
    // Case 2: The next number is 0
    // Case 3: The next number is the same number (So it has to sum the numbers)
    // Case 4: Th next number is other number (So do nothing)

    public static int[][] moveNumbersUp(int[][] matrixToMove, int sum) {
        for (int index = 0; index < matrixToMove.length; index++) {
            for (int jIndex = 0; jIndex < matrixToMove.length; jIndex++) {
                if (matrixToMove[index][jIndex] != 0 && index == 0) { // Case 1
                    continue;
                } else if (matrixToMove[index][jIndex] != 0 && matrixToMove[index - 1][jIndex] == 0) { // Case 2
                    for (int innerIndex = index; innerIndex > 0
                            && matrixToMove[innerIndex - 1][jIndex] == 0; innerIndex--) {
                        matrixToMove[innerIndex - 1][jIndex] = matrixToMove[innerIndex][jIndex];
                        matrixToMove[innerIndex][jIndex] = 0;
                        moveNumbersUp(matrix, 0);
                    } // move till reach a border or a number
                } else if (matrixToMove[index][jIndex] != 0
                        && matrixToMove[index - 1][jIndex] == matrixToMove[index][jIndex]) { // Case 3
                    if (sum < 1) {
                        matrixToMove[index - 1][jIndex] *= 2;
                        matrixToMove[index][jIndex] = 0;
                        moveNumbersUp(matrix, MIN_BOUND + 1);
                    } else {
                        continue;
                    }
                } else if (matrixToMove[index][jIndex] != 0 && matrixToMove[index - 1][jIndex] != 0) { // Case 4
                    continue;
                }
            }
        }
        return matrixToMove;
    }

    public static int[][] moveNumbersDown(int[][] matrixToMove, int sum) {
        for (int index = 0; index < matrixToMove.length; index++) {
            for (int jIndex = 0; jIndex < matrixToMove.length; jIndex++) {
                if (matrixToMove[index][jIndex] != 0 && index == MAX_BOUND) { // Case 1
                    continue;
                } else if (matrixToMove[index][jIndex] != 0 && matrixToMove[index + 1][jIndex] == 0) { // Case 2
                    for (int innerIndex = index; innerIndex < MAX_BOUND
                            && matrixToMove[innerIndex + 1][jIndex] == 0; innerIndex++) {
                        matrixToMove[innerIndex + 1][jIndex] = matrixToMove[innerIndex][jIndex];
                        matrixToMove[innerIndex][jIndex] = 0;
                        moveNumbersDown(matrix, 0);
                    }
                } else if (matrixToMove[index][jIndex] != 0
                        && matrixToMove[index + 1][jIndex] == matrixToMove[index][jIndex]) { // Case 3
                    if (sum < 1) {
                        matrixToMove[index + 1][jIndex] *= 2;
                        matrixToMove[index][jIndex] = 0;
                        moveNumbersDown(matrix, MIN_BOUND + 1);
                    } else {
                        continue;
                    }
                } else if (matrixToMove[index][jIndex] != 0 && matrixToMove[index + 1][jIndex] != 0) { // Case 4
                    continue;
                }
            }
        }
        return matrixToMove;
    }

    public static int[][] moveNumbersLeft(int[][] matrixToMove, int sum) {
        for (int index = 0; index < matrixToMove.length; index++) {
            for (int jIndex = 0; jIndex < matrixToMove.length; jIndex++) {
                if (matrixToMove[index][jIndex] != 0 && jIndex == 0) { // Case 1
                    continue;
                } else if (matrixToMove[index][jIndex] != 0 && matrixToMove[index][jIndex - 1] == 0) { // Case 2
                    for (int innerIndex = jIndex; innerIndex > 0
                            && matrixToMove[index][innerIndex - 1] == 0; innerIndex--) {
                        matrixToMove[index][innerIndex - 1] = matrixToMove[index][innerIndex];
                        matrixToMove[index][innerIndex] = 0;
                        moveNumbersLeft(matrix, 0);
                    }
                } else if (matrixToMove[index][jIndex] != 0
                        && matrixToMove[index][jIndex - 1] == matrixToMove[index][jIndex]) { // Case 3
                    if (sum < 1) {
                        matrixToMove[index][jIndex - 1] *= 2;
                        matrixToMove[index][jIndex] = 0;
                        moveNumbersLeft(matrix, MIN_BOUND + 1);
                    } else {
                        continue;
                    }
                } else if (matrixToMove[index][jIndex] != 0 && matrixToMove[index][jIndex - 1] != 0) { // Case 4
                    continue;
                }
            }
        }
        return matrixToMove;
    }

    public static int[][] moveNumbersRight(int[][] matrixToMove, int sum) {
        for (int index = 0; index < matrixToMove.length; index++) {
            for (int jIndex = 0; jIndex < matrixToMove.length; jIndex++) {
                if (matrixToMove[index][jIndex] != 0 && jIndex == MAX_BOUND) { // Case 1
                    continue;
                } else if (matrixToMove[index][jIndex] != 0 && matrixToMove[index][jIndex + 1] == 0) { // Case 2
                    for (int innerIndex = jIndex; innerIndex < MAX_BOUND
                            && matrixToMove[index][innerIndex + 1] == 0; innerIndex++) {
                        matrixToMove[index][innerIndex + 1] = matrixToMove[index][innerIndex];
                        matrixToMove[index][innerIndex] = 0;
                        moveNumbersRight(matrix, 0);
                    }
                } else if (matrixToMove[index][jIndex] != 0
                        && matrixToMove[index][jIndex + 1] == matrixToMove[index][jIndex]) { // Case 3
                    if (sum < 1) {
                        matrixToMove[index][jIndex + 1] *= 2;
                        matrixToMove[index][jIndex] = 0;
                        moveNumbersRight(matrix, MIN_BOUND + 1);
                    } else {
                        continue;
                    }
                } else if (matrixToMove[index][jIndex] != 0 && matrixToMove[index][jIndex + 1] != 0) { // Case 4
                    continue;
                }
            }
        }
        return matrixToMove;
    }

    public static int[][] putNewTwoOnMatrix(int[][] matrixToShow) {
        int randomPositionX = ThreadLocalRandom.current().nextInt(MIN_BOUND, MAX_BOUND + 1);
        int randomPositionY = ThreadLocalRandom.current().nextInt(MIN_BOUND, MAX_BOUND + 1);
        double rand = Math.random();
        boolean full = false;
        // Searches a cell with a 0, if found replaces it with a number
        int trigger = 0;
        while ((matrixToShow[randomPositionX][randomPositionY] != 0) && !full) {
            randomPositionX = ThreadLocalRandom.current().nextInt(MIN_BOUND, MAX_BOUND + 1);
            randomPositionY = ThreadLocalRandom.current().nextInt(MIN_BOUND, MAX_BOUND + 1);
            trigger++;
            if (trigger == (GRID_SIZE * GRID_SIZE)) {
                for (int index = 0; index < matrixToShow.length; index++) {
                    for (int jIndex = 0; jIndex < matrixToShow.length; jIndex++) {
                        if (matrixToShow[index][jIndex] == 0) {
                            randomPositionX = index;
                            randomPositionY = jIndex;
                            full = false;
                        } else {
                            full = true;
                        }
                    }
                }
            }
        }
        if (rand < PROB_LEVEL && !full) {
            matrixToShow[randomPositionX][randomPositionY] = RARE_TILE;
        } else {
            matrixToShow[randomPositionX][randomPositionY] = 2;
        }
        return matrixToShow;
    }

    public static boolean isLoser(int[][] matrixToCheck) {
        int zeros = 0;
        for (int index = 0; index < matrixToCheck.length; index++) {
            for (int jIndex = 0; jIndex < matrixToCheck.length; jIndex++) {
                if (matrixToCheck[index][jIndex] == 0) {
                    zeros++;
                }
            }
        }
        if (zeros <= 0) {
            if (checkMoves(matrix)) {
                System.out.println("***Game Over***");
                System.out.println();
                return true;
            }
        }
        return false;
    }

    public static boolean checkMoves(int[][] noZeros) {
        int count = 0;
        for (int index = 0; index < noZeros.length; index++) {

            for (int jindex = 0; jindex < noZeros[index].length; jindex++) {
                    // search corners
                if (index == 0 && jindex == 0) {
                    if (noZeros[index][jindex] != noZeros[index + 1][jindex]
                            && noZeros[index][jindex] != noZeros[index][jindex + 1]) {
                        count++;
                    }
                } else if (index == 0 && jindex == MAX_BOUND) {
                    if (noZeros[index][jindex] != noZeros[index + 1][jindex]
                            && noZeros[index][jindex] != noZeros[index][jindex - 1]) {
                        count++;
                    }
                } else if (index == MAX_BOUND && jindex == MAX_BOUND) {
                    if (noZeros[index][jindex] != noZeros[index - 1][jindex]
                            && noZeros[index][jindex] != noZeros[index][jindex - 1]) {
                        count++;
                    }
                } else if (index == MAX_BOUND && jindex == 0) {
                    if (noZeros[index][jindex] != noZeros[index - 1][jindex]
                            && noZeros[index][jindex] != noZeros[index][jindex + 1]) {
                        count++;
                    }
                    // search middle sides
                } else if (index == 0 && (jindex == 1 || jindex == 2)) {
                    if (noZeros[index][jindex] != noZeros[index + 1][jindex]
                            && noZeros[index][jindex] != noZeros[index][jindex + 1]
                            && noZeros[index][jindex] != noZeros[index][jindex - 1]) {
                        count++;
                    }
                } else if (index == MAX_BOUND && (jindex == 1 || jindex == 2)) {
                    if (noZeros[index][jindex] != noZeros[index - 1][jindex]
                            && noZeros[index][jindex] != noZeros[index][jindex + 1]
                            && noZeros[index][jindex] != noZeros[index][jindex - 1]) {
                        count++;
                    }
                } else if (jindex == 0 && (index == 1 || index == 2)) {
                    if (noZeros[index][jindex] != noZeros[index][jindex + 1]
                            && noZeros[index][jindex] != noZeros[index - 1][jindex]
                            && noZeros[index][jindex] != noZeros[index + 1][jindex]) {
                        count++;
                    }
                } else if (jindex == MAX_BOUND && (index == 1 || index == 2)) {
                    if (noZeros[index][jindex] != noZeros[index][jindex - 1]
                            && noZeros[index][jindex] != noZeros[index - 1][jindex]
                            && noZeros[index][jindex] != noZeros[index + 1][jindex]) {
                        count++;
                    }
                } else {
                    // search middle four
                    if (noZeros[index][jindex] != noZeros[index][jindex - 1]
                            && noZeros[index][jindex] != noZeros[index][jindex + 1]
                            && noZeros[index][jindex] != noZeros[index - 1][jindex]
                            && noZeros[index][jindex] != noZeros[index + 1][jindex]) {
                        count++;
                    }
                }
            }
        }
        if (count == (GRID_SIZE * GRID_SIZE)) {
            return true;
        }
        return false;
    }
}

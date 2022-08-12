package jalau.at18.katas.game2048.team4.hugo;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MainHugo {
    public static int[][] matrix = new int[4][4];
    public static String nextDirection;
    public static final int MIN_BOUND = 0;
    public static final int MAX_BOUND = 3;

    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);
        System.out.println();
        System.out.println("Welcome to the game. Objective: get tile 2048 by moving existing tiles: up, down, left and right");
        String exit = "Y";
        String continuePlaying;

        showMatrix();
        System.out.println();
        putNewTwoOnMatrix();
        putNewTwoOnMatrix();
        showMatrix();

        do {

            isWinner();
            System.out.println();
            System.out.println("Type the direction you want to go. Directions: [up, down, left, right] = [w, s, a, d]. If you want to exit type 'q'");
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

        } while (!isWinner() && exit != "q" && !isLoser()); // The game stops when the player type exit or wins

        keyBoard.close();

    }

    static void showMatrix() {
        for (int index = 0; index < matrix.length; index++) {
            for (int jIndex = 0; jIndex < matrix.length; jIndex++) {
                System.out.print(matrix[index][jIndex] + " ");
            }
            System.out.println();
        }
    }

    static boolean isWinner() {
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
                moveNumbersUp();
                putNewTwoOnMatrix();
                System.out.println();
                break;
            case "a":
                System.out.println("You moved the numbers left!");
                moveNumbersLeft();
                putNewTwoOnMatrix();
                System.out.println();
                break;
            case "d":
                System.out.println("You moved the numbers right!");
                moveNumbersRight();
                putNewTwoOnMatrix();
                System.out.println();
                break;
            case "s":
                System.out.println("You moved the numbers down!");
                moveNumbersDown();
                putNewTwoOnMatrix();
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

    static void moveNumbersUp() {
        for (int index = 0; index < matrix.length; index++) {
            for (int jIndex = 0; jIndex < matrix.length; jIndex++) {
                if (matrix[index][jIndex] != 0 && index == 0) {
                    continue;
                } else if (matrix[index][jIndex] != 0 && matrix[index - 1][jIndex] == 0) {
                    for (int innerIndex = index; innerIndex > 0 && matrix[innerIndex - 1][jIndex] == 0; innerIndex--) {
                        matrix[innerIndex - 1][jIndex] = matrix[innerIndex][jIndex];
                        matrix[innerIndex][jIndex] = 0;
                    }
                } else if (matrix[index][jIndex] != 0 && matrix[index - 1][jIndex] != 0) {
                    if (matrix[index][jIndex] == matrix[index - 1][jIndex]) {
                        matrix[index - 1][jIndex] *= 2;
                        matrix[index][jIndex] = 0;
                    }
                }

            }
        }
    }

    static void moveNumbersDown() {
        for (int index = 0; index < matrix.length; index++) {
            for (int jIndex = 0; jIndex < matrix.length; jIndex++) {
                if (matrix[index][jIndex] != 0 && index == 3) {
                    continue;
                } else if (matrix[index][jIndex] != 0 && matrix[index + 1][jIndex] == 0) {
                    for (int innerIndex = index; innerIndex < 3 && matrix[innerIndex + 1][jIndex] == 0; innerIndex++) {
                        matrix[innerIndex + 1][jIndex] = matrix[innerIndex][jIndex];
                        matrix[innerIndex][jIndex] = 0;
                    }
                } else if (matrix[index][jIndex] != 0 && matrix[index + 1][jIndex] != 0) {
                    if (matrix[index][jIndex] == matrix[index + 1][jIndex]) {
                        matrix[index + 1][jIndex] *= 2;
                        matrix[index][jIndex] = 0;
                    }
                }

            }
        }
    }

    static void moveNumbersLeft() {
        for (int index = 0; index < matrix.length; index++) {
            for (int jIndex = 0; jIndex < matrix.length; jIndex++) {
                if (matrix[index][jIndex] != 0 && jIndex == 0) {
                    continue;
                } else if (matrix[index][jIndex] != 0 && matrix[index][jIndex - 1] == 0) {
                    for (int innerJindex = jIndex; innerJindex > 0
                            && matrix[index][innerJindex - 1] == 0; innerJindex--) {
                        matrix[index][innerJindex - 1] = matrix[index][innerJindex];
                        matrix[index][innerJindex] = 0;
                    }
                } else if (matrix[index][jIndex] != 0 && matrix[index][jIndex - 1] != 0) {
                    if (matrix[index][jIndex] == matrix[index][jIndex - 1]) {
                        matrix[index][jIndex - 1] *= 2;
                        matrix[index][jIndex] = 0;
                    }
                }

            }
        }
    }

    static void moveNumbersRight() {
        for (int index = 0; index < matrix.length; index++) {
            for (int jIndex = 0; jIndex < matrix.length; jIndex++) {
                if (matrix[index][jIndex] != 0 && jIndex == 3) {
                    continue;
                } else if (matrix[index][jIndex] != 0 && matrix[index][jIndex + 1] == 0) {
                    for (int innerJindex = jIndex; innerJindex < 3
                            && matrix[index][innerJindex + 1] == 0; innerJindex++) {
                        matrix[index][innerJindex + 1] = matrix[index][innerJindex];
                        matrix[index][innerJindex] = 0;
                    }
                } else if (matrix[index][jIndex] != 0 && matrix[index][jIndex + 1] != 0) {
                    if (matrix[index][jIndex] == matrix[index][jIndex + 1]) {
                        matrix[index][jIndex + 1] *= 2;
                        matrix[index][jIndex] = 0;
                    }
                }

            }
        }
    }

    static void putNewTwoOnMatrix() { // Recursividad?
        int randomPositionX = ThreadLocalRandom.current().nextInt(MIN_BOUND, MAX_BOUND + 1);
        int randomPositionY = ThreadLocalRandom.current().nextInt(MIN_BOUND, MAX_BOUND + 1);
        while (matrix[randomPositionX][randomPositionY] != 0) { // It searchs a cell with a 0 for putting a 2
            randomPositionX = ThreadLocalRandom.current().nextInt(MIN_BOUND, MAX_BOUND + 1);
            randomPositionY = ThreadLocalRandom.current().nextInt(MIN_BOUND, MAX_BOUND + 1);
        }
        matrix[randomPositionX][randomPositionY] = 2;
    }

    // Is loser function
    static boolean isLoser() {
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

package jalau.at18.katas.game2048.team1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final int RANDOM_TWO = 2;
    public static final int RANDOM_FOUR = 4;
    public static final int MAX_RANDOM_POSITION = 4;
    public static final int MAX_ROW_MOVES = 3;
    public static final int WIN_POINT_2048 = 2048;
    public static final int MAX_ROW_MATRIX = 4;
    public static final int MAX_COLUMN_MATRIX = 4;
    public static void main(String[] args) {
        Main main = new Main();
        int[][] matrix = main.initialMatrix(main.randomValueGrid(), main.randomValueGrid());
        main.printMatrix(matrix);

        while (!main.gameOver(matrix)) {
            main.direcctions(matrix);
            if (main.got2048(matrix)) {
                System.out.print("Congratulations, You got 2048!!!");
            }

        }

    }

    public void printMatrix(int[][] matrix) {
        System.out.println("\n-----------------------------------------------------------------");
        for (int row = 0; row < matrix.length; row++) {
            System.out.print("|\t");
            for (int column = 0; column < matrix.length; column++) {
                if (matrix[row][column] == 0) {
                    System.out.print(" " + "\t | \t");
                } else {
                    System.out.print(matrix[row][column] + "\t | \t");
                }
            }
            System.out.println("\n-----------------------------------------------------------------");
        }
    }

    public int randomValueGrid() {
        int[] numbers = {RANDOM_TWO, RANDOM_FOUR};
        Random random = new Random();
        int upperBound = 2;
        int numberOne = random.nextInt(upperBound);
        return numbers[numberOne];
    }

    public int[] randomPositionGrid() {
        Random rand = new Random();
        int upperbound = MAX_RANDOM_POSITION;
        int column = rand.nextInt(upperbound);
        int row = rand.nextInt(upperbound);
        return new int[]{row, column};
    }


    public int[][] addTile(int[][] matrix) {
        int[] randomPosition = randomPositionGrid();

        while (matrix[randomPosition[0]][randomPosition[1]] != 0) {
            randomPosition = randomPositionGrid();
        }
        int randomNumber = randomValueGrid();
        matrix[randomPosition[0]][randomPosition[1]] = randomNumber;
        return matrix;
    }


    public int[][] initialMatrix(int firstNumber, int secondNumber) {
        int[][] matrix = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        int[] firstPositionRowColum = randomPositionGrid();
        int[] secondPositionRowColum = randomPositionGrid();

        while (firstPositionRowColum[0] == secondPositionRowColum[0] && firstPositionRowColum[1] == secondPositionRowColum[1]) {
            secondPositionRowColum = randomPositionGrid();
        }
        matrix[firstPositionRowColum[0]][firstPositionRowColum[1]] = firstNumber;
        matrix[secondPositionRowColum[0]][secondPositionRowColum[1]] = secondNumber;
        return matrix;
    }

    public String readDiretions() {
        System.out.println("Game instructions");
        System.out.println("Top: w");
        System.out.println("Left: a");
        System.out.println("Right: d");
        System.out.println("Down: s");

        Scanner scan = new Scanner(System.in);
        String directionValue = scan.nextLine();
        while (!directionValue.equals("w") && !directionValue.equals("a") && !directionValue.equals("d") && !directionValue.equals("s")) {
            System.out.println("Incorrect letter");
            directionValue = scan.nextLine();
        }
        return directionValue;
    }

    public int[][] direcctions(int[][] matrix) {
        int[][] newMatrix = new int[MAX_ROW_MATRIX][MAX_COLUMN_MATRIX];
        String directionValue = readDiretions();
        if (directionValue.equals("w")) {
            System.out.println("Move top");
            newMatrix = moveTop(matrix);
            newMatrix = addTile(newMatrix);
            printMatrix(newMatrix);

        }
        if (directionValue.equals("s")) {
            System.out.println("Move down");
            newMatrix = moveDown(matrix);
            newMatrix = addTile(newMatrix);
            printMatrix(newMatrix);
        }
        if (directionValue.equals("a")) {
            System.out.println("Move left");
            newMatrix = moveLeft(matrix);
            newMatrix = addTile(newMatrix);
            printMatrix(newMatrix);
        }
        if (directionValue.equals("d")) {
            System.out.println("Move rigth");
            newMatrix = moveRigth(matrix);
            newMatrix = addTile(newMatrix);
            printMatrix(newMatrix);
        }
        return newMatrix;
    }

    public int[][] moveTop(int[][] matrix) {
        for (int moves = 0; moves < MAX_ROW_MOVES; moves++) {
            for (int row = 1; row < matrix.length; row++) {
                for (int column = 0; column < matrix.length; column++) {
                    if (matrix[row][column] != 0 && matrix[row - 1][column] == 0) {
                        matrix[row - 1][column] = matrix[row][column];
                        matrix[row][column] = 0;
                    } else if (matrix[row][column] != 0 && matrix[row - 1][column] == matrix[row][column]) {
                        matrix[row - 1][column] = 2 * (matrix[row][column]);
                        matrix[row][column] = 0;
                    }
                }
            }
        }
        return matrix;
    }

    public int[][] moveDown(int[][] matrix) {
        for (int moves = 0; moves < MAX_ROW_MOVES; moves++) {
            for (int row = 2; row >= 0; row--) {
                for (int column = 0; column < matrix.length; column++) {
                    if (matrix[row][column] != 0 && matrix[row + 1][column] == 0) {
                        matrix[row + 1][column] = matrix[row][column];
                        matrix[row][column] = 0;
                    } else if (matrix[row][column] != 0 && matrix[row + 1][column] == matrix[row][column]) {
                        matrix[row + 1][column] = 2 * (matrix[row][column]);
                        matrix[row][column] = 0;
                    }
                }
            }
        }
        return matrix;
    }

    public int[][] moveLeft(int[][] matrix) {
        for (int moves = 0; moves < MAX_ROW_MOVES; moves++) {
            for (int column = 1; column < matrix.length; column++) {
                for (int row = 0; row < matrix.length; row++) {
                    if (matrix[row][column] != 0 && matrix[row][column - 1] == 0) {
                        matrix[row][column - 1] = matrix[row][column];
                        matrix[row][column] = 0;
                    } else if (matrix[row][column] != 0 && matrix[row][column - 1] == matrix[row][column]) {
                        matrix[row][column - 1] = 2 * (matrix[row][column]);
                        matrix[row][column] = 0;
                    }
                }
            }
        }
        return matrix;
    }

    public int[][] moveRigth(int[][] matrix) {
        for (int moves = 0; moves < MAX_ROW_MOVES; moves++) {
            for (int column = 2; column >= 0; column--) {
                for (int row = 0; row < matrix.length; row++) {
                    if (matrix[row][column] != 0 && matrix[row][column + 1] == 0) {
                        matrix[row][column + 1] = matrix[row][column];
                        matrix[row][column] = 0;
                    } else if (matrix[row][column] != 0 && matrix[row][column + 1] == matrix[row][column]) {
                        matrix[row][column + 1] = 2 * (matrix[row][column]);
                        matrix[row][column] = 0;
                    }
                }
            }
        }
        return matrix;
    }

    public boolean gameOver(int[][] matrix) {
        int countZeros = countZerosMatrix(matrix);
        Boolean verifySideUp = verifySideRow(matrix);
        Boolean verifySideLeft = verifySideColumn(matrix);
        boolean isGameOver = countZeros == 0 && !(verifySideUp) && !(verifySideLeft);

        if (isGameOver) {
            System.out.println("Game Over");
        }
        return isGameOver;
    }

    public int countZerosMatrix(int[][] matrix) {
        int countZeros = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length; column++) {
                if (matrix[row][column] == 0) {
                    countZeros++;
                }
            }
        }
        return countZeros;
    }

    public Boolean verifySideRow(int[][] matrix) {
        boolean check = false;
        for (int row = 1; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length; column++) {
                if (matrix[row][column] == matrix[row - 1][column]) {
                    check = true;
                }
            }
        }
        return check;
    }

    public Boolean verifySideColumn(int[][] matrix) {
        boolean check = false;
        for (int column = 1; column < matrix.length; column++) {
            for (int row = 0; row < matrix.length; row++) {
                if (matrix[row][column] == matrix[row][column - 1]) {
                    check = true;
                }
            }
        }
        return check;
    }

    public Boolean got2048(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length; column++) {
                if (matrix[row][column] == WIN_POINT_2048) {
                    return true;
                }
            }
        }
        return false;
    }
}

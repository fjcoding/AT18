package jalau.at18.katas.game2048.team1;

import java.util.Random;

public class Movement {
    private String direction;
    private int[][] newMatrix;
    public static final int MAX_ROW_MOVES = 3;
    public static final int TILE_VALUE_TWO = 2;
    public static final int TILE_VALUE_FOUR = 4;
    public static final int MAX_RANDOM_POSITION = 4;

    public Movement(String nextDirection, int[][] matrix) {
        this.direction = nextDirection;
        this.newMatrix = matrix;
    }
    public Movement() { }
    public String getDirection() {
        return this.direction;
    }
    public int[][] moveNumbers() {
        if (direction.equals("w")) {
            System.out.println("Move top");
            moveTop(newMatrix);
            addTile(newMatrix);
        }
        if (direction.equals("s")) {
            System.out.println("Move down");
            moveDown(newMatrix);
            addTile(newMatrix);
        }
        if (direction.equals("a")) {
            System.out.println("Move left");
            moveLeft(newMatrix);
            addTile(newMatrix);
        }
        if (direction.equals("d")) {
            System.out.println("Move right");
            moveRight(newMatrix);
            addTile(newMatrix);
        }
        if (!(direction.equals("d") || direction.equals("a") || direction.equals("w") || direction.equals("s"))) {
            Messages message = new Messages();
            message.wrongDirection();
        }
        return this.newMatrix;
    }
    public void moveTop(int[][] matrix) {
        int[][] auxiliarMatrix = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        for (int moves = 0; moves < MAX_ROW_MOVES; moves++) {
            for (int row = 1; row < matrix.length; row++) {
                for (int column = 0; column < matrix.length; column++) {
                    boolean verifyPrevious = auxiliarMatrix[row - 1][column] == 0 ? true : false;
                    boolean verifyActual = auxiliarMatrix[row][column] == 0 ? true : false;
                    if (matrix[row][column] != 0 && matrix[row - 1][column] == 0) {
                        matrix[row - 1][column] = matrix[row][column];
                        matrix[row][column] = 0;
                    } else if (matrix[row][column] != 0 && matrix[row - 1][column] == matrix[row][column] && verifyPrevious && verifyActual) {
                        matrix[row - 1][column] = 2 * (matrix[row][column]);
                        matrix[row][column] = 0;
                        auxiliarMatrix[row - 1][column] = 1;
                    }
                }
            }
        }
        this.newMatrix = matrix;
    }

    public void moveDown(int[][] matrix) {
        int[][] auxiliarMatrix = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        for (int moves = 0; moves < MAX_ROW_MOVES; moves++) {
            for (int row = 2; row >= 0; row--) {
                for (int column = 0; column < matrix.length; column++) {
                    boolean verifyPrevious = auxiliarMatrix[row + 1][column] == 0 ? true : false;
                    boolean verifyActual = auxiliarMatrix[row][column] == 0 ? true : false;
                    if (matrix[row][column] != 0 && matrix[row + 1][column] == 0) {
                        matrix[row + 1][column] = matrix[row][column];
                        matrix[row][column] = 0;
                    } else if (matrix[row][column] != 0 && matrix[row + 1][column] == matrix[row][column] && verifyPrevious && verifyActual) {
                        matrix[row + 1][column] = 2 * (matrix[row][column]);
                        matrix[row][column] = 0;
                        auxiliarMatrix[row + 1][column] = 1;
                    }
                }
            }
        }
        this.newMatrix = matrix;
    }

    public void moveLeft(int[][] matrix) {
        int[][] auxiliarMatrix = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        for (int moves = 0; moves < MAX_ROW_MOVES; moves++) {
            for (int column = 1; column < matrix.length; column++) {
                for (int row = 0; row < matrix.length; row++) {
                    boolean verifyPrevious = auxiliarMatrix[row][column - 1] == 0 ? true : false;
                    boolean verifyActual = auxiliarMatrix[row][column] == 0 ? true : false;
                    if (matrix[row][column] != 0 && matrix[row][column - 1] == 0) {
                        matrix[row][column - 1] = matrix[row][column];
                        matrix[row][column] = 0;
                    } else if (matrix[row][column] != 0 && matrix[row][column - 1] == matrix[row][column] && verifyPrevious && verifyActual) {
                        matrix[row][column - 1] = 2 * (matrix[row][column]);
                        matrix[row][column] = 0;
                        auxiliarMatrix[row][column - 1] = 1;
                    }
                }
            }
        }
        this.newMatrix = matrix;
    }

    public void moveRight(int[][] matrix) {
        int[][] auxiliarMatrix = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        for (int moves = 0; moves < MAX_ROW_MOVES; moves++) {
            for (int column = 2; column >= 0; column--) {
                for (int row = 0; row < matrix.length; row++) {
                    boolean verifyPrevious = auxiliarMatrix[row][column + 1] == 0 ? true : false;
                    boolean verifyActual = auxiliarMatrix[row][column] == 0 ? true : false;
                    if (matrix[row][column] != 0 && matrix[row][column + 1] == 0) {
                        matrix[row][column + 1] = matrix[row][column];
                        matrix[row][column] = 0;
                    } else if (matrix[row][column] != 0 && matrix[row][column + 1] == matrix[row][column] && verifyPrevious && verifyActual) {
                        matrix[row][column + 1] = 2 * (matrix[row][column]);
                        matrix[row][column] = 0;
                        auxiliarMatrix[row][column + 1] = 1;
                    }
                }
            }
        }
        this.newMatrix = matrix;
    }

    public void addTile(int[][] matrix) {
        int[] randomPosition = randomPositionGrid();
        while (matrix[randomPosition[0]][randomPosition[1]] != 0) {
            randomPosition = randomPositionGrid();
        }
        int randomNumber = randomValueGrid();
        matrix[randomPosition[0]][randomPosition[1]] = randomNumber;
        this.newMatrix = matrix;
    }

    public int randomValueGrid() {
        int[] numbers = {TILE_VALUE_TWO, TILE_VALUE_FOUR};
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
}

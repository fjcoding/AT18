package jalau.at18.katas.game2048.team3;

import java.util.Random;

public class Board {
    Matrix matrix = new Matrix();
    private static final int PRINCIPAL_NUMBER = 2;
    private static final int SECONDARY_NUMBER = 4;
    private static final int MAX_VAL = 2;
    private static final int ZERO = 0;
    private static final int MAX_INDEX = 3;
    private static final int NUMBER_WINNER = 2048;

    public Matrix startBoard(Matrix matrix) {
        for (int row = 0; row < matrix.MATRIXSIZE; row++) {
            for (int colum = 0; colum < matrix.MATRIXSIZE; colum++) {
                matrix.matrix[row][colum] = 0;
            }
        }
        initializeMatrix();
        return matrix;
    }

    public int getRandomNumber() {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(MAX_VAL);
        if (randomNumber == 1 || randomNumber == 2) {
            return PRINCIPAL_NUMBER;
        } else {
            return SECONDARY_NUMBER;
        }
    }

    public int[] getNewRandomPosition() {
        Random rnd = new Random();
        int randomPositionX = rnd.nextInt(matrix.MATRIXSIZE);
        int randomPositionY = rnd.nextInt(matrix.MATRIXSIZE);
        int[] result = {randomPositionY, randomPositionX};
        return result;
    }

    public void generateRandomNumbers() {
        int[] position = getNewRandomPosition();
        int positionX = position[1];
        int positionY = position[0];
        int value = matrix.matrix[positionY][positionX];
        while (value != 0) {
            position = getNewRandomPosition();
            positionX = position[1];
            positionY = position[0];
            value = matrix.matrix[positionY][positionX];
        }
        matrix.matrix[positionY][positionX] = getRandomNumber();
    }

    public void initializeMatrix() {
        int[] randomPosition1 = getNewRandomPosition();
        int[] randomPosition2 = getNewRandomPosition();

        while (randomPosition1[0] == randomPosition2[0] && randomPosition1[1] == randomPosition2[1]) {
            randomPosition1 = getNewRandomPosition();
        }
        matrix.matrix[randomPosition1[0]][randomPosition1[1]] = getRandomNumber();
        matrix.matrix[randomPosition2[0]][randomPosition2[1]] = getRandomNumber();

    }

    public void rightMove() {
        for (int row = ZERO; row < matrix.MATRIXSIZE; row++) {
            for (int column = MAX_INDEX; column >= ZERO; column--) {
                if (matrix.matrix[row][column] != ZERO) {
                    for (int colAux = column - 1; colAux >= ZERO; colAux--) {
                        if (matrix.matrix[row][column] == matrix.matrix[row][colAux]) {
                            matrix.matrix[row][column] += matrix.matrix[row][colAux];
                            matrix.matrix[row][colAux] = ZERO;
                        }
                    }
                }
            }
        }
        arrangeRight();
    }

    private void arrangeRight() {
        for (int row = ZERO; row < matrix.MATRIXSIZE; row++) {
            for (int column = MAX_INDEX; column >= ZERO; column--) {
                if (matrix.matrix[row][column] == ZERO) {
                    for (int colAux = column - 1; colAux >= ZERO; colAux--) {
                        if (matrix.matrix[row][colAux] != ZERO) {
                            matrix.matrix[row][column] = matrix.matrix[row][colAux];
                            matrix.matrix[row][colAux] = ZERO;
                            break;
                        }
                    }
                }
            }
        }
    }

    public void leftMove() {
        for (int row = ZERO; row < matrix.MATRIXSIZE; row++) {
            for (int column = ZERO; column < matrix.MATRIXSIZE; column++) {
                if (matrix.matrix[row][column] != ZERO) {
                    for (int colAux = column + 1; colAux < matrix.MATRIXSIZE; colAux++) {
                        if (matrix.matrix[row][colAux] != ZERO
                                && matrix.matrix[row][column] == matrix.matrix[row][colAux]) {
                            matrix.matrix[row][column] += matrix.matrix[row][colAux];
                            matrix.matrix[row][colAux] = ZERO;
                        }
                    }
                }
            }
        }
        arrangeLeft();
    }

    private void arrangeLeft() {
        for (int row = ZERO; row < matrix.MATRIXSIZE; row++) {
            for (int column = ZERO; column < matrix.MATRIXSIZE; column++) {
                if (matrix.matrix[row][column] == ZERO) {
                    for (int colAux = column + 1; colAux < matrix.MATRIXSIZE; colAux++) {
                        if (matrix.matrix[row][colAux] != ZERO) {
                            matrix.matrix[row][column] = matrix.matrix[row][colAux];
                            matrix.matrix[row][colAux] = ZERO;
                            break;
                        }
                    }
                }
            }
        }
    }

    public void upMove() {
        for (int row = ZERO; row < matrix.MATRIXSIZE; row++) {
            for (int column = ZERO; column < MAX_INDEX; column++) {
                if (matrix.matrix[column][row] != ZERO) {
                    int colAux = column + 1;
                    if (matrix.matrix[colAux][row] != ZERO
                            && matrix.matrix[column][row] == matrix.matrix[colAux][row]) {
                        matrix.matrix[column][row] += matrix.matrix[colAux][row];
                        matrix.matrix[colAux][row] = ZERO;
                    } else {
                        if (matrix.matrix[colAux][row] == ZERO) {
                            matrix.matrix[colAux][row] = matrix.matrix[column][row];
                            matrix.matrix[column][row] = ZERO;
                        }
                    }
                }
            }
        }
        orderUp();
    }

    private void orderUp() {
        for (int row = ZERO; row < matrix.MATRIXSIZE; row++) {
            for (int column = ZERO; column < matrix.MATRIXSIZE; column++) {
                if (matrix.matrix[column][row] == ZERO) {
                    for (int colAux = column + 1; colAux < matrix.MATRIXSIZE; colAux++) {
                        if (matrix.matrix[colAux][row] != ZERO) {
                            matrix.matrix[column][row] = matrix.matrix[colAux][row];
                            matrix.matrix[colAux][row] = ZERO;
                            break;
                        }
                    }
                }
            }
        }
    }

    public void downMove() {
        for (int row = ZERO; row < matrix.MATRIXSIZE; row++) {
            for (int column = MAX_INDEX; column > ZERO; column--) {
                if (matrix.matrix[column][row] != ZERO) {
                    int columnAux = column - 1;
                    if (matrix.matrix[columnAux][row] != ZERO
                            && matrix.matrix[column][row] == matrix.matrix[columnAux][row]) {
                        matrix.matrix[column][row] = matrix.matrix[column][row] +
                                matrix.matrix[columnAux][row];
                        matrix.matrix[columnAux][row] = ZERO;
                    } else {
                        if (matrix.matrix[columnAux][row] == ZERO) {
                            matrix.matrix[columnAux][row] = matrix.matrix[column][row];
                            matrix.matrix[column][row] = ZERO;
                        }
                    }

                }
            }
        }
        arrangeDown();
    }

    public void arrangeDown() {
        for (int row = ZERO; row < matrix.MATRIXSIZE; row++) {
            for (int column = MAX_INDEX; column > ZERO; column--) {
                if (matrix.matrix[column][row] == ZERO) {
                    for (int columnAux = column - 1; columnAux >= ZERO; columnAux--) {
                        if (matrix.matrix[columnAux][row] != ZERO) {
                            matrix.matrix[column][row] = matrix.matrix[columnAux][row];
                            matrix.matrix[columnAux][row] = ZERO;
                            break;
                        }
                    }
                }
            }
        }
    }

    public void showMatrix() {
        for (int row = ZERO; row < matrix.MATRIXSIZE; row++) {
            for (int column = ZERO; column < matrix.MATRIXSIZE; column++) {
                System.out.print(matrix.matrix[row][column] + "\t");
            }
            System.out.println();
        }
    }

    public int[][] getMatrix() {
        return matrix.matrix;
    }

    public boolean didYouWin() {
        for (int row = ZERO; row < matrix.MATRIXSIZE; row++) {
            for (int column = ZERO; column < matrix.MATRIXSIZE; column++) {
                if (matrix.matrix[row][column] == NUMBER_WINNER) {
                    System.out.println("WINNER!!");
                    return true;
                }
            }
        }
        return false;
    }

}

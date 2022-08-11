package jalau.at18.katas.game2048.team3;

public class Main {
    private static final int MAX_SIZE = 4;
    private static final int MAX_INDEX = 3;
    private static final int ZERO = 0;
    private int[][] matrixG = new int[MAX_SIZE][MAX_SIZE];
    public static void main(String[] args) {
        /*int[][] matrix = {{2, ZERO, 2, ZERO},
                          {ZERO, ZERO, 2, 2},
                          {2, 2, 2, 2},
                          {2, ZERO, 2, 2}};
        Main main = new Main();
        main.upMove(matrix);
        */
    }

    public void rightMove(int[][] matrix) {
        for (int row = ZERO; row < MAX_SIZE; row++) {
            for (int column = MAX_INDEX; column >= ZERO; column--) {
                if (matrix[row][column] != ZERO) {
                    for (int colAux = column - 1; colAux >= ZERO; colAux--) {
                        if (matrix[row][colAux] != ZERO && matrix[row][column] == matrix[row][colAux]) {
                            matrix[row][column] += matrix[row][colAux];
                            matrix[row][colAux] = ZERO;
                        }
                    }
                }
            }
        }
        matrixG = matrix;
        arrangeRight();
    }

    private void arrangeRight() {
        for (int row = ZERO; row < MAX_SIZE; row++) {
            for (int column = ZERO; column < MAX_SIZE; column++) {
                if (matrixG[row][column] == ZERO) {
                    for (int colAux = column - 1; colAux >= ZERO; colAux--) {
                        if (matrixG[row][colAux] != ZERO) {
                            matrixG[row][column] = matrixG[row][colAux];
                            matrixG[row][colAux] = ZERO;
                        }
                    }
                }
            }
        }
        showMatrix();
    }

    public void downMove(int[][] matrix) {
    }

    public void leftMove(int[][] matrix) {
        for (int row = ZERO; row < MAX_SIZE; row++) {
            for (int column = ZERO; column < MAX_SIZE; column++) {
                if (matrix[row][column] != ZERO) {
                    for (int colAux = column + 1; colAux < MAX_SIZE; colAux++) {
                        if (matrix[row][colAux] != ZERO && matrix[row][column] == matrix[row][colAux]) {
                            matrix[row][column] += matrix[row][colAux];
                            matrix[row][colAux] = ZERO;
                        }
                    }
                }
            }
        }
        matrixG = matrix;
        arrangeLeft();
    }
    private void arrangeLeft() {
        for (int row = ZERO; row < MAX_SIZE; row++) {
            for (int column = ZERO; column < MAX_SIZE; column++) {
                if (matrixG[row][column] == ZERO) {
                    for (int colAux = column + 1; colAux < MAX_SIZE; colAux++) {
                        if (matrixG[row][colAux] != ZERO) {
                            matrixG[row][column] = matrixG[row][colAux];
                            matrixG[row][colAux] = ZERO;
                        }
                    }
                }
            }
        }
        showMatrix();
    }

    public void upMove(int[][] matrix) {
        for (int row = ZERO; row < MAX_SIZE; row++) {
            for (int column = ZERO; column < MAX_INDEX; column++) {
                if (matrix[column][row] != ZERO) {
                    int colAux = column + 1;
                    if (matrix[colAux][row] != ZERO && matrix[column][row] == matrix[colAux][row]) {
                        matrix[column][row] += matrix[colAux][row];
                        matrix[colAux][row] = ZERO;
                    } else {
                        if (matrix[colAux][row] == ZERO) {
                            matrix[colAux][row] = matrix[column][row];
                            matrix[column][row] = ZERO;
                        }
                    }
                }
            }
        }
        matrixG = matrix;
        orderUp();
    }

    private void orderUp() {
        for (int row = ZERO; row < MAX_SIZE; row++) {
            for (int column = ZERO; column < MAX_SIZE; column++) {
                if (matrixG[column][row] == ZERO) {
                    for (int colAux = column + 1; colAux < MAX_SIZE; colAux++) {
                        if (matrixG[colAux][row] != ZERO) {
                            matrixG[column][row] = matrixG[colAux][row];
                            matrixG[colAux][row] = ZERO;
                            break;
                        }
                    }
                }
            }
        }
        showMatrix();
    }

    public void showMatrix() {
        for (int row = ZERO; row < MAX_SIZE; row++) {
            for (int column = ZERO; column < MAX_SIZE; column++) {
                System.out.print(matrixG[row][column]);
            }
            System.out.println();
        }
    }

    public int[][] getMatrix() {
        return matrixG;
    }
}

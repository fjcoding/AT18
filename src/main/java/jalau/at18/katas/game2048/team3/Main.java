package jalau.at18.katas.game2048.team3;
import java.util.Scanner;//
// - funcion de busqueda de 1024
// - funcion sin movimientos
// - generado de num aleatorio
// - lectura de teclado 

public class Main {
    private static final int MAX_SIZE = 4;
    private static final int MAX_INDEX = 3;
    private static final int ZERO = 0;
    private int[][] matrixG = new int[MAX_SIZE][MAX_SIZE];
    public static void main(String[] args) {
        int[][] matrix = {{4, ZERO, ZERO, 4},
                          {2, ZERO, ZERO, 4},
                          {ZERO,ZERO,ZERO, 8},
                          {4, ZERO, 4, 2}};
        Main main = new Main();
        // main.downMove(matrix);
        main.readMoves(matrix);
        
    }
    // {{2, 0, 2, 0},
    //  {0, 0, 2, 2},
    //  {2, 2, 2, 2},
    //  {2, 0, 2, 2}};

    //0 0 0 4
    //0 0 0 4
    //0 0 0 8
    //0 0 4 2


    public void readMoves(int[][] matrix){
        String input;
        Scanner data = new Scanner(System.in);
        input=data.next();

        switch (input) {
            case "a":
                leftMove(matrix);
                break;
            case "w":
                upMove(matrix);
                break;
            case "s":
                downMove(matrix);
                break;
            case "d":
                rightMove(matrix);
                break;
            default:
                break;
        }
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
        didYouWin();
    }

    private void arrangeRight() {
        for (int row = ZERO; row < MAX_SIZE; row++) {
            for (int column = MAX_INDEX; column >= ZERO; column--) {
                if (matrixG[row][column] == ZERO) {
                    for (int colAux = column - 1; colAux >= ZERO; colAux--) {
                        if (matrixG[row][colAux] != ZERO) {
                            matrixG[row][column] = matrixG[row][colAux];
                            matrixG[row][colAux] = ZERO;
                            break;
                        }
                    }
                }
            }
        }
        showMatrix();
        
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
        didYouWin();
    }
    private void arrangeLeft() {
        for (int row = ZERO; row < MAX_SIZE; row++) {
            for (int column = ZERO; column < MAX_SIZE; column++) {
                if (matrixG[row][column] == ZERO) {
                    for (int colAux = column + 1; colAux < MAX_SIZE; colAux++) {
                        if (matrixG[row][colAux] != ZERO) {
                            matrixG[row][column] = matrixG[row][colAux];
                            matrixG[row][colAux] = ZERO;
                            break;
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
        didYouWin();
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

    public void downMove(int[][] matrix) {
        for (int i = ZERO; i < MAX_SIZE; i++) {
            for (int j = MAX_INDEX; j > ZERO; j--) {
                if(matrix[j][i] != ZERO) {
                    int j2 = j-1;
                    if (matrix[j2][i] != ZERO && matrix[j][i] == matrix[j2][i]) {
                        matrix[j][i] =  matrix[j][i] + matrix[j2][i];
                        matrix[j2][i] = ZERO;
                    } else {
                        if (matrix[j2][i] == ZERO) {
                            matrix[j2][i] = matrix[j][i];
                            matrix[j][i] = ZERO;
                        }
                    }
                    break;  
                }
                

            }
        }
        matrixG = matrix;
        arrangeDown();
        didYouWin();
    }
    public void arrangeDown() {
        for(int i = 0; i < MAX_SIZE ; i++) {
            for(int j = 0; j < MAX_SIZE; j++) {
                if(matrixG[j][i]==0){
                    for (int j2 = j-1; j2 >= ZERO; j2--) {
                        if(matrixG[j2][i] != ZERO){
                            matrixG[j][i] = matrixG[j2][i];
                            matrixG[j2][i] = ZERO;
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
                System.out.print(matrixG[row][column] + " ");
            }
            System.out.println();
        }
    }

    public int[][] getMatrix() {
        return matrixG;
    }

    public boolean didYouWin(){
        for (int row = ZERO; row < MAX_SIZE; row++) {
            for (int column = ZERO; column < MAX_SIZE; column++) {
                if(matrixG[row][column] == 2048){
                    return true;

                } else {
                    readMoves(matrixG);
                }
            }
        }
        return false;

    }
}

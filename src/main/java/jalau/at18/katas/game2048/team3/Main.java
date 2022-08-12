package jalau.at18.katas.game2048.team3;
import java.util.Scanner;//
import java.util.Random;

// - funcion de busqueda de 1024
// - funcion sin movimientos
// - generado de num aleatorio
// - lectura de teclado 

public class Main {
    private static final int MAX_SIZE = 4;
    private static final int MAX_INDEX = 3;
    private static final int ZERO = 0;
    private static final int MIN_VAL = 0;
    private static final int MAX_VAL = 1;
    private static final int PRINCIPAL_NUMBER = 2;
    private int[][] matrixG = new int[MAX_SIZE][MAX_SIZE];
    public static void main(String[] args) {
        int[][] matrix = {{ZERO, ZERO, ZERO, ZERO},
                          {ZERO, ZERO, ZERO, ZERO},
                          {ZERO, ZERO, ZERO, ZERO},
                          {ZERO, ZERO, ZERO, ZERO}};
        Main main = new Main();
        main.initializeMatrix(matrix);
        while (main.didYouWin() == false){
            main.readMoves(matrix);
        }
    }
    // {{2, 0, 2, 0},
    //  {0, 0, 2, 2},
    //  {2, 2, 2, 2},
    //  {2, 0, 2, 2}};
    /*
     *  int[][] matrix = {{2, ZERO, 2, ZERO},
                          {ZERO, 4, 2, ZERO},
                          {ZERO, ZERO, 4, ZERO},
                          {2, ZERO, ZERO, ZERO}};
     */
    //0 0 0 4
    //0 0 0 4
    //0 0 0 8
    //0 0 4 2
    public int [] randomPair(){
        Random rnd = new Random();
        int randomPositionI = rnd.nextInt(MAX_INDEX ) + ZERO;
        int randomPositionJ = rnd.nextInt(MAX_INDEX ) + ZERO;
        int [] result = {randomPositionI, randomPositionJ};
        return result;
    }

    public int randomNumber(){
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(MAX_VAL) + MIN_VAL;
        if (randomNumber == ZERO) {
            return PRINCIPAL_NUMBER;
        } else {
            return MAX_SIZE;
        }
    }

    public void initializeMatrix(int [][] matrix) {    
        int randomPositionI = randomPair()[0];
        int randomPositionJ = randomPair()[1];
        int randomPositionI2 = ZERO;
        int randomPositionJ2 = ZERO;
        do{
            randomPositionI2 = randomPair()[0];
            randomPositionJ2 = randomPair()[1];
        } while (randomPositionI == randomPositionI2 && randomPositionJ == randomPositionJ2);
        matrix[randomPositionI][randomPositionJ] = randomNumber();
        matrix[randomPositionI2][randomPositionJ2] = randomNumber();
        System.out.println(randomPositionI + " - " + randomPositionJ);
        System.out.println(randomPositionI2 + " - " + randomPositionJ2);
        matrixG=matrix;
    }

    public void generateRandomNumbers() {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(MAX_VAL) + MIN_VAL;
        int randomPositionI = rnd.nextInt(MAX_SIZE ) + ZERO;
        int randomPositionJ = rnd.nextInt(MAX_INDEX ) + ZERO;
    }

    public void readMoves(int[][] matrix) {
        String input;
        Scanner data = new Scanner(System.in);
        input = data.next();
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
        for (int row = ZERO; row < MAX_SIZE; row++) {
            for (int column = MAX_INDEX; column > ZERO; column--) {
                if(matrix[column][row] != ZERO) {
                    int columnAux = column - 1;
                    if (matrix[columnAux][row] != ZERO && matrix[column][row] == matrix[columnAux][row]) {
                        matrix[column][row] =  matrix[column][row] + matrix[columnAux][row];
                        matrix[columnAux][row] = ZERO;
                    } else {
                        if (matrix[columnAux][row] == ZERO) {
                            matrix[columnAux][row] = matrix[column][row];
                            matrix[column][row] = ZERO;
                        }
                    }

                }
            }
        }
        matrixG = matrix;
        arrangeDown();
    }

    public void arrangeDown() {
        for(int row = ZERO; row < MAX_SIZE ; row++) {
            for(int column = MAX_INDEX; column > ZERO; column--) {
                if(matrixG[column][row] == ZERO){
                    for (int columnAux = column-1; columnAux >= ZERO; columnAux--) {
                        if(matrixG[columnAux][row] != ZERO){
                            matrixG[column][row] = matrixG[columnAux][row];
                            matrixG[columnAux][row] = ZERO;
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

    public boolean didYouWin() {
        for (int row = ZERO; row < MAX_SIZE; row++) {
            for (int column = ZERO; column < MAX_SIZE; column++) {
                if(matrixG[row][column] == 2048) {
                    System.out.println("WINNER!!");
                    return true;
                }
            }
        }
       
        return false; 
    }
}

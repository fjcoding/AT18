package jalau.at18.katas.game2048.team1;

public class Board {
    private int[][] matrix;
    public static final int WIN_POINT = 2048;
    public Board(int boardSize) {
        this.matrix = new int[boardSize][boardSize];
    }
    public void printBoard(int[][] matrixToPrint) {
        System.out.println("\n-----------------------------------------------------------------");
        for (int row = 0; row < matrixToPrint.length; row++) {
            System.out.print("|\t");
            for (int column = 0; column < matrixToPrint.length; column++) {
                if (matrixToPrint[row][column] == 0) {
                    System.out.print(" " + "\t | \t");
                } else {
                    System.out.print(matrixToPrint[row][column] + "\t | \t");
                }
            }
            System.out.println("\n-----------------------------------------------------------------");
        }
    }
    public int[][] getMatrix() {
        return this.matrix;
    }
    public void setMatrix(int[][] matrixToSet) {
        this.matrix = matrixToSet;
    }

    public Boolean canRowSlide(int[][] matrixToCheck) {
        boolean check = false;
        for (int row = 1; row < matrixToCheck.length; row++) {
            for (int column = 0; column < matrixToCheck.length; column++) {
                if (matrixToCheck[row][column] == matrixToCheck[row - 1][column]) {
                    check = true;
                }
            }
        }
        return check;
    }

    public Boolean canColumnSlide(int[][] matrixToCheck) {
        boolean check = false;
        for (int column = 1; column < matrixToCheck.length; column++) {
            for (int row = 0; row < matrixToCheck.length; row++) {
                if (matrixToCheck[row][column] == matrixToCheck[row][column - 1]) {
                    check = true;
                }
            }
        }
        return check;
    }

    public Boolean got2048(int[][] matrixToCheck) {
        for (int row = 0; row < matrixToCheck.length; row++) {
            for (int column = 0; column < matrixToCheck.length; column++) {
                if (matrixToCheck[row][column] == WIN_POINT) {
                    return true;
                }
            }
        }
        return false;
    }
    public int countZerosMatrix(int[][] matrixToCheck) {
        int countZeros = 0;
        for (int row = 0; row < matrixToCheck.length; row++) {
            for (int column = 0; column < matrixToCheck.length; column++) {
                if (matrixToCheck[row][column] == 0) {
                    countZeros++;
                }
            }
        }
        return countZeros;
    }
    public boolean isGameOver(int[][] matrixToCheck) {
        return countZerosMatrix(matrixToCheck) == 0 && !canRowSlide(matrixToCheck) && !canColumnSlide(matrixToCheck);
    }
}

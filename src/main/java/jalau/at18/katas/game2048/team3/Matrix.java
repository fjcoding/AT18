package jalau.at18.katas.game2048.team3;

public class Matrix {
    public int[][] matrix;
    public int[][] oldmatrix;
    public final int MATRIXSIZE = 4;
    public final int ZERO = 0;
    public final int TOTAL_TILES = MATRIXSIZE * MATRIXSIZE;

    public Matrix() {
        matrix = new int[MATRIXSIZE][MATRIXSIZE];
        oldmatrix = new int[MATRIXSIZE][MATRIXSIZE];
    }

    public boolean areThereSpacesLeft() {
        int spacesOccupied = 0;
        for (int row = ZERO; row < MATRIXSIZE; row++) {
            for (int column = ZERO; column < MATRIXSIZE; column++) {
                if (matrix[row][column] != 0) {
                    spacesOccupied = spacesOccupied + 1;
                }
            }
        }
        oldmatrix = matrix;
        return spacesOccupied < TOTAL_TILES;
    }

    public boolean didMatrixChange() {
        if (oldmatrix == matrix) {
            return false;
        }
        return true;
    }
}
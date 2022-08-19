package jalau.at18.spaceinvaders;

public class Board {
    private static final int MAX_SIZE = 10;
    private char[][] matrix;
    
    public Board() {
        matrix = new char[MAX_SIZE][MAX_SIZE];
        initialize();
    }

    private void initialize() {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length; column++) {
                matrix[row][column] = '*';
            }
        }
    }

    @Override
    public String toString() {
        String showBoard = "";
        showBoard += "-----------------------" + "\n";
        for (int row = 0; row < matrix.length; row++) {
            showBoard += "| ";
            for (int column = 0; column < matrix.length; column++) {
                showBoard += matrix[row][column] + " ";
            }
            showBoard += "|" + "\n";
        }
        showBoard += "-----------------------" + "\n";
        return showBoard;
    }

    public void setElement(int posX, int posY, char newContent) {
        matrix[posX][posY] = newContent;
    }

    public char[][] getMatrix() {
        return matrix;
    }
    public int getMaxSize() {
        return MAX_SIZE;
    }
}

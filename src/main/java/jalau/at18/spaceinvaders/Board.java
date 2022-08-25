package jalau.at18.spaceinvaders;

public class Board {
    private static final int MAX_SIZE = 10;
    private char[][] matrix;
    private Shield shield;

    public Board() {
        matrix = new char[MAX_SIZE][MAX_SIZE];
        shield = new Shield();
        initialize();
    }

    private void initialize() {
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                if (shield.existBlockInPosition(col, row)) {
                    matrix[col][row] = shield.getCharacter(col, row);
                } else {
                    matrix[col][row] = '*';
                }
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

    public char getElement(int posX, int posY) {
        return matrix[posX][posY];
    }

    public char[][] getMatrix() {
        return matrix;
    }

    public int getMaxSize() {
        return MAX_SIZE;
    }
}

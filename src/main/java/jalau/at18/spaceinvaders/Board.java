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
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (shield.existBlockInPosition(row, col)) {
                    matrix[row][col] = shield.getCharacter(row, col);
                } else {
                    matrix[row][col] = '*';
                }
            }
        }
    }

    public void setElement(int posX, int posY, char newContent) {
        matrix[posX][posY] = newContent;
    }

    public int getElement(int posX, int posY) {
        return matrix[posX][posY];
    }

    public char[][] getMatrix() {
        return matrix;
    }

    public int getMaxSize() {
        return MAX_SIZE;
    }

    @Override
    public String toString() {
        String showBoard = "";
        showBoard += "-----------------------" + "\n";
        for (int row = 0; row < matrix.length; row++) {
            showBoard += "| ";
            for (int col = 0; col < matrix.length; col++) {
                showBoard += matrix[row][col] + " ";
            }
            showBoard += "|" + "\n";
        }
        showBoard += "-----------------------" + "\n";
        return showBoard;
    }
}

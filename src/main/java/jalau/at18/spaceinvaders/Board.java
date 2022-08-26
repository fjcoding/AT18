package jalau.at18.spaceinvaders;

public class Board {
    private static final int MAX_SIZE = 10;
    private char[][] matrix;
    private Shield shield;
    private Alien alien;
    private boolean shipAlive = true;
    private int score;

    public Board() {
        matrix = new char[MAX_SIZE][MAX_SIZE];
        shield = new Shield();
        alien = new Alien();
        score = 0;
        initialize();
    }

    private void initialize() {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (shield.existBlockInPosition(row, col)) {
                    matrix[row][col] = shield.getCharacterOfBlock(row, col);
                } else if (alien.exist(row, col)) {
                    matrix[row][col] = alien.getSimbol();
                } else {
                    matrix[row][col] = ' ';
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

    public void clearPosition(int posX, int posY) {
        matrix[posX][posY] = ' ';
    }

    public boolean existShield(int posX, int posY) {
        return shield.existBlockInPosition(posX, posY);
    }

    public void impactShield(int posX, int posY) {
        char charPos = shield.impactBlock(posX, posY);
        setElement(posX, posY, charPos);
    }
    private void changesAlienPositions() {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (alien.exist(row, col)) {
                    matrix[row][col] = alien.getSimbol();
                }
            }
        }
    }

    private void clearMatrix() {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col] == alien.getSimbol()) {
                    matrix[row][col] = ' ';
                }
            }
        }
    }

    public boolean isAlive() {
        if (alien.exist(8, 9)) {
            shipAlive = false;
        }
        return shipAlive;
    }

    public void moveAliens() {
        //aliensList.alienMovement();
        alien.alienMovement();
        clearMatrix();
        changesAlienPositions();
    }

    public boolean existAlien(int posX, int posY) {

        return alien.exist(posX, posY);
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

    public void alienImpact(int posX, int posY) {
        score += 10;
        alien.impact(posX, posY);
    }

    public int getScore() {
        return score;
    }
}

package jalau.at18.spaceinvaders;

public class Bullet {
    private static final int INITIAL_POSY = 8;
    private static final int INITIAL_POSX = 4;
    private static final int MATRIX_LENGHT = 9;
    private int posX;
    private int posY;
    private boolean statusBullet;
    private Board board;

    public Bullet(Board board) {
        // board = new Board();
        posX = INITIAL_POSX;
        posY = INITIAL_POSY;
        statusBullet = false;
        this.board = board;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public void moveUp() {

        for (int index = 0; index < MATRIX_LENGHT; index++) {
            for (int jindex = 0; jindex <= MATRIX_LENGHT; jindex++) {
                if (board.getElement(index, jindex) == '|') {
                    if (index == 0) {
                        board.setElement(index, jindex, '*');
                    } else {
                        board.setElement(index - 1, jindex, '|');
                        board.setElement(index, jindex, '*');
                    }
                }
            }
        }
        // board.setElement(posY, posX, '|');
        // board.setElement(posY + 1, posX, '*');
        // posY--;
    }

    public void createBullet(int posXShip) {
        posX = posXShip;
        board.setElement(posY, posX, '|');
    }

    public void destroyBullet() {
        statusBullet = false;
    }

    public void resetBullet() {
        posY = INITIAL_POSY;
    }

    public void setStatusBullet() {
        statusBullet = true;
    }

    public boolean getStatusBullet() {
        return statusBullet;
    }
}

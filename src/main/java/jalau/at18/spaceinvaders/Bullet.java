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
                char centerchar = board.getElement(index, jindex);
                if (centerchar == '|') {
                    bulletMethod(index, jindex);
                } else if (centerchar == 'X') {
                    destroyBullet(index, jindex);
                }
            }
        }
    }

    public void createBullet(int posXShip) {
        posX = posXShip;
        if (board.getElement(posY, posX) == '#') {
            board.setElement(posY, posX, 'X');

        } else {
            board.setElement(posY, posX, '|');
        }
    }

    public void bulletMethod(int index, int jindex) {
        if (index > 0) {
            char upchar = board.getElement(index - 1, jindex);
            if (upchar == '*' || upchar == 'X') {
                travelBullet(index - 1, jindex);
                destroyBullet(index, jindex);
            } else if (upchar == '#' || upchar == '%') {
                makeExplosion(index - 1, jindex);
                destroyBullet(index, jindex);
                //kill alien method, get a boolean[] of aliens all true and if a bullet impacts the make them false one by one
            }
        } else {
            destroyBullet(index, jindex); // exception when bullet is in top border
        }
    }

    public void destroyBullet(int posXd, int posYd) {
        board.setElement(posXd, posYd, '*');
    }

    public void makeExplosion(int posXm, int posYm) {
        board.setElement(posXm, posYm, 'X');
    }

    public void travelBullet(int posXt, int posYt) {
        board.setElement(posXt, posYt, '|');
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

package jalau.at18.spaceinvaders;

public class Bullet {
    private static final int INITIAL_POSY = 8;
    private static final int INITIAL_POSX = 4;
    private int posX;
    private int posY;
    private boolean statusBullet;
    private Board board;

    public Bullet(Board board) {
        //board = new Board();
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
        board.setElement(posY, posX, '|');
        board.setElement(posY + 1, posX, '*');
        posY--;

    }
    public void destroyBullet() {
        statusBullet = false;
    }
    public void createBullet(int posXShip) {
        posX = posXShip;


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

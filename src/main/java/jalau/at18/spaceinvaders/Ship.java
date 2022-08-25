package jalau.at18.spaceinvaders;

public class Ship {
    private static final int MAX_LIFES = 3;
    private static final int POS_ROW_INITIAL = 9;
    private static final int POS_COL_INITIAL = 4;
    private int lifes;
    private Position position;
    private ShipBullet bullet;

    public Ship() {
        lifes = MAX_LIFES;
        position = new Position(POS_ROW_INITIAL, POS_COL_INITIAL);
    }

    public void shoot(Board board){
        bullet = new ShipBullet(position.getPosX(), position.getPosY());
        bullet.move(board);
    }

    public void moveBullets(Board board) {
        bullet.move(board);
    }

    public void subtrasctLifes() {
        lifes -= 1;
    }

    public int getLifes() {
        return lifes;
    }

    public int getPosX() {
        return position.getPosX();
    }

    public int getPosY() {
        return position.getPosY();
    }

    public void moveLeft() {
        position.moveLeft();
    }

    public void moveRight() {
        position.moveRigth();
    }

    public boolean getIsAlive() {
        int zero = 0;
        return lifes > zero;
    }

    public void reStartPosition() {
        position = new Position(POS_ROW_INITIAL, POS_COL_INITIAL);
    }
}

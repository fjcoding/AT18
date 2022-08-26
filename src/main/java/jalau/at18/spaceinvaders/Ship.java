package jalau.at18.spaceinvaders;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    private static final int MAX_LIFES = 3;
    private static final int POS_ROW_INITIAL = 9;
    private static final int POS_COL_INITIAL = 4;
    private static final int ZERO = 0;
    private int lifes;
    private Position position;
    private List<ShipBullet> bullets;

    public Ship() {
        lifes = MAX_LIFES;
        position = new Position(POS_ROW_INITIAL, POS_COL_INITIAL);
        bullets = new ArrayList<>();
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
        return lifes > ZERO;
    }

    public void reStartPosition() {
        position = new Position(POS_ROW_INITIAL, POS_COL_INITIAL);
    }

    public void shoot(Board board) {
        ShipBullet bullet = new ShipBullet(position.getPosX(), position.getPosY());
        bullets.add(bullet);
    }

    public void alienImpact() {

    }

    public void moveBullets(Board board) {
        for (int iterator = ZERO; iterator < bullets.size(); iterator++) {
            ShipBullet bullet = bullets.remove(iterator);
            bullet.move(board);
            if (bullet.getRepresentation() != ' ') {
                bullets.add(bullet);
            }
        }
    }

    public boolean isThereBullets() {
        return bullets.size() > ZERO;
    }
}

package jalau.at18.spaceinvaders;

public class Ship {
    private static final int MAX_LIFES = 3;
    private static final int POS_Y_INITIAL = 9;
    private static final int POS_X_INITIAL = 4;
    private int lifes;
    private int posX;
    private int posY;
    private boolean isAlive;

    public Ship() {
        lifes = MAX_LIFES;
        posX = POS_X_INITIAL;
        posY = POS_Y_INITIAL;
        isAlive = true;

    }

    public void subtrasctLifes() {
        lifes -= 1;
    }

    public void setPosX(int newPosition) {
        posX = newPosition;
    }

    public int getLifes() {
        return lifes;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public void moveLeft() {
        posX -= 1;
    }

    public void moveRight() {
        posX += 1;
    }

    public void setIsDead() {
        isAlive = false;
    }

    public void setIsAlive() {
        isAlive = true;
    }

    public boolean getIsAlive() {
        return isAlive;
    }

    public void reStartShip() {
        posX = POS_X_INITIAL;
        posY = POS_Y_INITIAL;
    }
}

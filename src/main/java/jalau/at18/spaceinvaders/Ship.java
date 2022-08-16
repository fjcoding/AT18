package jalau.at18.spaceinvaders;

public class Ship {
    private static final int MAX_LIFES = 3;
    private int lifes;
    private int posX;
    private int posY;
    public Ship() {
        lifes = MAX_LIFES;
    }

    public void setLifes(int updateLifes) {
        lifes = updateLifes;
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
}

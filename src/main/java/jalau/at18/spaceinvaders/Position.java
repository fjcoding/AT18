package jalau.at18.spaceinvaders;

public class Position {
    private static final int MAX_SIZE = 10;
    private int posX;
    private int posY;
    public Position(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }
    private boolean validatePosition(int numberPos) {
        boolean resp = false;
        if (numberPos >= 0 && numberPos < MAX_SIZE) {
            resp = true;
        }
        return resp;
    }
    public void moveUp() {
        if (validatePosition(posX - 1)) {
            posX = posX - 1;
        }
    }
    public void moveDown() {
        if (validatePosition(posX + 1)) {
            posX = posX + 1;
        }
    }
    public void moveRigth() {
        if (validatePosition(posY + 1)) {
            posY = posY + 1;
        }
    }
    public void moveLeft() {
        if (validatePosition(posY - 1)) {
            posY = posY - 1;
        }
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }
}

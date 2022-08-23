package jalau.at18.tdd;

public class Position {

    private int xPos;
    private int yPos;

    public Position(int x, int y) {
        xPos = x;
        yPos = y;
    }

    public int getX() {
        return xPos;
    }

    public int getY() {
        return yPos;
    }

    public void moveUp() {
        xPos--;
    }

    public void moveDown() {
        xPos++;
    }

    public void moveLeft() {
        yPos--;
    }

    public void moveRight() {
        yPos++;
    }
}

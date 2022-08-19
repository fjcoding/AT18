package jalau.at18.spaceinvaders;

public class Bullet {

    private int posX;
    private int posY;
    

    public Bullet() {
        board = new Board();
        posX = 5;
        posY = 9;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public void moveUp(int shipx) {
        posX = shipx;
        posY--;
        
    }

}

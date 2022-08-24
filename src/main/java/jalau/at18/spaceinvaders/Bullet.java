package jalau.at18.spaceinvaders;

public abstract class Bullet {
    protected Position position;
    private boolean stillAlive;

    public Bullet(int posX, int posY) {
        position = new Position(posX, posY);
        stillAlive = true;
    }

    public int getPosX() {
        return position.getPosX();
    }

    public int getPosY() {
        return position.getPosY();
    }

    public void impact(){
        stillAlive = false;
    }

    public boolean getStatusBullet() {
        return stillAlive;
    }

    public abstract void move(Board board);
}

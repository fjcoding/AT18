package jalau.at18.spaceinvaders;

public class ShipBullet extends Bullet{
    private char representation = '|';

    public ShipBullet(int posX, int posY) {
        super(posX, posY);
    }

    @Override
    public void move(Board board) {
        position.moveUp();
        board.setElement(position.getPosX(), position.getPosY(), representation);
    }
}

package jalau.at18.spaceinvaders;

public class AlienBullet extends Bullet {
    private char representation = 'T';

    public AlienBullet(int posX, int posY) {
        super(posX, posY);
    }

    @Override
    public void move(Board board) {
        position.moveDown();
        board.setElement(position.getPosX(), position.getPosY(), representation);
    }
}

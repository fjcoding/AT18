package jalau.at18.spaceinvaders;

public class ShipBullet extends Bullet {
    private char representation = '|';
    private boolean isInit;
    public ShipBullet(int posX, int posY) {
        super(posX, posY);
        isInit = true;
    }

    @Override
    public void move(Board board) {
        if (!isInit) {
            board.clearPosition(position.getPosX(), position.getPosY());
        }
        position.moveUp();
        if (board.getElement(position.getPosX(), getPosY()) == '%') {
            System.out.println(" es alien ");
            representation = '*';
        } else {
            if (board.existShield(position.getPosX(), position.getPosY())) {
                board.impactShould(position.getPosX(), position.getPosY());
                representation = '*';
            } else {
                board.setElement(position.getPosX(), position.getPosY(), representation);
            }
        }
        isInit = false;
    }

    public char getRepresentation() {
        return representation;
    }
}

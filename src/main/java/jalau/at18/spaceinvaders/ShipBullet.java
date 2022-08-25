package jalau.at18.spaceinvaders;

public class ShipBullet extends Bullet{
    private char representation = '|';

    public ShipBullet(int posX, int posY) {
        super(posX, posY);
    }

    @Override
    public void move(Board board) {
        board.setElement(position.getPosX(), position.getPosY(), ' ');
        position.moveUp();
        if(board.getElement(position.getPosX(), getPosY()) == '%') {
            System.out.println(" es alien ");
        }else {
            if(board.existShield(position.getPosX(),position.getPosY())) {
                board.impactShould(position.getPosX(),position.getPosY());
            }else{
                board.setElement(position.getPosX(), position.getPosY(), representation);
            }
        }
    }

    public char getRepresentation() {
        return representation;
    }
}

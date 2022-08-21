package jalau.at18.spaceinvaders;
import java.awt.event.KeyEvent;
public class Game {
    private Ship ship;
    private Board board;
    private AliensList aliensList;
    private static final int DELAY = 600;
    private static final int LIMIT_ALIEN_DOWN = 8;
    private static final int SIZE_BOARD = 9;
    private static final int DELAY_ALIENS_MOVEMENT = 3;
    private static final int LIFES_SHIP = 3;

    // private KeyboardObserver keyboardObserver;
    public Game() {
        board = new Board();
        ship = new Ship();
        aliensList = new AliensList(board);
    }
    public void move() throws InterruptedException {
        int cont = 0;
        KeyboardReader keyboardObserver = new KeyboardReader();
        keyboardObserver.start();
        for (int lifes = 0; lifes < LIFES_SHIP; lifes++) {
            board.setElement(ship.getPosY(), ship.getPosX(), '^');
            System.out.println(board.toString());

            while (ship.getIsAlive()) {
                if (cont % DELAY_ALIENS_MOVEMENT == 0) {
                    aliensList.alienMovement();
                }
                if (keyboardObserver.hasKeyEvents()) {
                    KeyEvent event = keyboardObserver.getEventFromTop();
                    if (event.getKeyCode() == KeyEvent.VK_LEFT && ship.getPosX() > 0) {
                        ship.moveLeft();
                        board.setElement(ship.getPosY(), ship.getPosX(), '^');
                        board.setElement(ship.getPosY(), ship.getPosX() + 1, '*');
                    } else if (event.getKeyCode() == KeyEvent.VK_RIGHT && ship.getPosX() < SIZE_BOARD) {
                        ship.moveRight();
                        board.setElement(ship.getPosY(), ship.getPosX(), '^');
                        board.setElement(ship.getPosY(), ship.getPosX() - 1, '*');
                    } else if (event.getKeyCode() == KeyEvent.VK_SPACE) {

                        System.out.println("fire");
                        ship.setIsDead();
                        ship.subtrasctLifes();
                        board.setElement(ship.getPosY(), ship.getPosX(), '*');
                        System.out.println("Died");
                        ship.reStartShip();
                    }

                }
                System.out.println(board.toString());
                System.out.println("Lifes: " + ship.getLifes());
                cont++;
                Thread.sleep(DELAY);

            }
            Thread.sleep(DELAY);
            ship.setIsAlive();
        }
        System.out.println("Game Over");
        System.exit(0);
    }

    public int getPosXShip() {
        return ship.getPosX();
    }

    public int getPosYShip() {
        return ship.getPosY();
    }
    public int getLifes() {
        return ship.getLifes();
    }
}

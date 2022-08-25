package jalau.at18.spaceinvaders;

import java.awt.event.KeyEvent;

public class Game {
    private Ship ship;
    private Board board;
    private AliensList aliensList;
    private Bullet bullet;
    private static final int DELAY = 600;
    private static final int LIMIT_ALIEN_DOWN = 8;
    private static final int SIZE_BOARD = 9;
    private static final int DELAY_ALIENS_MOVEMENT = 3;
    private static final int CODE_LEFT_KEY = 37;
    private static final int CODE_RIGHT_KEY = 39;
    private static final int CODE_UP_KEY = 38;
    private static final int CODE_SPACE_KEY = 32;
    private KeyboardReader keyboardObserver;
    public Game() {
        board = new Board();
        ship = new Ship();
        aliensList = new AliensList(board);
        bullet = new Bullet(board);
        keyboardObserver = new KeyboardReader();
        keyboardObserver.start();
    }
    public void move() throws InterruptedException {

        int cont = 0;
        int code = 0;
        while (ship.getLifes() > 0) {
            if (cont % DELAY_ALIENS_MOVEMENT == 0) {
                aliensList.alienMovement();
            }
            bullet.moveUp();
            if (keyboardObserver.hasKeyEvents()) {
                KeyEvent event = keyboardObserver.getEventFromTop();
                code = event.getKeyCode();
                runGame(code);
            }
            cont++;
            System.out.println(board.toString());
            System.out.println("Lifes: " + ship.getLifes());
            Thread.sleep(DELAY);
        }
        System.out.println("Game Over");
        System.exit(0);
    }
    public void runGame(int code) throws InterruptedException {
        switch (code) {
            case CODE_RIGHT_KEY: //Right
                if (ship.getPosX() < SIZE_BOARD) {
                    ship.moveRight();
                    board.setElement(ship.getPosY(), ship.getPosX(), '^');
                    board.setElement(ship.getPosY(), ship.getPosX() - 1, '*');
                }
                break;
            case CODE_LEFT_KEY:    //Left
                if (ship.getPosX() > 0) {
                    ship.moveLeft();
                    board.setElement(ship.getPosY(), ship.getPosX(), '^');
                    board.setElement(ship.getPosY(), ship.getPosX() + 1, '*');
                }
                break;
            case CODE_UP_KEY:    // up
                ship.setIsDead();
                ship.subtrasctLifes();
                board.setElement(ship.getPosY(), ship.getPosX(), '*');
                System.out.println("Died");
                ship.reStartShip();
                break;
            case CODE_SPACE_KEY:    //space
                bullet.createBullet(ship.getPosX());
                break;
            default:
                break;
        }
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

package jalau.at18.spaceinvaders;

import java.awt.event.KeyEvent;

public class Game {
    private Ship ship;
    private Board board;
    private static final int DELAY = 600;
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
        keyboardObserver = new KeyboardReader();
        keyboardObserver.start();
    }
    public void move() throws InterruptedException {
        int cont = 0;
        int code = 0;
        while (ship.getLifes() > 0 && board.isAlive()) {
            board.setElement(ship.getPosX(), ship.getPosY(), '^');
            if (cont % DELAY_ALIENS_MOVEMENT == 0) {
                board.moveAliens();
            }
            //bullet.moveUp();
            if (keyboardObserver.hasKeyEvents()) {
                KeyEvent event = keyboardObserver.getEventFromTop();
                code = event.getKeyCode();
                runGame(code);
            }
            cont++;
            System.out.println(board.toString());
            System.out.println("Lifes: " + ship.getLifes());
            if (ship.isThereBullets()) {
                ship.moveBullets(board);
            }
            System.out.println("Score: " + board.getScore());
            Thread.sleep(DELAY);
        }
        System.out.println("Game Over");
        System.exit(0);
    }
    public void runGame(int code) throws InterruptedException {

        switch (code) {
            case CODE_RIGHT_KEY: //Right
                if (ship.getPosY() < SIZE_BOARD) {
                    ship.moveRight();
                    board.setElement(ship.getPosX(), ship.getPosY(), '^');
                    board.setElement(ship.getPosX(), ship.getPosY() - 1, ' ');
                    System.out.println("derecha");
                }
                break;
            case CODE_LEFT_KEY:    //Left
                if (ship.getPosY() > 0) {
                    ship.moveLeft();
                    board.setElement(ship.getPosX(), ship.getPosY(), '^');
                    board.setElement(ship.getPosX(), ship.getPosY() + 1, ' ');
                }
                break;
            case CODE_UP_KEY:    // up
                ship.subtrasctLifes();
                board.setElement(ship.getPosX(), ship.getPosY(), ' ');
                System.out.println("Died");
                ship.reStartPosition();
                board.setElement(ship.getPosX(), ship.getPosY(), '^');
                board.setElement(ship.getPosX(), ship.getPosY(), ' ');
                //System.out.println(board.toString());
                break;
            case CODE_SPACE_KEY:    //space
                System.out.println("fire");
                ship.shoot(board);
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
    public boolean getStatusBullet() {
        return ship.isThereBullets();
    }

}
package jalau.at18.spaceinvaders;

import java.awt.event.KeyEvent;

public class Game {
    private Ship ship;
    private Board board;
    private AliensList aliensList;
    private static final int DELAY = 600;
    private static final int SIZE_BOARD = 9;
    private static final int DELAY_ALIENS_MOVEMENT = 3;

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
        board.setElement(ship.getPosX(), ship.getPosY(), '^');
        while (ship.getIsAlive()) {
            if (cont % DELAY_ALIENS_MOVEMENT == 0) {
                aliensList.alienMovement();
            }
            if (keyboardObserver.hasKeyEvents()) {
                KeyEvent event = keyboardObserver.getEventFromTop();
                if (event.getKeyCode() == KeyEvent.VK_LEFT && ship.getPosY() > 0) {
                    ship.moveLeft();
                    board.setElement(ship.getPosX(), ship.getPosY(), '^');
                    board.setElement(ship.getPosX(), ship.getPosY() + 1, '*');
                } else if (event.getKeyCode() == KeyEvent.VK_RIGHT && ship.getPosY() < SIZE_BOARD) {
                    ship.moveRight();
                    board.setElement(ship.getPosX(), ship.getPosY(), '^');
                    board.setElement(ship.getPosX(), ship.getPosY() - 1, '*');
                } else if (event.getKeyCode() == KeyEvent.VK_SPACE) {
                    System.out.println("fire");
                    ship.shoot(board);
                } else if (event.getKeyCode() == KeyEvent.VK_UP) {
                    ship.subtrasctLifes();
                    board.setElement(ship.getPosX(), ship.getPosY(), '*');
                    System.out.println("Died");
                    ship.reStartPosition();
                    board.setElement(ship.getPosX(), ship.getPosY(), '^');
                    board.setElement(ship.getPosX(), ship.getPosY(), '*');
                    System.out.println(board.toString());
                }
            }
            System.out.println(board.toString());
            System.out.println("Lifes: " + ship.getLifes());
            Thread.sleep(DELAY);
        }
        if(!ship.getIsAlive()) {
            Thread.sleep(DELAY);
            System.out.println("Game Over");
            System.exit(0);
            ship = new Ship();
        }
    }
}
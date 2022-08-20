package jalau.at18.spaceinvaders;

import java.awt.event.KeyEvent;

public class Game {
    private Ship ship;
    private Board board;
    private AliensList aliensList;
    private static final int DELAY = 600;
    private static final int LIMIT_ALIEN_DOWN = 8;
    private static final int SIZE_BOARD = 9;

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
        while (true) {
             if (cont % 3 == 0) {
                aliensList.alienMovement();
             }
            
            if (keyboardObserver.hasKeyEvents()) {
                KeyEvent event = keyboardObserver.getEventFromTop();
                // If "left arrow", then move the game piece to the left
                // System.out.print(event.getKeyCode());
                if (event.getKeyCode() == KeyEvent.VK_LEFT && ship.getPosX() > 0) {
                    ship.moveLeft();
                    board.setElement(ship.getPosY(), ship.getPosX(), '^');
                    board.setElement(ship.getPosY(), ship.getPosX() + 1, '*');
                    // System.out.println(ship.getPosX());
                } else if (event.getKeyCode() == KeyEvent.VK_RIGHT && ship.getPosX() < SIZE_BOARD) {
                    ship.moveRight();
                    board.setElement(ship.getPosY(), ship.getPosX(), '^');
                    board.setElement(ship.getPosY(), ship.getPosX() - 1, '*');
                } else if (event.getKeyCode() == KeyEvent.VK_SPACE) {

                    System.out.println("fire");
                }

            }
            System.out.println(board.toString());
            System.out.println(cont);
            cont++;
            Thread.sleep(DELAY);

        }
    }
    
    public int getPosXShip() {
        return ship.getPosX();
    }

    public int getPosYShip() {
        return ship.getPosY();
    }
}

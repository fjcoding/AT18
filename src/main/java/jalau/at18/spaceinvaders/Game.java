package jalau.at18.spaceinvaders;

import java.util.Scanner;
import java.awt.event.KeyEvent;

public class Game {
    private Ship ship;
    private Board board;
    private static final int DELAY = 600;
    // private KeyboardObserver keyboardObserver;

    public Game() throws InterruptedException {

        board = new Board();
        ship = new Ship();

    }

    public void move() throws InterruptedException {
        int cont = 0;
        KeyboardReader keyboardObserver = new KeyboardReader();
        keyboardObserver.start();
        while (true) {
            // Does the observer have any key events?
            if (keyboardObserver.hasKeyEvents()) {
                KeyEvent event = keyboardObserver.getEventFromTop();

                // If "left arrow", then move the game piece to the left
                // System.out.print(event.getKeyCode());
                if (event.getKeyCode() == KeyEvent.VK_LEFT) {
                    ship.moveLeft();
                    board.setElement(ship.getPosY(), ship.getPosX(), '^');
                    System.out.println(board.toString());
                    board.setElement(ship.getPosY(), ship.getPosX(), '*');
                    // System.out.println(ship.getPosX());
                } else if (event.getKeyCode() == KeyEvent.VK_RIGHT) {
                    ship.moveRight();
                    board.setElement(ship.getPosY(), ship.getPosX(), '^');
                    System.out.println(board.toString());
                    board.setElement(ship.getPosY(), ship.getPosX(), '*');
                } else if (event.getKeyCode() == KeyEvent.VK_SPACE) {

                    System.out.println("fire");
                }

            }
            System.out.println(board.toString());
            board.setElement(cont, ship.getPosX(), '1');
            cont++;
            Thread.sleep(DELAY);
        }
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        // entrada de un carácter

        while (true) {
            char instruction = scanner.next().charAt(0);

            if (instruction == 'a') {
                ship.moveLeft();
                board.setElement(ship.getPosY(), ship.getPosX(), '^');
                System.out.println(board.toString());
                board.setElement(ship.getPosY(), ship.getPosX(), '*');
                // System.out.println(ship.getPosX());

            }
            if (instruction == 'd') {
                ship.moveRight();
                board.setElement(ship.getPosY(), ship.getPosX(), '^');
                System.out.println(board.toString());
                board.setElement(ship.getPosY(), ship.getPosX(), '*');
                // System.out.println(ship.getPosX());

            }
            if (instruction == 'w') {
                System.out.println("Fire");
            }

        }

    }

}
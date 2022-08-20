package jalau.at18.spaceinvaders;

import java.awt.event.KeyEvent;

public class Game {
    private Ship ship;
    private Board board;
    private Aliens alien;
    private static final int LIMIT_ROW = 4;
    private static final int LIMIT_COLUMN = 2;
    private static final int DELAY = 600;
    private boolean alienFlag = true;
    private boolean trueFlag = true;
    private boolean falseFlag = false;
    private static final int LIMIT_ALIEN_DOWN = 8;
    private static final int SIZE_BOARD = 9;

    // private KeyboardObserver keyboardObserver;
    public Game() {
        board = new Board();
        ship = new Ship();
        alien = new Aliens();
    }

    public void runGame(char instruction) {

        // print alien matrix
        for (int row = 0; row < LIMIT_ROW; row++) {
            for (int column = 0; column < LIMIT_COLUMN; column++) {
                board.setElement(alien.getPosY()[column], alien.getPosX()[row], '%');
            }
        }
        System.out.println(board.toString());
        if (instruction == 'a' && ship.getPosX() > 0) {
            ship.moveLeft();
            board.setElement(ship.getPosY(), ship.getPosX(), '^');
            board.setElement(ship.getPosY(), ship.getPosX() + 1, '*');
        }
        if (instruction == 'd' && ship.getPosX() < SIZE_BOARD) {
            ship.moveRight();
            board.setElement(ship.getPosY(), ship.getPosX(), '^');
            board.setElement(ship.getPosY(), ship.getPosX() - 1, '*');
        }
        System.out.println(board.toString());
        if (instruction == 'w') {
            System.out.println("Fire");
        }

    }

    public void moveAlienRigth() {
        alien.alienRigth();
        for (int row = LIMIT_ROW - 1; row >= 0; row--) {
            for (int column = 0; column < 2; column++) {
                board.setElement(alien.getPosY()[column], alien.getPosX()[row], '%');
                System.out.println(board.toString());
                board.setElement(alien.getPosY()[column], alien.getPosX()[row] - 1, '*');
            }
        }
    }

    public void moveAlienLeft() {
        alien.alienLeft();
        for (int row = 0; row < LIMIT_ROW; row++) {
            for (int column = 0; column < 2; column++) {
                board.setElement(alien.getPosY()[column], alien.getPosX()[row], '%');
                System.out.println(board.toString());
                board.setElement(alien.getPosY()[column], alien.getPosX()[row] + 1, '*');
            }
        }
    }

    public void moveAlienDown() {
        alien.alienDown();
        for (int row = 0; row < LIMIT_ROW; row++) {
            for (int column = 0; column < 2; column++) {
                board.setElement(alien.getPosY()[column], alien.getPosX()[row], '%');
                System.out.println(board.toString());
                if (column == 1) {
                    board.setElement(alien.getPosY()[column] - 2, alien.getPosX()[row], '*');
                }
            }
        }
    }

    public void alienMovement() {
        if (alienFlag == trueFlag && alien.getPosX()[LIMIT_ROW - 1] <= SIZE_BOARD) {
            moveAlienRigth();
            if (alien.getPosX()[LIMIT_ROW - 1] == SIZE_BOARD) {
                moveAlienDown();
                alienFlag = false;
            }
        } else if (alienFlag == falseFlag || alien.getPosX()[0] == 0) {
            moveAlienLeft();
            if (alien.getPosX()[0] == 0) {
                moveAlienDown();
                alienFlag = true;
            }
        }
    }

    public void gameOver() {
        if (alien.getPosY()[1] == LIMIT_ALIEN_DOWN) {
            System.exit(0);
        }
    }

    public void move() throws InterruptedException {
        int cont = 0;
        KeyboardReader keyboardObserver = new KeyboardReader();
        keyboardObserver.start();
        runGame('a');
        while (true) {
            if (cont % LIMIT_ROW - 1 == 0) {
                alienMovement();
            }
            // alienMovement();
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
            System.out.println(cont);
            cont++;
            Thread.sleep(DELAY);
            gameOver();
        }
    }

    /*
     * public void run() {
     *
     * Scanner scanner = new Scanner(System.in);
     * // entrada de un carácter
     * while (true) {
     *
     * char direction = scanner.next().charAt(0);
     * if (direction == 'a') {
     *
     * char instruction = scanner.next().charAt(0);
     *
     * if (instruction == 'a') {
     *
     * ship.moveLeft();
     * board.setElement(ship.getPosY(), ship.getPosX(), '^');
     * System.out.println(board.toString());
     * board.setElement(ship.getPosY(), ship.getPosX(), '*');
     * // System.out.println(ship.getPosX());
     * // System.out.println(ship.getPosX());
     * }
     * if (instruction == 'd') {
     * ship.moveRight();
     * // board.setElement(alien.getPosX(), alien.getPosY(), '%')
     * board.setElement(ship.getPosY(), ship.getPosX(), '^');
     * System.out.println(board.toString());
     * board.setElement(ship.getPosY(), ship.getPosX(), '*');
     * // System.out.println(ship.getPosX());
     * }
     * // System.out.println(ship.getPosX());
     * if (instruction == 'w') {
     * System.out.println("Fire");
     * }
     * System.out.println(board.toString());
     * if (instruction == 'a' && ship.getPosX() > 0) {
     * ship.moveLeft();
     * board.setElement(ship.getPosY(), ship.getPosX(), '^');
     * board.setElement(ship.getPosY(), ship.getPosX() + 1, '*');
     * }
     * if (instruction == 'd' && ship.getPosX() < SIZE_BOARD) {
     * ship.moveRight();
     * board.setElement(ship.getPosY(), ship.getPosX(), '^');
     * board.setElement(ship.getPosY(), ship.getPosX() - 1, '*');
     * }
     * System.out.println(board.toString());
     * if (instruction == 'w') {
     * System.out.println("Fire");
     * }
     * }
     * }
     * }
     */
    public int getPosXShip() {
        return ship.getPosX();
    }

    public int getPosYShip() {
        return ship.getPosY();
    }
}

package jalau.at18.spaceinvaders;

public class Game {
    private Ship ship;
    private Board board;
    private Aliens alien;
    private Bullet bullet;
    private static final int LIMIT_ROW = 4;
    private static final int LIMIT_COLUMN = 2;
    private static final int SIZE_BOARD = 9;

    public Game() {
        board = new Board();
        ship = new Ship();
        alien = new Aliens();
        bullet = new Bullet();

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
            bullet.moveUp(ship.getPosX());
            board.setElement(bullet.getPosY(), bullet.getPosX(), 'o');
            board.setElement(bullet.getPosY() + 1, bullet.getPosX() + 1, '*');

        }
        if (instruction == 'd' && ship.getPosX() < SIZE_BOARD) {
            ship.moveRight();
            board.setElement(ship.getPosY(), ship.getPosX(), '^');
            board.setElement(ship.getPosY(), ship.getPosX() - 1, '*');
            bullet.moveUp(ship.getPosX());
            board.setElement(bullet.getPosY(), bullet.getPosX(), 'o');
            board.setElement(bullet.getPosY() + 1, bullet.getPosX() - 1, '*');

        }
        System.out.println(board.toString());
        if (instruction == 'w') {
            System.out.println("Fire");
            bullet.moveUp(ship.getPosX());
            board.setElement(bullet.getPosY(), bullet.getPosX(), 'o');
            board.setElement(bullet.getPosY() + 1, bullet.getPosX(), '*');
        }
    }

    public int getPosXShip() {
        return ship.getPosX();
    }

    public int getPosYShip() {
        return ship.getPosY();
    }
}

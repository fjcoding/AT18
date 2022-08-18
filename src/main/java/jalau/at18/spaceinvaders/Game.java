package jalau.at18.spaceinvaders;
import java.util.Scanner;

public class Game {
    private Ship ship;
    private Board board;
    private Aliens alien;
    private static final int LIMIT_ROW = 4;
    private static final int LIMIT_COLUMN = 2;

    public Game() {
        board = new Board();
        ship = new Ship();
        alien = new Aliens();
    }
    public void runGame() {
        // print alien matrix
        for (int row = 0; row < LIMIT_ROW; row++) {
            for (int column = 0; column < LIMIT_COLUMN; column++) {
                board.setElement(alien.getPosY()[column], alien.getPosX()[row], '%');
            }
        }
        Scanner scanner = new Scanner(System.in);
        // entrada de un carácter
        while (true) {
            char direction = scanner.next().charAt(0);
            if (direction == 'a') {
                ship.moveLeft();
                board.setElement(ship.getPosY(), ship.getPosX(), '^');
                System.out.println(board.toString());
                board.setElement(ship.getPosY(), ship.getPosX(), '*');
                //System.out.println(ship.getPosX());
            }
            if (direction == 'd') {
                ship.moveRight();
                //board.setElement(alien.getPosX(), alien.getPosY(), '%')
                board.setElement(ship.getPosY(), ship.getPosX(), '^');
                System.out.println(board.toString());
                board.setElement(ship.getPosY(), ship.getPosX(), '*');
                //System.out.println(ship.getPosX());
            }
        }
    }
}

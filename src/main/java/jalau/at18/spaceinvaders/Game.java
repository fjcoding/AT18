package jalau.at18.spaceinvaders;

import java.util.Scanner;

public class Game {
    private Ship ship;
    private Board board;

    public Game() {

        board = new Board();
        ship = new Ship();

    }
    public void runGame() {
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
                board.setElement(ship.getPosY(), ship.getPosX(), '^');
                System.out.println(board.toString());
                board.setElement(ship.getPosY(), ship.getPosX(), '*');
                //System.out.println(ship.getPosX());


            }

        }

    }
}

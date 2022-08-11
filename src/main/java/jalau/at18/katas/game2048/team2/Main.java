package jalau.at18.katas.game2048.team2;

import java.util.Scanner;

public class Main {
    public static final int SIZE = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Board board = new Board(4, 0);
        Game game = new Game(board);
        game.start();


        while(true) {
            System.out.println("Input a character 's' to start or 'n' to finish");
            char letter = scanner.next().charAt(0);
            if (letter == 'w') {
                game.moveUp();
                board.showTable();

            }
            if (letter == 's') {
                game.moveDown();
                board.showTable();

            }
            if (letter == 'a') {
                game.moveLeft();
                board.showTable();

            }
            if (letter == 'd') {
                game.moveRight();
                board.showTable();

            }
            else if(letter == 'z') {
                break;
            }
        }

    }
}

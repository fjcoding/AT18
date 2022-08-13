package jalau.at18.katas.game2048.team2;

import java.util.Scanner;

public class Main {
    public static final int SIZE = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Board board = new Board(SIZE, 0);
        Game game = new Game(board);
        game.start();

        while (true) {
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
            char letter = scanner.next().charAt(0);
            if (letter == 'w') {
                game.moveUp();
                System.out.println("   Score : " + board.showScore());
                if (game.finishGame()) {

                    break;
                }
            }
            if (letter == 's') {
                game.moveDown();
                System.out.println("  Score : " + board.showScore());
                if (game.finishGame()) {

                    break;
                }
            }
            if (letter == 'a') {
                game.moveLeft();
                System.out.println("   Score : " + board.showScore());
                if (game.finishGame()) {
                    break;
                }
            }
            if (letter == 'd') {
                game.moveRight();
                System.out.println("   Score : " + board.showScore());
                if (game.finishGame()) {
                    break;
                }
            } else if (letter == 'z' || game.finishGame()) {
                board.showScore();
                System.out.println("    Score : " + board.showScore());
                break;
            }
        }

    }
}

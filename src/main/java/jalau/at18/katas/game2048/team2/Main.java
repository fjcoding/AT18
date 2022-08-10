package jalau.at18.katas.game2048.team2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Input a character 's' to start or 'n' to finish");
            char letter = scanner.next().charAt(0);
            if (letter == 's') {
                Board board = new Board(4, 0);
                board.createTable();
                board.showTable();
                board.generateTokens();
            } else {
                break;
            }
        }
    }
}

package jalau.at18.pacman;

//import jalau.at18.pacman.Dani.Board;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Board tablero = new Board();
        Pacman movepacman = new Pacman();
        Board board = new Board();
        System.out.println("Tablero mostrado");
        Scanner keyword = new Scanner(System.in);
        char movements;
        final int row = 1;
        final int colums = 1;
        int score = 0;
        board.getGameBoard()[row][colums] = "C";
        board.showBoard(board.getGameBoard());;
        while (true) {
            System.out.println("Enter a move:");
            movements = keyword.next().charAt(0);

            if (movements == 'd') {
                movepacman.moveUp(movements);
            }
            if (movements == 's') {
                movepacman.moveUp(movements);
            }
            if (movements == 'a') {
                movepacman.moveUp(movements);
            }
            if (movements == 'w') {
                movepacman.moveUp(movements);
            }
        }
    }
}
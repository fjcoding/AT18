package jalau.at18.pacman;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConditionMovements newMovement = new ConditionMovements();
        Board board = new Board();
        MovementsPacman point = new MovementsPacman();
        System.out.println("Tablero mostrado");
        Scanner keyword = new Scanner(System.in);
        final int rowPacman = 1;
        final int columsPacman = 1;
        final int rowGhost = 8;
        final int columsGhost = 15;
        board.getGameBoard()[rowPacman][columsPacman] = "\033[33mC\u001B[0m";
        board.getGameBoard()[rowGhost][columsGhost] = "\033[31mG\u001B[0m";
        board.showBoard(board.getGameBoard(), rowPacman, columsPacman);
        while (true) {
            System.out.println("                                                      SCORE: " + point.showScore());
            System.out.println("Enter a move: ");
            char movements = keyword.next().charAt(0);
            newMovement.movement(movements);
        }

    }
}
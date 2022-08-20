package jalau.at18.pacman;

//import jalau.at18.pacman.Dani.Board;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Clases importadas
        ConditionMovements newMovement = new ConditionMovements();
        Ghost newMovementG = new Ghost();
        Board board = new Board();

        // Ejecucion del programa
        System.out.println("Tablero mostrado");
        Scanner keyword = new Scanner(System.in);
        final int rowPacman = 1;
        final int columsPacman = 1;
        final int rowGhost = 8;
        final int columsGhost = 15;
        int score = 0;
        board.getGameBoard()[rowPacman][columsPacman] = "C";
        board.getGameBoard()[rowGhost][columsGhost] = "G";
        board.showBoard(board.getGameBoard());
        while (true) {
            System.out.println("Enter a move:");
            char movements = keyword.next().charAt(0);
            newMovement.movement(movements);
        }
    }
}
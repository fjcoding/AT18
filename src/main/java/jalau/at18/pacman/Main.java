package jalau.at18.pacman;

//import jalau.at18.pacman.Dani.Board;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                // Clases importadas
                ConditionMovements newMovement = new ConditionMovements();
                Board board = new Board();
                MovementsPacman point = new MovementsPacman();

                // Ejecucion del programa
                System.out.println("Tablero mostrado");
                Scanner keyword = new Scanner(System.in);
                final int rowPacman = 1;
                final int columsPacman = 1;
                final int rowGhost = 8;
                final int columsGhost = 15;
                // int score = 0;
                board.getGameBoard()[rowPacman][columsPacman] = "\033[33mC\u001B[0m";
                board.getGameBoard()[rowGhost][columsGhost] = "\033[31mG\u001B[0m";
                board.showBoard(board.getGameBoard(), rowPacman, columsPacman); // showBoard(String[][] boardToShow,int
                                                                                // n,int m)
                while (true) {
                        System.out.println("                                                      SCORE: "
                                        + point.showScore());
                        System.out.println("Enter a move:");
                        char movements = keyword.next().charAt(0);
                        newMovement.movement(movements);

                }

        }
}
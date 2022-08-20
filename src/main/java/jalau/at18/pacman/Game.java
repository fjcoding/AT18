package jalau.at18.pacman;

import java.util.Scanner;

public class Game {
    Scanner input = new Scanner(System.in);
    
    public void runGame() {
        Moves move;
        initGame();
        while(!(isWinner() || isGameOver())) {
            System.out.println("Enter a move:");
            move = new Moves(input.nextLine());

        }
    }
    public boolean isGameOver() {
        return true;
    }
    public boolean isWinner() {
        return true;
    }
    public void initGame() {
        Board board = new Board();
        Pacman pacman = new Pacman();
        System.out.println("******Bienvenido al juego******");
        board.addPacman(pacman, board.getGameBoard());
        board.showBoard(board.getGameBoard());
    }
    
}

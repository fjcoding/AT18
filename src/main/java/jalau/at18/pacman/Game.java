package jalau.at18.pacman;

import java.util.Scanner;

public class Game {
    public static final int INITIAL_PACMAN_POSITION = 1;
    public static final int INITIAL_GHOST_XPOSITION = 8;
    public static final int INITIAL_GHOST_YPOSITION = 5;
    Board board = new Board();
    Scanner input = new Scanner(System.in);
    Pacman pacman = new Pacman(INITIAL_PACMAN_POSITION, INITIAL_PACMAN_POSITION);
    
    public void runGame() {
        Moves move;
        initGame();
        while(!(isWinner(board.getDots()) || isGameOver())) {
            System.out.println("Enter a move:");
            move = new Moves(input.nextLine());

        }
    }
    public boolean isGameOver() {
        return true;
    }
    public boolean isWinner(int dots) {
        return dots == 0 ? true : false;
    }
    public void initGame() {
        Board board = new Board();
        Pacman pacman = new Pacman(INITIAL_PACMAN_POSITION, INITIAL_PACMAN_POSITION);
        Ghost pinky = new Ghost(INITIAL_GHOST_XPOSITION, INITIAL_GHOST_YPOSITION);
        System.out.println("******Bienvenido al juego******");
        board.addPacman(pacman, board.getGameBoard());
        board.addGhost(pinky, board.getGameBoard());
        board.showBoard(board.getGameBoard());
    }
    
}

package jalau.at18.pacman;

import java.util.Scanner;

public class Game {

    public static final int INITIAL_PACMAN_POSITION = 1;
    public static final int INITIAL_GHOST_XPOSITION = 8;
    public static final int INITIAL_GHOST_YPOSITION = 5;
    Board board = new Board();
    Pacman pacman = new Pacman();
    Ghost ghost1 = new Ghost();

    Scanner input = new Scanner(System.in);

    public void runGame() {
        Move move;
        initGame();
        while (!(isWinner(board.getDots()) || isGameOver())) {
            System.out.print(board.getDots());
            System.out.println("Enter a move:");
            move = new Move(input.nextLine());
            board.restDots();
        }
    }

    public boolean isGameOver() {
        return pacman.getXposition() == ghost1.getXposition() &&
                pacman.getYposition() == ghost1.getYposition() ? true : false;
    }

    public boolean isWinner(int dots) {
        return dots == 0 ? true : false;
    }

    public void initGame() {
        Board board = new Board();
        System.out.println("******Bienvenido al juego******");
        board.addElement(pacman.getRepresentation(), INITIAL_PACMAN_POSITION, INITIAL_PACMAN_POSITION);
        board.addElement(ghost1.getRepresentation(), INITIAL_GHOST_XPOSITION, INITIAL_GHOST_YPOSITION);
        board.showBoard(board.getGameBoard());
    }

}

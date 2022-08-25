package jalau.at18.pacman;

import java.util.Scanner;

public class Game {

    public static final int INITIAL_PACMAN_POSITION = 1;
    public static final int INITIAL_GHOST1_XPOSITION = 11;
    public static final int INITIAL_GHOST1_YPOSITION = 14;
    public static final int INITIAL_GHOST2_XPOSITION = 12;
    public static final int INITIAL_GHOST2_YPOSITION = 15;
    public static final int INITIAL_GHOST3_XPOSITION = 13;
    public static final int INITIAL_GHOST3_YPOSITION = 15;
    public static final int INITIAL_GHOST4_XPOSITION = 14;
    public static final int INITIAL_GHOST4_YPOSITION = 15;
    Board board = new Board();
    Pacman pacman = new Pacman();
    Ghost ghost1 = new Ghost();
    Ghost ghost2 = new Ghost();
    Ghost ghost3 = new Ghost();
    Ghost ghost4 = new Ghost();

    Scanner input = new Scanner(System.in);

    public void runGame() {
        Move move;
        initGame();
        while (!(isWinner(board.getDots()) || isGameOver(pacman, ghost1))) {
            System.out.print(board.getDots());
            System.out.println("Enter a move:");
            /*/////////////////////////////////////
               fruits 
               lives
               score
            bluce inf

               move pacman = x,y ->7
               move ghost = x,y ->5
     
               setBoard -> pacman & ghost 
            
            end bluce    
            /////////////////////////////////////*/
            move = new Move(input.nextLine());
            
            board.restDots();
        }
    }

    public boolean isGameOver(Pacman pacman, Ghost ghost) {
        return pacman.getXposition() == ghost.getXPosition() &&
                pacman.getYposition() == ghost.getYPosition() ? true : false;
    }

    public boolean isWinner(int dots) {
        return dots == 0 ? true : false;
    }

    public void initGame() {
        Board board = new Board();
        System.out.println("******Bienvenido al juego******");
        board.addElement(pacman.getRepresentation(), INITIAL_PACMAN_POSITION, INITIAL_PACMAN_POSITION);
        board.addElement(ghost1.getRepresentation(), INITIAL_GHOST1_XPOSITION, INITIAL_GHOST1_YPOSITION);
        // board.addElement(ghost1.getRepresentation(), INITIAL_GHOST2_XPOSITION, INITIAL_GHOST2_YPOSITION);
        // board.addElement(ghost1.getRepresentation(), INITIAL_GHOST3_XPOSITION, INITIAL_GHOST3_YPOSITION);
        // board.addElement(ghost1.getRepresentation(), INITIAL_GHOST4_XPOSITION, INITIAL_GHOST4_YPOSITION);
        board.showBoard(board.getGameBoard());
    }

}

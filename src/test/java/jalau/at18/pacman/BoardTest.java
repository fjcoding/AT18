package jalau.at18.pacman;

import static org.junit.Assert.*;
import org.junit.Test;

public class BoardTest {
    public static int X_BORDER = 25;
    public static int Y_BORDER = 29;
    public static int count_points_old = 0;
    public static int count_points_new = 0;
    Board board = new Board();
    MovementsPacman movements = new MovementsPacman();
    MovementsPacman point = new MovementsPacman();
    private String[][] arr = board.getGameBoard();
    final int rowPacman = 1;
    final int columsPacman = 1;
    private static int rowGhost = 8;
    private static int columnGhost = 15;

    @Test
    public void testShowBoard() {
        // Board boar=new Board();

    }

}

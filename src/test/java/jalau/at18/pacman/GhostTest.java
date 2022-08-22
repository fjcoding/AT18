package jalau.at18.pacman;

import org.junit.Test;
import static org.junit.Assert.*;

public class GhostTest {
    Ghost movements = new Ghost();
    Board board = new Board();
    private String[][] arr = board.getGameBoard();
    final int rowPacman = 1;
    final int columsPacman = 1;
    private static int rowGhost = 8;
    private static int columnGhost = 15;
    public static char[] ghostMovements = { 'w', 'a', 's', 'd' };
    char r;

    @Test
    public void testGhostMovement() {
        arr[rowPacman][columsPacman] = "\033[33mC\u001B[0m";
        arr[rowGhost][columnGhost] = "\033[31mG\u001B[0m";
        String[][] moveGhost = movements.ghostMovement(arr);
        board.setGameBoard(moveGhost);
        String[][] arr_2 = board.getGameBoard();
        assertEquals(arr[rowPacman][columsPacman], arr_2[rowPacman][columsPacman]);

    }

}

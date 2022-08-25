package jalau.at18.pacman;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class GhostTest {
    private Ghost ghost = new Ghost();
    private Board board = new Board();
    private String[][] arr = board.getGameBoard();
    final int rowPacman = 1;
    final int columsPacman = 1;
    public static final String GHOST_REPRESENTATION = "G";
    private static int rowGhost = 8;
    private static int columnGhost = 15;
    public static char[] ghostMovements = { 'w', 'a', 's', 'd' };
    char r;

    @Test
    public void testGhostMovement() {
    arr[rowPacman][columsPacman] = "\033[33mC\u001B[0m";
    arr[rowGhost][columnGhost] = "\033[31mG\u001B[0m";
    List<Object> moveGhost = ghost.ghostMovement(arr, rowGhost, columnGhost);
    board.setGameBoard((String[][]) moveGhost.get(0));
    String[][] arr_2 = board.getGameBoard();
    assertEquals(arr[rowPacman][columsPacman], arr_2[rowPacman][columsPacman]);
    }

    @Test
    public void testGetRepresentation() {
        assertEquals(GHOST_REPRESENTATION, ghost.getRepresentation());
    }

}

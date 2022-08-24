package jalau.at18.pacman;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class ConditionMovementsGhostsTest {
    ConditionMovementsGhosts movementG = new ConditionMovementsGhosts();
    Board board = new Board();
    private String[][] arr = board.getGameBoard();
    final int rowPacman = 1;
    final int columsPacman = 1;
    private static int rowGhost = 8;
    private static int columnGhost = 15;
    char a = 'a';
    char s = 's';
    char w = 'w';
    char d = 'd';

    @Test
    public void testMovement() {
        arr[rowPacman][columsPacman] = "\033[33mC\u001B[0m";
        arr[rowGhost][columnGhost] = "\033[31mG\u001B[0m";
        List<Object> moveUpGhost = movementG.movement(w, arr, rowGhost, columnGhost);
        board.setGameBoard((String[][]) moveUpGhost.get(0));
        String[][] arr_2 = board.getGameBoard();
        assertEquals(arr[rowGhost][columnGhost], arr_2[rowGhost][columnGhost]);
    }
}

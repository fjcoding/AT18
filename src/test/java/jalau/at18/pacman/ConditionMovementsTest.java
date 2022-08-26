package jalau.at18.pacman;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConditionMovementsTest {
    ConditionMovements movement = new ConditionMovements();
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
    public void testMovementGeneral() {
        arr[rowPacman][columsPacman] = "\033[33mC\u001B[0m";
        arr[rowGhost][columnGhost] = "\033[31mG\u001B[0m";
        List<Object> moveUpGhost = movement.movement(d, rowGhost, columnGhost);
        board.setGameBoard((String[][]) moveUpGhost.get(0));
        String[][] arr_2 = board.getGameBoard();
        assertEquals(arr[rowPacman][columsPacman], arr_2[rowPacman][columsPacman + 5]);
    }
}

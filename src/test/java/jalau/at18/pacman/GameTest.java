package jalau.at18.pacman;

import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {
    Board board = new Board();
    Game game = new Game();
    Pacman pacman = new Pacman();
    Ghost ghost = new Ghost();
    public static final int POSITION_TO_TESTS = 1;

    @Test
    public void isWinnerTest() {
        assertEquals(true, game.isWinner(0));
    }
    @Test
    public void isGameOverTest() {
        pacman.setXposition(POSITION_TO_TESTS);
        pacman.setYposition(POSITION_TO_TESTS);
        ghost.setXPosition(POSITION_TO_TESTS);
        ghost.setYPosition(POSITION_TO_TESTS);
        assertEquals(true, game.isGameOver(pacman, ghost));

    }

}

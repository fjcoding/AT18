package jalau.at18.pacman;

import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {
    Board board = new Board();
    Game game = new Game();

    @Test
    public void isWinnerTest() {
        assertEquals(true, game.isWinner(0));
    }

}

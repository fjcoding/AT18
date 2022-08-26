package jalau.at18.battlecity;

import static org.junit.Assert.*;
import static org.junit.Assume.assumeNoException;

import org.junit.Test;

public class BoardTest {

    // private Element element = new Element(type, live, blockTank, allowPassBullet,
    // allowStaySamePosition, image);
    private Board board = new Board(null);

    @Test
    public void BoardShouldSetMatrixCorrectly() {
        Element[][] newboard = board.getMatrix();
        assertArrayEquals(board.matrix, newboard);
    }
}
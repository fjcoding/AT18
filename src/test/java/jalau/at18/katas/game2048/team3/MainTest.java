package jalau.at18.katas.game2048.team3;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {
    @Test
    public void testArrangeRight() {
        Main main = new Main();
        int[][] matrix = {{2,0,0,4},{2,0,2,0},{2,0,0,0},{2,0,4,4}};
        int[][] expecteds = {{0,0,2,4},{0,0,0,4},{0,0,0,2},{0,0,2,8}};
        main.rightMove(matrix);
        assertEquals(expecteds,main.getMatrix());
    }
}

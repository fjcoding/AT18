package jalau.at18.katas.game2028.team4;

import jalau.at18.katas.game2048.team4.Main;
import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {

    @Test
    public void moveNumbersUpTest() {
        int[][] matrix = { { 0, 0, 0, 0 }, { 0, 2, 2, 2 }, { 0, 4, 2, 8 }, { 2, 0, 0, 0 } };
        int[][] expectedMatrix = { { 2, 2, 4, 2 }, { 0, 4, 0, 8 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };
        Main main = new Main();
        int[][] new_matrix = Main.moveNumbersUp(matrix);
        assertArrayEquals(expectedMatrix, new_matrix);
    }
}

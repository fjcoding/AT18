package jalau.at18.katas.game2028.team4;

import jalau.at18.katas.game2048.team4.Main;
import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {

    @Test
    public void moveNumbersUpTest() {
        int[][] matrix = { { 0, 0, 0, 0 }, { 0, 2, 2, 2 }, { 0, 4, 2, 8 }, { 2, 0, 0, 0 } };
        int[][] expectedMatrix = { { 2, 2, 2, 2 }, { 0, 4, 2, 8 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };
        Main main = new Main();
        int[][] new_matrix = main.moveNumbersUp(matrix);
        assertArrayEquals(expectedMatrix, new_matrix);
    }

    @Test
    public void moveNumbersLeftTest() {
        int[][] matrix = { { 0, 0, 0, 0 }, { 0, 2, 2, 2 }, { 0, 4, 2, 8 }, { 2, 0, 0, 0 } };
        int[][] expectedMatrix = { { 0, 0, 0, 0 }, { 2, 2, 2, 0 }, { 4, 2, 8, 0 }, { 2, 0, 0, 0 } };
        Main main = new Main();
        int[][] new_matrix = Main.moveNumbersLeft(matrix);
        assertArrayEquals(expectedMatrix, new_matrix);
    }

    @Test
    public void moveNumbersRightTest() {
        int[][] matrix = { { 0, 0, 0, 0 }, { 0, 2, 2, 2 }, { 0, 4, 2, 8 }, { 2, 0, 0, 0 } };
        int[][] expectedMatrix = { { 0, 0, 0, 0 }, { 0, 0, 4, 2 }, { 0, 4, 2, 8 }, { 0, 0, 0, 2 } };
        Main main = new Main();
        int[][] new_matrix = Main.moveNumbersRight(matrix);
        assertArrayEquals(expectedMatrix, new_matrix);
    }

    @Test
    public void moveNumbersDownTest() {
        int[][] matrix = { { 0, 0, 0, 0 }, { 0, 2, 2, 2 }, { 0, 4, 2, 8 }, { 2, 0, 0, 0 } };
        int[][] expectedMatrix = { { 0, 0, 0, 0 }, { 0, 2, 0, 2 }, { 0, 0, 0, 0 }, { 2, 4, 4, 8 } };
        Main main = new Main();
        int[][] new_matrix = Main.moveNumbersDown(matrix);
        assertArrayEquals(expectedMatrix, new_matrix);
    }

    @Test
    public void thereIsAWinner() {
        int[][] matrix = { { 1024, 512, 1024, 256 }, { 2048, 512, 1024, 256 }, { 128, 1024, 512, 1024 },
                { 512, 128, 128, 1024 } };
        Main main = new Main();
        boolean winner = Main.isWinner(matrix);
        assertEquals(true, winner);
    }

    @Test
    public void thereIsALoser() {
        int[][] matrix = { { 1024, 512, 1024, 256 }, { 128, 64, 1024, 256 }, { 64, 1024, 512, 1024 },
                { 512, 256, 128, 512 } };
        Main main = new Main();
        boolean loser = Main.isLoser(matrix);
        assertEquals(true, loser);
    }

    @Test
    public void putANewNumberOnMatrix() {
        int[][] matrix = { { 2, 4, 8, 16 }, { 8, 32, 32, 2 }, { 2, 4, 2, 8 }, { 2, 4, 2, 0 } };
        int[][] expectedMatrix = { { 2, 4, 8, 16 }, { 8, 32, 32, 2 }, { 2, 4, 2, 8 }, { 2, 4, 2, 2 } };
        Main main = new Main();
        int[][] new_matrix = Main.putNewTwoOnMatrix(matrix);
        assertArrayEquals(expectedMatrix, new_matrix);
    }
}

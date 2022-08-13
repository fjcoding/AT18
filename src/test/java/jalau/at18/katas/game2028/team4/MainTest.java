package jalau.at18.katas.game2028.team4;

import jalau.at18.katas.game2048.team4.Main;
import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {
    public static final int WINNER_NUM = 2048;
    public static final int NUMBER_TWO = 2;

    @Test
    public void moveNumbersUpTest() {
        int[][] matrix = { { 0, 0, 0, 0 }, { 0, NUMBER_TWO, NUMBER_TWO, NUMBER_TWO },
                { 0, NUMBER_TWO, NUMBER_TWO, NUMBER_TWO },
                { NUMBER_TWO, 0, 0, 0 } };
        int[][] expectedMatrix = { { NUMBER_TWO, NUMBER_TWO, NUMBER_TWO, NUMBER_TWO },
                { 0, NUMBER_TWO, NUMBER_TWO, NUMBER_TWO },
                { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };
        Main main = new Main();
        int[][] new_matrix = main.moveNumbersUp(matrix);
        assertArrayEquals(expectedMatrix, new_matrix);
    }

    @Test
    public void moveNumbersLeftTest() {
        int[][] matrix = { { 0, 0, 0, 0 }, { 0, NUMBER_TWO, NUMBER_TWO, NUMBER_TWO },
                { 0, NUMBER_TWO, NUMBER_TWO, NUMBER_TWO },
                { NUMBER_TWO, 0, 0, 0 } };
        int[][] expectedMatrix = { { 0, 0, 0, 0 }, { NUMBER_TWO, NUMBER_TWO, NUMBER_TWO, 0 },
                { NUMBER_TWO, NUMBER_TWO, NUMBER_TWO, 0 },
                { NUMBER_TWO, 0, 0, 0 } };
        Main main = new Main();
        int[][] new_matrix = Main.moveNumbersLeft(matrix);
        assertArrayEquals(expectedMatrix, new_matrix);
    }

    @Test
    public void moveNumbersRightTest() {
        int[][] matrix = { { 0, 0, 0, 0 }, { 0, 0, NUMBER_TWO, 0 }, { 0, 0, NUMBER_TWO, 0 },
                { NUMBER_TWO, 0, 0, 0 } };
        int[][] expectedMatrix = { { 0, 0, 0, 0 }, { 0, 0, 0, NUMBER_TWO }, { 0, 0, 0, NUMBER_TWO },
                { 0, 0, 0, NUMBER_TWO } };
        Main main = new Main();
        int[][] new_matrix = Main.moveNumbersRight(matrix);
        assertArrayEquals(expectedMatrix, new_matrix);
    }

    @Test
    public void moveNumbersDownTest() {
        int[][] matrix = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, NUMBER_TWO, NUMBER_TWO, NUMBER_TWO },
                { NUMBER_TWO, 0, 0, 0 } };
        int[][] expectedMatrix = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 },
                { NUMBER_TWO, NUMBER_TWO, NUMBER_TWO, NUMBER_TWO } };
        Main main = new Main();
        int[][] new_matrix = Main.moveNumbersDown(matrix);
        assertArrayEquals(expectedMatrix, new_matrix);
    }

    @Test
    public void thereIsAWinner() {
        int[][] matrix = { { NUMBER_TWO, NUMBER_TWO, NUMBER_TWO, NUMBER_TWO },
                { WINNER_NUM, NUMBER_TWO, NUMBER_TWO, NUMBER_TWO },
                { NUMBER_TWO, NUMBER_TWO, NUMBER_TWO, NUMBER_TWO },
                { NUMBER_TWO, NUMBER_TWO, NUMBER_TWO, NUMBER_TWO } };
        Main main = new Main();
        boolean winner = Main.isWinner(matrix);
        assertEquals(true, winner);
    }

    @Test
    public void thereIsALoser() {
        int[][] matrix = { { NUMBER_TWO, NUMBER_TWO, NUMBER_TWO, NUMBER_TWO },
                { NUMBER_TWO, NUMBER_TWO, NUMBER_TWO, NUMBER_TWO }, { NUMBER_TWO, NUMBER_TWO, NUMBER_TWO, NUMBER_TWO },
                { NUMBER_TWO, NUMBER_TWO, NUMBER_TWO, NUMBER_TWO } };
        Main main = new Main();
        boolean loser = Main.isLoser(matrix);
        assertEquals(true, loser);
    }

    @Test
    public void putANewNumberOnMatrix() {
        int[][] matrix = { { NUMBER_TWO, NUMBER_TWO, NUMBER_TWO, NUMBER_TWO },
                { NUMBER_TWO, NUMBER_TWO, NUMBER_TWO, NUMBER_TWO },
                { NUMBER_TWO, NUMBER_TWO, NUMBER_TWO, NUMBER_TWO }, { NUMBER_TWO, NUMBER_TWO, NUMBER_TWO, 0 } };
        int[][] expectedMatrix = { { NUMBER_TWO, NUMBER_TWO, NUMBER_TWO, NUMBER_TWO },
                { NUMBER_TWO, NUMBER_TWO, NUMBER_TWO, NUMBER_TWO }, { NUMBER_TWO, NUMBER_TWO, NUMBER_TWO, NUMBER_TWO },
                { NUMBER_TWO, NUMBER_TWO, NUMBER_TWO, NUMBER_TWO } };
        Main main = new Main();
        int[][] new_matrix = Main.putNewTwoOnMatrix(matrix);
        assertArrayEquals(expectedMatrix, new_matrix);
    }
}
package jalau.at18.katas.game2028.team4;

import jalau.at18.katas.game2048.team4.Main;
import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {
        public static final int WINNER_NUM = 2048;
        public static final int MIN_TILE = 2;
        public static final int FOUR = 4;
        public static final int EIGHT = 8;
        public static final int SIXTEEN = 16;
        public static final int THIRTYTWO = 32;
        public static final int SIXTYFOUR = 64;
        public static final int ONEHUNDRED_TWENTYEIGHT = 128;

        @Test
        public void moveNumbersUpTest() {
                int[][] matrix = {{0, 0, 0, 0}, {0, MIN_TILE, MIN_TILE, MIN_TILE},
                                {0, MIN_TILE, MIN_TILE, MIN_TILE}, {MIN_TILE, 0, 0, 0}};
                int[][] expectedMatrix = {{MIN_TILE, MIN_TILE, MIN_TILE, MIN_TILE},
                                {0, MIN_TILE, MIN_TILE, MIN_TILE}, {0, 0, 0, 0}, {0, 0, 0, 0}};
                int[][] new_matrix = Main.moveNumbersUp(matrix, 0);
                assertArrayEquals(expectedMatrix, new_matrix);
        }

        @Test
        public void moveNumbersLeftTest() {
                int[][] matrix = {{0, 0, 0, 0}, {0, MIN_TILE, MIN_TILE, MIN_TILE},
                                {0, MIN_TILE, MIN_TILE, MIN_TILE}, {MIN_TILE, 0, 0, 0}};
                int[][] expectedMatrix = {{0, 0, 0, 0}, {MIN_TILE, MIN_TILE, MIN_TILE, 0},
                                {MIN_TILE, MIN_TILE, MIN_TILE, 0}, {MIN_TILE, 0, 0, 0}};
                int[][] new_matrix = Main.moveNumbersLeft(matrix, 0);
                assertArrayEquals(expectedMatrix, new_matrix);
        }

        @Test
        public void moveNumbersRightTest() {
                int[][] matrix = {{0, 0, 0, 0}, {0, 0, MIN_TILE, 0}, {0, 0, MIN_TILE, 0},
                                {MIN_TILE, 0, 0, 0}};
                int[][] expectedMatrix = {{0, 0, 0, 0}, {0, 0, 0, MIN_TILE}, {0, 0, 0, MIN_TILE},
                                {0, 0, 0, MIN_TILE}};
                int[][] new_matrix = Main.moveNumbersRight(matrix, 0);
                assertArrayEquals(expectedMatrix, new_matrix);
        }

        @Test
        public void moveNumbersDownTest() {
                int[][] matrix = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, MIN_TILE, MIN_TILE, MIN_TILE},
                                {MIN_TILE, 0, 0, 0}};
                int[][] expectedMatrix = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0},
                                {MIN_TILE, MIN_TILE, MIN_TILE, MIN_TILE}};
                int[][] new_matrix = Main.moveNumbersDown(matrix, 0);
                assertArrayEquals(expectedMatrix, new_matrix);
        }

        @Test
        public void thereIsAWinner() {
                int[][] matrix = {{MIN_TILE, MIN_TILE, MIN_TILE, MIN_TILE},
                                {WINNER_NUM, MIN_TILE, MIN_TILE, MIN_TILE},
                                {MIN_TILE, MIN_TILE, MIN_TILE, MIN_TILE},
                                {MIN_TILE, MIN_TILE, MIN_TILE, MIN_TILE}};
                boolean winner = Main.isWinner(matrix);
                assertEquals(true, winner);
        }

        @Test
        public void thereIsALoser() {
                int[][] matrix = {{MIN_TILE, FOUR, MIN_TILE, FOUR},
                                {FOUR, EIGHT, THIRTYTWO, MIN_TILE},
                                {EIGHT, SIXTEEN, FOUR, SIXTEEN},
                                {SIXTEEN, MIN_TILE, SIXTYFOUR, ONEHUNDRED_TWENTYEIGHT}};
                Main.showMatrix();
                boolean loser = Main.isLoser(matrix);
                assertEquals(true, loser);
        }

        @Test
        public void putANewNumberOnMatrix() {
                int[][] matrix = {{MIN_TILE, MIN_TILE, MIN_TILE, MIN_TILE},
                                {MIN_TILE, MIN_TILE, MIN_TILE, MIN_TILE},
                                {MIN_TILE, MIN_TILE, MIN_TILE, MIN_TILE}, {MIN_TILE, MIN_TILE, MIN_TILE, 0}};
                int[][] expectedMatrix = {{MIN_TILE, MIN_TILE, MIN_TILE, MIN_TILE},
                                {MIN_TILE, MIN_TILE, MIN_TILE, MIN_TILE},
                                {MIN_TILE, MIN_TILE, MIN_TILE, MIN_TILE},
                                {MIN_TILE, MIN_TILE, MIN_TILE, MIN_TILE}};
                int[][] expectedMatrix2 = {{MIN_TILE, MIN_TILE, MIN_TILE, MIN_TILE},
                                {MIN_TILE, MIN_TILE, MIN_TILE, MIN_TILE},
                                {MIN_TILE, MIN_TILE, MIN_TILE, MIN_TILE},
                                {MIN_TILE, MIN_TILE, MIN_TILE, FOUR}};
                int[][] new_matrix = Main.putNewTwoOnMatrix(matrix);
                if (new_matrix[3][3] == 2) {
                        assertArrayEquals(expectedMatrix, new_matrix);
                } else if (new_matrix[3][3] == 4) {
                        assertArrayEquals(expectedMatrix2, new_matrix);
                }
        }
}

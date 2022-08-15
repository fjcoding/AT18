package jalau.at18.katas.game2048.team1;

import org.junit.Test;
import static org.junit.Assert.*;


public class MainTest {
    private final int[][] exampleMatrix = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 2, 0}, {0, 0, 0, 0}};
    private final int[][] matrixGameOver = {{2, 4, 8, 2}, {16, 8, 2, 8}, {4, 2, 16, 4}, {2, 8, 2, 16}};
    private final int[][] matrixGameNoOver = {{2, 4, 2, 2}, {16, 8, 2, 8}, {4, 2, 16, 4}, {2, 8, 2, 16}};

    public static final int TILE_VALUE_TWO = 2;
    public static final int TILE_VALUE_FOUR = 4;
    public static final int MATRIX_LENGTH = 4;
    public static final int COUNT_ZEROS = 15;


    @Test
    public void mainCountZerosMatrix() {
        Main main = new Main();
        assertEquals(COUNT_ZEROS, main.countZerosMatrix(exampleMatrix));
    }
    @Test
    public void mainIsGameOver() {
        Main main = new Main();
        assertEquals(true, main.isGameOver(matrixGameOver));
    }
    @Test
    public void mainIsGameNoOver() {
        Main main = new Main();
        assertEquals(false, main.isGameOver(matrixGameNoOver));
    }

    @Test
    public void mainRandomValue() {
        Main main = new Main();
        int num = main.randomValueGrid();
        assertTrue(num == TILE_VALUE_TWO || num == TILE_VALUE_FOUR);
    }

    @Test
    public void mainRandomPositionGrid() {
        Main main = new Main();
        int[] valuesPosition = main.randomPositionGrid();
        assertTrue(valuesPosition[0] < MATRIX_LENGTH && valuesPosition[1] < MATRIX_LENGTH);
    }

    @Test
    public void mainAddTile() {
        Main main = new Main();
        int countTiles = 0;
        int[][] matrixPlusTile = main.addTile(exampleMatrix);
        for (int row = 0; row < matrixPlusTile.length; row++) {
            for (int column = 0; column < matrixPlusTile.length; column++) {
                if (matrixPlusTile[row][column] != 0) {
                    countTiles++;
                }
            }
        }
        assertEquals(2, countTiles);
    }

    @Test
    public void mainInitialMatrix() {
        Main main = new Main();
        int countTiles1 = 0;
        int[][] matrixInitialTest = main.initialMatrix(2, 1);
        for (int row = 0; row < matrixInitialTest.length; row++) {
            for (int column = 0; column < matrixInitialTest.length; column++) {
                if (matrixInitialTest[row][column] != 0) {
                    countTiles1++;
                }
            }
        }
        assertEquals(2, countTiles1);
    }

    @Test
    public void mainMoveTop() {
        Main main = new Main();
        final int[][] matrixTest = {{0, 0, 0, 0}, {4, 0, 0, 0}, {0, 0, 2, 0}, {0, 0, 2, 0}};
        final int[][] matrixExpected = {{4, 0, 4, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        assertEquals(matrixExpected, main.moveTop(matrixTest));
    }

    @Test
    public void mainMoveDown() {
        Main main = new Main();
        final int[][] matrixTest = {{0, 0, 0, 0}, {4, 0, 0, 0}, {0, 0, 2, 0}, {0, 0, 2, 0}};
        final int[][] matrixExpected = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {4, 0, 4, 0}};
        assertEquals(matrixExpected, main.moveDown(matrixTest));
    }

    @Test
    public void mainMoveLeft() {
        Main main = new Main();
        final int[][] matrixTest = {{0, 0, 0, 0}, {4, 0, 0, 0}, {0, 0, 2, 2}, {0, 0, 2, 0}};
        final int[][] matrixExpected = {{0, 0, 0, 0}, {4, 0, 0, 0}, {4, 0, 0, 0}, {2, 0, 0, 0}};
        assertEquals(matrixExpected, main.moveLeft(matrixTest));
    }
    @Test
    public void mainMoveRight() {
        Main main = new Main();
        final int[][] matrixTest = {{0, 0, 0, 0}, {4, 0, 0, 0}, {4, 4, 0, 0}, {2, 0, 0, 0}};
        final int[][] matrixExpected = {{0, 0, 0, 0}, {0, 0, 0, 4}, {0, 0, 0, 8}, {0, 0, 0, 2}};
        assertEquals(matrixExpected, main.moveRight(matrixTest));
    }
    @Test
    public void mainCanRowSlide() {
        Main main = new Main();
        final int[][] matrixTest = {{1, 2, 3, 4}, {1, 5, 6, 7}, {2, 3, 5, 7}, {9, 0, 7, 5}};
        assertEquals(true, main.canRowSlide(matrixTest));
        final int[][] matrixTest1 = {{1, 2, 3, 4}, {3, 5, 6, 9}, {2, 3, 5, 7}, {9, 0, 7, 5}};
        assertEquals(false, main.canRowSlide(matrixTest1));
    }
    @Test
    public void mainCanColumnSlide() {
        Main main = new Main();
        final int[][] matrixTest = {{1, 1, 3, 4}, {1, 5, 6, 7}, {2, 3, 5, 7}, {9, 0, 7, 5}};
        assertEquals(true, main.canColumnSlide(matrixTest));
        final int[][] matrixTest1 = {{1, 2, 3, 4}, {3, 5, 6, 9}, {2, 3, 5, 7}, {9, 0, 7, 5}};
        assertEquals(false, main.canColumnSlide(matrixTest1));
    }
    @Test
    public void mainGot2048() {
        Main main = new Main();
        final int[][] matrixTest = {{0, 0, 0, 0}, {4, 0, 2048, 0}, {4, 4, 0, 0}, {2, 0, 0, 0}};
        assertEquals(true, main.got2048(matrixTest));
        final int[][] matrixTest1 = {{0, 0, 0, 0}, {4, 0, 0, 0}, {4, 4, 0, 0}, {2, 0, 0, 0}};
        assertEquals(false, main.got2048(matrixTest1));
    }

}

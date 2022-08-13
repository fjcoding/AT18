package jalau.at18.katas.game2048.team3;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class MainTest {
    @Test
    public void testRightMove() {
        Main main = new Main();
        int[][] matrix = {{2,0,0,4},
                          {2,0,2,0},
                          {2,0,0,0},
                          {2,0,4,4}};
        int[][] expecteds = {{0,0,2,4},
                             {0,0,0,4},
                             {0,0,0,2},
                             {0,0,2,8}};
        main.rightMove(matrix);
        assertArrayEquals(expecteds, main.getMatrix());
    }

    @Test
    public void testLeftMove() {
        Main main = new Main();
        int[][] matrix = {{2,0,0,4},
                          {2,0,2,0},
                          {2,0,0,0},
                          {2,0,4,4}};
        int[][] expecteds = {{2,4,0,0},
                             {4,0,0,0},
                             {2,0,0,0},
                             {2,8,0,0}};
        main.leftMove(matrix);
        assertArrayEquals(expecteds, main.getMatrix());
    }

    @Test
    public void testUpMove() {
        Main main = new Main();
        int[][] matrix = {{2,0,0,4},
                          {2,0,2,0},
                          {2,0,0,0},
                          {2,0,4,4}};
        int[][] expecteds = {{4,0,2,8},
                             {4,0,4,0},
                             {0,0,0,0},
                             {0,0,0,0}};
        main.upMove(matrix);
        assertArrayEquals(expecteds, main.getMatrix());
    }

    @Test
    public void testDownMove() {
        Main main = new Main();
        int[][] matrix = {{4,0,0,4},
                          {2,0,0,4},
                          {0,0,0,8},
                          {4,0,4,2}};
        int[][] expecteds = {{0,0,0,0},
                             {4,0,0,8},
                             {2,0,0,8},
                             {4,0,4,2}};
        main.downMove(matrix);
        assertArrayEquals(expecteds, main.getMatrix());
    }

    @Test
    public void testDownMoveCase2() {
        Main main = new Main();
        int[][] matrix = {{2,0,0,4},
                          {2,0,2,0},
                          {2,0,0,0},
                          {2,0,4,4}};
        int[][] expecteds = {{0,0,0,0},
                             {0,0,0,0},
                             {4,0,2,0},
                             {4,0,4,8}};
        main.downMove(matrix);
        assertArrayEquals(expecteds, main.getMatrix());
    }

    @Test
    public void testWinGame() {
        Main main = new Main();
        int[][] matrix = {{2,0,0,2048},
                          {2,0,2,0},
                          {2,0,0,0},
                          {2,0,4,4}};
        main.initializeMatrix(matrix);
        assertTrue(main.didYouWin());
    }
    
    @Test
    public void testWinGameAfterRightMove() {
        Main main = new Main();
        int[][] matrix = {{1024,0,0,1024},
                          {2,0,2,0},
                          {2,0,0,0},
                          {2,0,4,4}};
        int[][] expecteds = {{0,0,0,0},
                             {0,0,0,0},
                             {4,0,2,0},
                             {4,0,4,8}};
        main.rightMove(matrix);
        assertTrue(main.didYouWin());
    }

    @Test
    public void testRandomPair(){
        Main main = new Main();
        int [] expectedTop = {4,4};
        assertTrue(main.randomPair()[0] < expectedTop[0]);
        assertTrue(main.randomPair()[1] < expectedTop[1]);
    }

    @Test
    public void testGenerateRandomNumbers() {
        Main main = new Main();
        int[][] matrix = {{0,0,0,2},
                          {0,0,0,2},
                          {0,2,2,2},
                          {2,4,4,2}};
        assertTrue(main.generateRandomNumbers(matrix));
    }

    @Test
    public void testGenerateRandomNumbersRow3Col3() {
        Main main = new Main();
        int[][] matrix = {{2,2,2,0},
                          {2,2,2,0},
                          {2,2,2,0},
                          {2,0,0,0}};
        assertTrue(main.generateRandomNumbers(matrix));
    }

    @Test
    public void testRandomNumber() {
        Main main = new Main();
        int expecteds = 2;
        int expecteds2 = 4;
        if (main.randomNumber() == expecteds || main.randomNumber() == expecteds2) {
            assertTrue(true);
        } else {
            assertTrue(false);
        }
    }
    
    @Test
    public void testInitializateMatrix() {
        Main main = new Main();
        int[][] matrix = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
        int[][] unexpected = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
        main.initializeMatrix(matrix); 
        assertNotEquals(Arrays.toString(unexpected), Arrays.toString(main.getMatrix()));
    }
}

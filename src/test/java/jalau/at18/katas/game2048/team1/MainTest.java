package jalau.at18.katas.game2048.team1;

import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    int [][] zerosMatrix = {{1,2,3,4},{5,0,7,8},{9,1,2,0},{4,5,9,7}};
    int [][] matrixGameOver = {{1,2,3,4},{5,6,7,8},{9,1,2,3},{4,5,9,7}};
    int [][] matrixGameNoOver = {{1,2,3,4},{5,6,7,0},{9,1,2,4},{4,5,9,20}};
    @Test
    public void mainCountZerosMatrix(int[][] matrix) {
        Main main = new Main();
        assertEquals(2, main.countZerosMatrix(zerosMatrix));
    }
    @Test
    public void mainGameOver() {
        Main main = new Main();
        assertEquals(true, main.gameOver(matrixGameOver));
    }
    @Test
    public void mainGameNoOver() {
        Main main = new Main();
        assertEquals(false, main.gameOver(matrixGameNoOver));
    }
}

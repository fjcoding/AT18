package jalau.at18.katas.game2048.team1;

import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    int [][] zerosMatrix = {{1,2,3,4},{5,0,7,8},{9,1,2,0},{4,5,9,7}};
    int [][] matrixGameOver = {{1,2,3,4},{5,6,7,8},{9,1,2,3},{4,5,9,7}};
    int [][] matrixGameNoOver = {{1,2,3,4},{5,6,7,0},{9,1,2,4},{4,5,9,20}};

    final int RANDOM_VALUE1 = 2;
    final int RANDOM_VALUE2 = 4;
    final int MATRIX_LENGTH = 4;


    @Test
    public void mainCountZerosMatrix() {
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


    @Test
    public void mainRandomValue(){
        Main main = new Main();
        int num = main.randomValueGrid();
        assertTrue( num == RANDOM_VALUE1 || num == RANDOM_VALUE2 );
    }

    @Test
    public void mainRandomPositionGrid(){
        Main main = new Main();
        int [] valuesPosition = main.randomPositionGrid();
        assertTrue( valuesPosition[0] < MATRIX_LENGTH && valuesPosition[1] < MATRIX_LENGTH );
    }

}

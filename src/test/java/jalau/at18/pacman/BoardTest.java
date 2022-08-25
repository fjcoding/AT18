package jalau.at18.pacman;

import static org.junit.Assert.*;
import org.junit.Test;

public class BoardTest {
    public static int X_BORDER = 25;
    public static int Y_BORDER = 29;
    public static int REST_DOTS = 1;
    public static int count_points_old = 0;
    public static int count_points_new = 0;
    Board board = new Board();

    @Test
    public void testGetDots() {
        int expectedDotsNumber = board.INITIAL_DOTS_NUMBER;
        assertEquals(expectedDotsNumber, board.getDots());
    }
    @Test
    public void testRestDots() {
        int actualDots = board.INITIAL_DOTS_NUMBER;
        int expectedDots = board.INITIAL_DOTS_NUMBER - REST_DOTS;
        board.restDots();
        assertEquals(expectedDots, board.getDots() );
    }
    @Test
    public void testGetScore() {
       
    }
    @Test
    public void testAddElement() {
      
    }
    @Test
    public void testGetGameBoard() {
        
    }
    @Test
    public void testSetGameBoard() {
       
    }



}

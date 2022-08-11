package jalau.at18.katas.Team2.Test2048;


import static org.junit.Assert.*;
import org.junit.Test;

import jalau.at18.katas.game2048.team2.Board;

public class BoardTest {
   // isValidThePosition(int x, int y) 
    @Test
    public void shoul_isValidThePosition() {
       // Board boardd = new Board(4 , 0 );
       Board board = new Board(4 , 0);
       board.createTable();
       assertEquals(true, board.isValidThePosition(0,0));
       
       /* 
       MainTest main = new MainTest();
        String expecteds = "s";
       
         assertEquals(expecteds, main.covertNumber(numberInput));
*/
    }
}

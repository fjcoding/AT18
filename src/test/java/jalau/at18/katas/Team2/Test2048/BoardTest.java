package jalau.at18.katas.Team2.Test2048;

import static org.junit.Assert.*;
import org.junit.Test;

import jalau.at18.katas.game2048.team2.Board;

public class BoardTest {
   // isValidThePosition(int x, int y)
   @Test
   public void shoul_isValidThePosition() {
      // Board boardd = new Board(4 , 0 );
      Board board = new Board(4, 0);
      //board.createTable();
      assertEquals(true, board.isEmptyPosition(0, 0));

      /*
       * MainTest main = new MainTest();
       * String expecteds = "s";
       *
       * assertEquals(expecteds, main.covertNumber(numberInput));
       */
   }

   @Test
   public void shouldPrint() {
      // Board boardd = new Board(4 , 0 );
      Board board = new Board(4, 0);
      assertEquals(true, board.showTable());
   }

   @Test
   public void shouldCreateTable() {
      // Board boardd = new Board(4 , 0 );
      int[][] compareMatrix = { { 0, 0, 0, 0 },
            { 0, 0, 0, 0 },
            { 0, 0, 0, 0 },
            { 0, 0, 0, 0 } };
      Board board = new Board(4, 0);
      assertArrayEquals(compareMatrix, board.createTable());
   }

   @Test
   public void shouldReplacePositions() {
      int[][] compareMatrix = { { 2, 0, 0, 0 },
            { 0, 0, 0, 0 },
            { 0, 0, 0, 0 },
            { 0, 0, 0, 0 } };
      Board board = new Board(4, 0);
      //board.createTable();
      board.replacePositions(0, 0, 2);
      assertArrayEquals(compareMatrix, board.returnBoard());
   }

   @Test
   public void shouldMoveNumberUp() {
      int[][] compareMatrix = { { 0, 0, 0, 2 },
            { 0, 0, 0, 0 },
            { 0, 0, 0, 0 },
            { 0, 0, 0, 0 } };
      Board board = new Board(4, 0);
      //board.createTable();
      board.replacePositions(3, 3, 2);
      board.moveNumberUp('w');
      assertArrayEquals(compareMatrix, board.returnBoard());

   }

   @Test
   public void shouldAditonUp() {
      Board board = new Board(4, 0);
      int[][] compareAditionMatrix = { { 0, 0, 0, 4 },
            { 0, 0, 0, 0 },
            { 0, 0, 0, 0 },
            { 0, 0, 0, 0 } };
      board.replacePositions(2, 3, 2);
      board.replacePositions(3, 3, 2);
      board.moveNumberUp('w');
      assertArrayEquals(compareAditionMatrix, board.returnBoard());
   }

   @Test
   public void shouldMoveNumberLeft() {
      int[][] compareMatrix = { { 0, 0, 0, 0 },
            { 2, 0, 0, 0 },
            { 0, 0, 0, 0 },
            { 0, 0, 0, 0 } };
      Board board = new Board(4, 0);
      //board.createTable();
      board.replacePositions(1, 3, 2);
      board.moveNumberLeft('a');
      assertArrayEquals(compareMatrix, board.returnBoard());
   }

   @Test
   public void shouldAditonLeft() {
      Board board = new Board(4, 0);
      int[][] compareAditionMatrix = { { 0, 0, 0, 0 },
            { 4, 0, 0, 0 },
            { 0, 0, 0, 0 },
            { 0, 0, 0, 0 } };
      board.replacePositions(1, 3, 2);
      board.replacePositions(1, 1, 2);
      board.moveNumberLeft('a');
      assertArrayEquals(compareAditionMatrix, board.returnBoard());
   }

   @Test
   public void shouldMoveNumberRight() {
      int[][] compareMatrix = { { 0, 0, 0, 0 },
            { 0, 0, 0, 2 },
            { 0, 0, 0, 0 },
            { 0, 0, 0, 0 } };
      Board board = new Board(4, 0);
      //board.createTable();
      board.replacePositions(1, 0, 2);
      board.moveNumberRight('d');
      assertArrayEquals(compareMatrix, board.returnBoard());
   }

   @Test
   public void shouldAditonRight() {
      Board board = new Board(4, 0);
      int[][] compareAditionMatrix = { { 0, 0, 0, 0 },
            { 0, 0, 0, 4 },
            { 0, 0, 0, 0 },
            { 0, 0, 0, 0 } };
      board.replacePositions(1, 0, 2);
      board.replacePositions(1, 1, 2);
      board.moveNumberRight('d');
      assertArrayEquals(compareAditionMatrix, board.returnBoard());
   }

   @Test
   public void shouldMoveNumberDown() {
      int[][] compareMatrix = { { 0, 0, 0, 0 },
            { 0, 0, 0, 0 },
            { 0, 0, 0, 0 },
            { 0, 2, 0, 0 } };
      Board board = new Board(4, 0);
      //board.createTable();
      board.replacePositions(0, 1, 2);
      board.moveNumberDown('s');
      assertArrayEquals(compareMatrix, board.returnBoard());
   }

   @Test
   public void shouldAditonDown() {
      Board board = new Board(4, 0);
      int[][] compareAditionMatrix = { { 0, 0, 0, 0 },
            { 0, 0, 0, 0 },
            { 0, 0, 0, 0 },
            { 0, 4, 0, 0 } };
      board.replacePositions(1, 1, 2);
      board.replacePositions(2, 1, 2);
      board.moveNumberDown('s');
      assertArrayEquals(compareAditionMatrix, board.returnBoard());
   }
   @Test
   public void shouldShowScore() {
      Board board = new Board(4, 0);
      board.replacePositions(1, 1, 2);
      board.replacePositions(2, 1, 2);
      board.moveNumberDown('s');
      assertEquals(4, board.showScore());
   }
   @Test
   public void shouldCountZeros() {
      Board board = new Board(4, 0);
      assertEquals(16, board.countZeros());
   }
}

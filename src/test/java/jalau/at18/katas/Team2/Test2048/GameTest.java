package jalau.at18.katas.Team2.Test2048;

import static org.junit.Assert.*;
import org.junit.Test;

import jalau.at18.katas.game2048.team2.Board;
import jalau.at18.katas.game2048.team2.Game;

public class GameTest {
    @Test
    public void shouldTryToFillPosition() {
        Board board = new Board(4, 0);
        Game game = new Game(board);
        game.tryToFillPosition();
        assertEquals(15, board.countZeros());
    }

    @Test
    public void shouldMoveNumberUp() {
        Board board = new Board(4, 0);
        Game game = new Game(board);
        assertTrue(game.gameMoves('w'));
    }

    @Test
    public void shouldMoveNumberDown() {
        Board board = new Board(4, 0);
        Game game = new Game(board);
        assertTrue(game.gameMoves('s'));
    }

    @Test
    public void shouldMoveNumberLeft() {
        Board board = new Board(4, 0);
        Game game = new Game(board);
        assertTrue(game.gameMoves('a'));
    }

    @Test
    public void shouldMoveNumberRight() {
        Board board = new Board(4, 0);
        Game game = new Game(board);
        assertTrue(game.gameMoves('d'));
    }

}
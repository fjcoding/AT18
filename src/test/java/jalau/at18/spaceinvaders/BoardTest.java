package jalau.at18.spaceinvaders;

import org.junit.Test;
import static org.junit.Assert.*;

public class BoardTest {
    @Test
    public void hasACleanBoardWhenInitialize() {
        Board board = new Board();
        char[][] expected = { { '*', '*', '*', '*', '*', '*', '*', '*', '*', '*' },
                { '*', '*', '*', '*', '*', '*', '*', '*', '*', '*' },
                { '*', '*', '*', '*', '*', '*', '*', '*', '*', '*' },
                { '*', '*', '*', '*', '*', '*', '*', '*', '*', '*' },
                { '*', '*', '*', '*', '*', '*', '*', '*', '*', '*' },
                { '*', '*', '*', '*', '*', '*', '*', '*', '*', '*' },
                { '*', '*', '*', '*', '*', '*', '*', '*', '*', '*' },
                { '*', '#', '#', '#', '*', '*', '#', '#', '#', '*' },
                { '*', '#', '*', '#', '*', '*', '#', '*', '#', '*' },
                { '*', '*', '*', '*', '*', '*', '*', '*', '*', '*' } };
        assertArrayEquals(expected, board.getMatrix());
    }

    @Test
    public void testToStringCleanBoard() {
        Board board = new Board();
        String expected = "-----------------------" + "\n" +
                "| * * * * * * * * * * |" + "\n" +
                "| * * * * * * * * * * |" + "\n" +
                "| * * * * * * * * * * |" + "\n" +
                "| * * * * * * * * * * |" + "\n" +
                "| * * * * * * * * * * |" + "\n" +
                "| * * * * * * * * * * |" + "\n" +
                "| * * * * * * * * * * |" + "\n" +
                "| * # # # * * # # # * |" + "\n" +
                "| * # * # * * # * # * |" + "\n" +
                "| * * * * * * * * * * |" + "\n" +
                "-----------------------" + "\n";
        assertEquals(expected, board.toString());
    }

    @Test
    public void testToStringBoard() {
        Board board = new Board();
        board.setElement(4, 4, '&');
        String expected = "-----------------------" + "\n" +
                "| * * * * * * * * * * |" + "\n" +
                "| * * * * * * * * * * |" + "\n" +
                "| * * * * * * * * * * |" + "\n" +
                "| * * * * * * * * * * |" + "\n" +
                "| * * * * & * * * * * |" + "\n" +
                "| * * * * * * * * * * |" + "\n" +
                "| * * * * * * * * * * |" + "\n" +
                "| * # # # * * # # # * |" + "\n" +
                "| * # * # * * # * # * |" + "\n" +
                "| * * * * * * * * * * |" + "\n" +
                "-----------------------" + "\n";
        assertEquals(expected, board.toString());
    }

    @Test
    public void setElement() {
        Board board = new Board();
        board.setElement(4, 4, '^');
        char[][] expected = { { '*', '*', '*', '*', '*', '*', '*', '*', '*', '*' },
                { '*', '*', '*', '*', '*', '*', '*', '*', '*', '*' },
                { '*', '*', '*', '*', '*', '*', '*', '*', '*', '*' },
                { '*', '*', '*', '*', '*', '*', '*', '*', '*', '*' },
                { '*', '*', '*', '*', '^', '*', '*', '*', '*', '*' },
                { '*', '*', '*', '*', '*', '*', '*', '*', '*', '*' },
                { '*', '*', '*', '*', '*', '*', '*', '*', '*', '*' },
                { '*', '#', '#', '#', '*', '*', '#', '#', '#', '*' },
                { '*', '#', '*', '#', '*', '*', '#', '*', '#', '*' },
                { '*', '*', '*', '*', '*', '*', '*', '*', '*', '*' } };
        assertArrayEquals(expected, board.getMatrix());
    }

    @Test
    public void getMaxSize() {
        Board board = new Board();
        assertEquals(10, board.getMaxSize());
    }

    @Test
    public void existShield() {
        Board board = new Board();
        assertEquals(true, board.existShield(8, 1));
    }

    @Test
    public void impactShield() {
        Board board = new Board();
        board.impactShield(8, 1);
        board.impactShield(8, 1);
        board.impactShield(8, 1);
        assertEquals(true, board.existShield(8, 1));
        assertEquals('-', board.getElement(8, 1));
    }
}

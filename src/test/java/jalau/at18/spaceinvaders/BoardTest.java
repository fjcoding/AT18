package jalau.at18.spaceinvaders;

import org.junit.Test;
import static org.junit.Assert.* ;

public class BoardTest {

    @Test
    public void testToStringBoard() {
        Board board = new Board();
        board.setElement(4, 4, '&');
        String expected = "-----------------------" + "\n" +
                "| % % % %             |" + "\n" +
                "| % % % %             |" + "\n" +
                "|                     |" + "\n" +
                "|                     |" + "\n" +
                "|         &           |" + "\n" +
                "|                     |" + "\n" +
                "|                     |" + "\n" +
                "|   # # #     # # #   |" + "\n" +
                "|   #   #     #   #   |" + "\n" +
                "|                     |" + "\n" +
                "-----------------------" + "\n";
                System.out.println(expected);
                System.out.println(board.toString());
        assertEquals(expected, board.toString());
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

    @Test
    public void clearPosition() {
        Board board = new Board();
        board.setElement(2, 2, '&');
        board.clearPosition(2, 2);
        char[][] expected = { { '%', '%', '%', '%', ' ', ' ', ' ', ' ', ' ', ' ' },
                { '%', '%', '%', '%', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', '#', '#', '#', ' ', ' ', '#', '#', '#', ' ' },
                { ' ', '#', ' ', '#', ' ', ' ', '#', ' ', '#', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' } };
        assertArrayEquals(expected, board.getMatrix());
    }

    @Test
    public void shouldGetScore() {
        Board borad = new Board();
        assertEquals(0, borad.getScore());
    }

    @Test
    public void shouldMoveAliens() {
        Board board = new Board();
        board.moveAliens();
        char[][] expected = { { ' ', '%', '%', '%', '%', ' ', ' ', ' ', ' ', ' ' },
                { ' ', '%', '%', '%', '%', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', '#', '#', '#', ' ', ' ', '#', '#', '#', ' ' },
                { ' ', '#', ' ', '#', ' ', ' ', '#', ' ', '#', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' } };
        assertArrayEquals(expected, board.getMatrix());
    }

    @Test
    public void shoulIsAlive() {
        Board board = new Board();
        //board.setElement(9, 9, '%');
        assertEquals(true, board.isAlive());
        
    }
}

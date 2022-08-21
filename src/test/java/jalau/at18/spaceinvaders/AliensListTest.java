package jalau.at18.spaceinvaders;
import static org.junit.Assert.*;
import org.junit.Test;

public class AliensListTest {
    @Test
    public void shouldAlienListMoveRigth(){
        Board board = new Board();
        AliensList aliensList = new AliensList(board);
        String expected = "-----------------------" + "\n" +
                          "| * % % % % * * * * * |" + "\n" +
                          "| * % % % % * * * * * |" + "\n" +
                          "| * * * * * * * * * * |" + "\n" +
                          "| * * * * * * * * * * |" + "\n" +
                          "| * * * * * * * * * * |" + "\n" +
                          "| * * * * * * * * * * |" + "\n" +
                          "| * * * * * * * * * * |" + "\n" +
                          "| * # # # * * # # # * |" + "\n" +
                          "| * # * # * * # * # * |" + "\n" +
                          "| * * * * * * * * * * |" + "\n" +
                          "-----------------------" + "\n";
        aliensList.moveAlienRigth();
        assertEquals(expected, board.toString());

    }

    /*@Test
    public void shouldAlienListMoveLeft(){
        Board board = new Board();
        AliensList aliensList = new AliensList(board);
        Alien alien = new Alien();
        final int[] input = {6, 7, 8, 9};
        String expected = "-----------------------" + "\n" +
                          "| * % % % % * * * * * |" + "\n" +
                          "| * % % % % * * * * * |" + "\n" +
                          "| * * * * * * * * * * |" + "\n" +
                          "| * * * * * * * * * * |" + "\n" +
                          "| * * * * * * * * * * |" + "\n" +
                          "| * * * * * * * * * * |" + "\n" +
                          "| * * * * * * * * * * |" + "\n" +
                          "| * # # # * * # # # * |" + "\n" +
                          "| * # * # * * # * # * |" + "\n" +
                          "| * * * * * * * * * * |" + "\n" +
                          "-----------------------" + "\n";
        alien.setPosX(input);
        aliensList.moveAlienLeft();
        assertEquals(expected, board.toString());

    }*/
    
    @Test
    public void shouldAlienListMoveDown(){
        Board board = new Board();
        AliensList aliensList = new AliensList(board);
        String expected = "-----------------------" + "\n" +
                          "| * * * * * * * * * * |" + "\n" +
                          "| % % % % * * * * * * |" + "\n" +
                          "| % % % % * * * * * * |" + "\n" +
                          "| * * * * * * * * * * |" + "\n" +
                          "| * * * * * * * * * * |" + "\n" +
                          "| * * * * * * * * * * |" + "\n" +
                          "| * * * * * * * * * * |" + "\n" +
                          "| * # # # * * # # # * |" + "\n" +
                          "| * # * # * * # * # * |" + "\n" +
                          "| * * * * * * * * * * |" + "\n" +
                          "-----------------------" + "\n";
        aliensList.moveAlienDown();
        assertEquals(expected, board.toString());
    }
}

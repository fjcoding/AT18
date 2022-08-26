package jalau.at18.spaceinvaders;
import static org.junit.Assert.*;
import org.junit.Test;

public class ShipBulletTest {
    @Test
    public void itShouldMoveBullet() {
        Board board = new Board();
        ShipBullet shipbullet = new ShipBullet(9, 4);
        shipbullet.move(board);
        char[][] expected = { { '%', '%', '%', '%', ' ', ' ', ' ', ' ', ' ', ' ' },
                { '%', '%', '%', '%', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', '#', '#', '#', ' ', ' ', '#', '#', '#', ' ' },
                { ' ', '#', ' ', '#', '|', ' ', '#', ' ', '#', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' } };
        assertArrayEquals(expected, board.getMatrix());
    }
   /*  @Test
    public void itShouldMoveBulletAndDestroyShield() {

        Board board = new Board();
        ShipBullet shipbullet = new ShipBullet(9, 4);
        shipbullet.move(board);
        char[][] expected = { { '%', '%', '%', '%', ' ', ' ', ' ', ' ', ' ', ' ' },
                { '%', '%', '%', '%', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', '#', '#', '#', ' ', ' ', '#', '#', '#', ' ' },
                { ' ', '#', ' ', '#', '|', ' ', '#', ' ', '#', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' } };
        assertArrayEquals(expected, board.getMatrix());
    }*/
    @Test
    public void itShouldMoveBulletAndCleanBoard() {

        Board board = new Board();
        ShipBullet shipbullet = new ShipBullet(9, 4);
        shipbullet.move(board);
        shipbullet.move(board);
        char[][] expected = { { '%', '%', '%', '%', ' ', ' ', ' ', ' ', ' ', ' ' },
                { '%', '%', '%', '%', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', '#', '#', '#', '|', ' ', '#', '#', '#', ' ' },
                { ' ', '#', ' ', '#', ' ', ' ', '#', ' ', '#', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' } };
        assertArrayEquals(expected, board.getMatrix());
    }
    @Test
    public void itShouldDestroyAllien() {

        Board board = new Board();
        ShipBullet shipbullet = new ShipBullet(2, 3);
        shipbullet.move(board);
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
    public void itShouldDestroyShield() {

        Board board = new Board();
        ShipBullet shipbullet = new ShipBullet(9, 3);
        shipbullet.move(board);
        char[][] expected = { { '%', '%', '%', '%', ' ', ' ', ' ', ' ', ' ', ' ' },
                { '%', '%', '%', '%', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', '#', '#', '#', ' ', ' ', '#', '#', '#', ' ' },
                { ' ', '#', ' ', '=', ' ', ' ', '#', ' ', '#', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' } };
        assertArrayEquals(expected, board.getMatrix());
    }
    @Test
    public void itShouldReturnPosXBullet(){

        ShipBullet shipbullet = new ShipBullet(9, 4);
        assertEquals(9, shipbullet.getPosX());

    }
    @Test
    public void itShouldReturnPosYBullet(){

        ShipBullet shipbullet = new ShipBullet(9, 4);
        assertEquals(4, shipbullet.getPosY());

    }
    @Test
    public void itShouldReturnStatusBullet(){
        ShipBullet shipbullet = new ShipBullet(9, 4);
        shipbullet.impact();
        assertEquals(false, shipbullet.getStatusBullet());

    }



}

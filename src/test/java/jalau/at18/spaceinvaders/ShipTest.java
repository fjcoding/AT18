package jalau.at18.spaceinvaders;

import static org.junit.Assert.*;
import org.junit.Test;

public class ShipTest {

    @Test
    public void shouldUpdateLives() {
        Ship ship = new Ship();
        ship.subtrasctLifes();
        assertEquals(2, ship.getLifes());
    }

    @Test
    public void shouldMoveLeft() {
        Ship ship = new Ship();
        ship.moveLeft();
        assertEquals(9, ship.getPosX());
        assertEquals(3, ship.getPosY());
    }

    @Test
    public void shouldMoveRight() {
        Ship ship = new Ship();
        ship.moveRight();
        assertEquals(9, ship.getPosX());
        assertEquals(5, ship.getPosY());
    }

    @Test
    public void itShouldReturnPositionY() {
        Ship ship = new Ship();
        assertEquals(4, ship.getPosY());
    }

    @Test
    public void itShouldReturnStatusOfLifes() {
        Ship ship = new Ship();
        assertEquals(true, ship.getIsAlive());
    }

    @Test
    public void getIsAliveShipNoHaveLifes() {
        Ship ship = new Ship();
        ship.subtrasctLifes();
        ship.subtrasctLifes();
        ship.subtrasctLifes();
        assertEquals(false, ship.getIsAlive());
    }

    @Test
    public void getIsAliveShipHaveLifes() {
        Ship ship = new Ship();
        ship.subtrasctLifes();
        ship.subtrasctLifes();
        assertEquals(true, ship.getIsAlive());
    }

    @Test
    public void itShouldRestartPosition() {
        Ship ship = new Ship();
        ship.moveRight();
        ship.reStartPosition();
        assertEquals(4,ship.getPosY());
        assertEquals(9,ship.getPosX());
    }

    @Test
    public void itShouldSubstractOneLife() {
        Ship ship = new Ship();
        ship.subtrasctLifes();
        assertEquals(2, ship.getLifes());
    }
    @Test
    public void itShouldShoot() {
        Board board = new Board();
        Ship ship = new Ship();
        ship.shoot(board);
        assertEquals(true, ship.isThereBullets());

    }
    @Test
    public void itShouldKnowIfThereAreBullets() {
        Ship ship = new Ship();
        assertEquals(false, ship.isThereBullets());
    }
    @Test
    public void itShouldMoveBullets() {
        Board board = new Board();
        Ship ship = new Ship();
        ship.shoot(board);
        ship.moveBullets(board);
        char[][] expected1 = { { '*', '*', '*', '*', '*', '*', '*', '*', '*', '*' },
                { '*', '*', '*', '*', '*', '*', '*', '*', '*', '*' },
                { '*', '*', '*', '*', '*', '*', '*', '*', '*', '*' },
                { '*', '*', '*', '*', '*', '*', '*', '*', '*', '*' },
                { '*', '*', '*', '*', '*', '*', '*', '*', '*', '*' },
                { '*', '*', '*', '*', '*', '*', '*', '*', '*', '*' },
                { '*', '*', '*', '*', '*', '*', '*', '*', '*', '*' },
                { '*', '#', '#', '#', '*', '*', '#', '#', '#', '*' },
                { '*', '#', '*', '#', '|', '*', '#', '*', '#', '*' },
                { '*', '*', '*', '*', '*', '*', '*', '*', '*', '*' } };
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

}

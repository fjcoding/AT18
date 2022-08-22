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
        assertEquals(3, ship.getPosX());
        assertEquals(9, ship.getPosY());
    }
    @Test
    public void shouldMoveRight() {
        Ship ship = new Ship();
        ship.moveRight();
        assertEquals(5, ship.getPosX());
        assertEquals(9, ship.getPosY());
    }
    @Test
    public void itShouldReturnPositionY() {
        Ship ship = new Ship();
        assertEquals(9, ship.getPosY());
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
        assertEquals(9,ship.getPosY());
        assertEquals(4,ship.getPosX());

    }
    @Test
    public void itShouldSubstractOneLife() {
        Ship ship = new Ship();
        ship.subtrasctLifes();
        assertEquals(2,ship.getLifes());

    }
}

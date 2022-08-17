package jalau.at18.spaceinvaders;
import static org.junit.Assert.*;
import org.junit.Test;

public class ShipTest {

    @Test
    public void shouldUpdateLives() {
        Ship ship = new Ship();
        ship.setLifes(5);
        assertEquals(5, ship.getLifes());
    }
    @Test
    public void shouldChangePositionX() {
        Ship ship = new Ship();
        ship.setPosX(5);
        assertEquals(5, ship.getPosX());
    }
    @Test
    public void shouldMoveLeft() {
        Ship ship = new Ship();
        ship.moveLeft();
        assertEquals(3, ship.getPosX());
    }
    @Test
    public void shouldMoveRight() {
        Ship ship = new Ship();
        ship.moveRight();
        assertEquals(5, ship.getPosX());
    }
    @Test
    public void itShouldReturnPositionY() {
        Ship ship = new Ship();
        assertEquals(9, ship.getPosY());
    }
}

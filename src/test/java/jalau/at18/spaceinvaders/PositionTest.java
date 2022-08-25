package jalau.at18.spaceinvaders;

import org.junit.Test;
import static org.junit.Assert.*;


public class PositionTest {
    @Test
    public void moveUp() {
        Position position = new Position(8, 8);
        position.moveUp();
        assertEquals(7, position.getPosX());
    }
    @Test
    public void moveDown() {
        Position position = new Position(8, 8);
        position.moveDown();
        assertEquals(9, position.getPosX());
    }
    @Test
    public void moveRight() {
        Position position = new Position(8, 8);
        position.moveRigth();
        assertEquals(9, position.getPosY());
    }
    @Test
    public void moveLeft() {
        Position position = new Position(8, 8);
        position.moveLeft();
        assertEquals(7, position.getPosY());
    }
    @Test
    public void moveTwoPositions() {
        Position position = new Position(8, 8);
        position.moveRigth();
        position.moveDown();
        assertEquals(9, position.getPosX());
        assertEquals(9, position.getPosY());
    }

    @Test
    public void movePositionsOutScope() {
        Position position = new Position(8, 8);
        position.moveRigth();
        position.moveRigth();
        assertEquals(8, position.getPosX());
        assertEquals(9, position.getPosY());
    }
}

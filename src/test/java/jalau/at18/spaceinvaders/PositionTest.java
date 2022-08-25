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
    public void movePositionsRightOutScope() {
        Position position = new Position(8, 8);
        position.moveRigth();
        position.moveRigth();
        assertEquals(8, position.getPosX());
        assertEquals(9, position.getPosY());
    }

    @Test
    public void movePositionsLeftOutScope() {
        Position position = new Position(1, 1);
        position.moveLeft();
        position.moveLeft();
        assertEquals(1, position.getPosX());
        assertEquals(0, position.getPosY());
    }

    @Test
    public void movePositionsUpOutScope() {
        Position position = new Position(1, 1);
        position.moveUp();
        position.moveUp();
        assertEquals(0, position.getPosX());
        assertEquals(1, position.getPosY());
    }

    @Test
    public void movePositionsDownOutScope() {
        Position position = new Position(9, 1);
        position.moveDown();
        position.moveDown();
        assertEquals(9, position.getPosX());
        assertEquals(1, position.getPosY());
    }
}

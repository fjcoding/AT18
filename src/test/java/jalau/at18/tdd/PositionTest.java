package jalau.at18.tdd;

import org.junit.Test;
import static org.junit.Assert.*;

public class PositionTest {

    @Test
    public void positionShouldHaveCoordXandY() {
        Position position = new Position(2, 3);
        int expectedX = 2;
        int expectedY = 3;
        assertEquals(expectedX, position.getX());
        assertEquals(expectedY, position.getY());
    }

    @Test
    public void positionShouldBeAbleToMoveUp() {
        Position position = new Position(2, 3);
        position.move(Direction.UP);
        int expectedX = 1;
        int expectedY = 3;
        assertEquals(expectedX, position.getX());
        assertEquals(expectedY, position.getY());
    }

    @Test
    public void positionShouldBeAbleToMoveDown() {
        Position position = new Position(2, 3);
        position.move(Direction.DOWN);
        int expectedX = 3;
        int expectedY = 3;
        assertEquals(expectedX, position.getX());
        assertEquals(expectedY, position.getY());
    }

    @Test
    public void positionShouldBeAbleToMoveLeft() {
        Position position = new Position(2, 3);
        position.move(Direction.LEFT);
        int expectedX = 2;
        int expectedY = 2;
        assertEquals(expectedX, position.getX());
        assertEquals(expectedY, position.getY());
    }

    @Test
    public void positionShouldBeAbleToMoveRight() {
        Position position = new Position(2, 3);
        position.move(Direction.RIGHT);
        int expectedX = 2;
        int expectedY = 4;
        assertEquals(expectedX, position.getX());
        assertEquals(expectedY, position.getY());
    }
}

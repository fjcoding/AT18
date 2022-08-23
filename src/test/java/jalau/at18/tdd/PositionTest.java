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
}

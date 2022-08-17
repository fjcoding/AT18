package jalau.at18.battlecity;

import org.junit.Test;
import static org.junit.Assert.*;

public class LeftBrickTest {
    @Test
    public void reduceLive() {
        LeftBrick leftBrick = new LeftBrick();
        int actualLive = leftBrick.reduceLive(1);
        assertEquals(1, actualLive);
    }

    @Test
    public void blockTank() {
        LeftBrick leftBrick = new LeftBrick();
        assertTrue(leftBrick.isBlockTank());
    }

    @Test
    public void allowPassBullet() {
        LeftBrick leftBrick = new LeftBrick();
        assertTrue(leftBrick.isAllowPassBullet());
    }

    @Test
    public void allowStaySamePosition() {
        LeftBrick leftBrick = new LeftBrick();
        assertTrue(leftBrick.isAllowPassBullet());
    }

}

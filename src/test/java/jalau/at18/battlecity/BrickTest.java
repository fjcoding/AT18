package jalau.at18.battlecity;

import org.junit.Test;
import static org.junit.Assert.*;

public class BrickTest {
    @Test
    public void reduceLive() {
        Brick brick = new Brick();
        int actualLive = brick.reduceLive(1);
        assertEquals(1, actualLive);
    }

    @Test
    public void canBlockTank() {
        Brick brick = new Brick();
        assertTrue(brick.isBlockTank());
    }

    @Test
    public void allowPassBullet() {
        Brick brick = new Brick();
        assertFalse(brick.isAllowPassBullet());
    }
    @Test
    public void allowStaySamePosition() {
        Brick brick = new Brick();
        assertFalse(brick.isAllowStaySamePosition());
    }
}

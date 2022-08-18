package jalau.at18.battlecity;

import org.junit.*;

import static org.junit.Assert.*;

public class LeftStealTest {
    @Test
    public void reduceLive() {
        LeftSteal leftSteal = new LeftSteal();
        int actualLive = leftSteal.reduceLive(1);
        assertEquals(2, actualLive);
    }

    @Test
    public void blockTank() {
        LeftSteal leftSteal = new LeftSteal();
        assertTrue(leftSteal.isBlockTank());
    }

    @Test
    public void allowPassBullet() {
        LeftSteal leftSteal = new LeftSteal();
        assertFalse(leftSteal.isAllowPassBullet());
    }

    @Test
    public void allowStaySamePosition() {
        LeftSteal leftSteal = new LeftSteal();
        assertFalse(leftSteal.isAllowPassBullet());
    }
}

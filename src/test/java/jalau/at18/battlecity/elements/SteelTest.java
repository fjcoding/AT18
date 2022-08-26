package jalau.at18.battlecity.elements;

import jalau.at18.battlecity.elements.Steel;
import org.junit.*;

import static org.junit.Assert.*;

public class SteelTest {
    @Test
    public void reduceLive() {
        Steel steel = new Steel();
        int actualLive = steel.reduceLive(1);
        assertEquals(2, actualLive);
    }

    @Test
    public void blockTank() {
        Steel steel = new Steel();
        assertTrue(steel.isBlockTank());
    }

    @Test
    public void allowPassBullet() {
        Steel steel = new Steel();
        assertFalse(steel.isAllowPassBullet());
    }

    @Test
    public void allowStaySamePosition() {
        Steel steel = new Steel();
        assertFalse(steel.isAllowPassBullet());
    }
}

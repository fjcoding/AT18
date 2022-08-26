package jalau.at18.battlecity.elements;

import jalau.at18.battlecity.elements.Water;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WaterTest {
    @Test
    public void reduceLive() {
        Water water = new Water();
        assertEquals(0, water.reduceLive(0));
    }

    @Test
    public void blockTank() {
        Water water = new Water();
        assertTrue(water.isBlockTank());
    }

    @Test
    public void allowPassBullet() {
        Water water = new Water();
        assertTrue(water.isAllowPassBullet());
    }

    @Test
    public void allowStaySamePosition() {
        Water water = new Water();
        assertTrue(!water.isAllowStaySamePosition());
    }
}

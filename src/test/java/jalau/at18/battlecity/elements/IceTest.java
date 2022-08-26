package jalau.at18.battlecity.elements;

import jalau.at18.battlecity.elements.Ice;
import org.junit.Test;

import static org.junit.Assert.*;

public class IceTest {
    @Test
    public void reduceLive() {
        Ice ice = new Ice();
        assertEquals(0, ice.reduceLive(0));
    }

    @Test
    public void blockTank() {
        Ice ice = new Ice();
        assertTrue(!ice.isBlockTank());
    }

    @Test
    public void allowPassBullet() {
        Ice ice = new Ice();
        assertTrue(ice.isAllowPassBullet());
    }

    @Test
    public void allowStaySamePosition() {
        Ice ice = new Ice();
        assertTrue(ice.isAllowStaySamePosition());
    }

}

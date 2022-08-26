package jalau.at18.battlecity.elements;

import jalau.at18.battlecity.elements.Bushes;
import org.junit.Test;
import static org.junit.Assert.*;

public class BushesTest {
    @Test
    public void reduceLive() {
        Bushes bushes = new Bushes();
        assertEquals(-1, bushes.reduceLive(0));
    }

    @Test
    public void blockTank() {
        Bushes bushes = new Bushes();
        assertTrue(!bushes.isBlockTank());
    }

    @Test
    public void allowPassBullet() {
        Bushes bushes = new Bushes();
        assertTrue(bushes.isAllowPassBullet());
    }

    @Test
    public void allowStaySamePosition() {
        Bushes bushes = new Bushes();
        assertTrue(bushes.isAllowStaySamePosition());
    }
}

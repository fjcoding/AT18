package jalau.at18.battlecity.elements;

import jalau.at18.battlecity.elements.Eagle;
import org.junit.Test;
import static org.junit.Assert.*;


public class EagleTest {
    @Test
    public void reduceLive() {
        Eagle eagle = new Eagle();
        int actualLive = eagle.reduceLive(1);
        assertEquals(0, actualLive);
    }

    @Test
    public void canBlockTank() {
        Eagle eagle = new Eagle();
        assertTrue(eagle.isBlockTank());
    }

    @Test
    public void allowPassBullet() {
        Eagle eagle = new Eagle();
        assertFalse(eagle.isAllowPassBullet());
    }
    @Test
    public void allowStaySamePosition() {
        Eagle eagle = new Eagle();
        assertFalse(eagle.isAllowStaySamePosition());
    }

}
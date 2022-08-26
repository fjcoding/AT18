package jalau.at18.battlecity.elements;


import jalau.at18.battlecity.elements.Empty;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmptyTest {
    @Test
    public void reduceLive() {
        Empty empty = new Empty();
        int actualLive = empty.reduceLive(0);
        assertEquals(-1, actualLive);
    }

    @Test
    public void canBlockTank() {
        Empty empty = new Empty();
        assertFalse(empty.isBlockTank());
    }

    @Test
    public void allowPassBullet() {
        Empty empty = new Empty();
        assertTrue(empty.isAllowPassBullet());
    }

    @Test
    public void allowStaySamePosition() {
        Empty empty = new Empty();
        assertTrue(empty.isAllowStaySamePosition());
    }

}
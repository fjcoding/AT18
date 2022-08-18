package jalau.at18.battlecity;

import org.junit.Test;
import static org.junit.Assert.*;

public class CompleteBrickTest {
    @Test
    public void reduceLive() {
        CompleteBrick completeBrick = new CompleteBrick();
        int actualLive = completeBrick.reduceLive(1);
        assertEquals(3, actualLive);
    }

    @Test
    public void canBlockTank() {
        CompleteBrick completeBrick = new CompleteBrick();
        assertTrue(completeBrick.isBlockTank());
    }

    @Test
    public void allowPassBullet() {
        CompleteBrick completeBrick = new CompleteBrick();
        assertFalse(completeBrick.isAllowPassBullet());
    }
    @Test
    public void allowStaySamePosition() {
        CompleteBrick completeBrick = new CompleteBrick();
        assertFalse(completeBrick.isAllowStaySamePosition());
    }
}

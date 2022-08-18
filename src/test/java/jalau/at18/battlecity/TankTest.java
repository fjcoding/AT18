package jalau.at18.battlecity;

import static org.junit.Assert.*;
import org.junit.Test;

public class TankTest {

    @Test
    public void functionShouldArrangeUpMatrix() {
        EnemyTank enemyTank1 = new EnemyTank(20);
        int[][] input = {{3, 7}, {3, 6}, {2, 7}, {2, 6}};
        int[][] expected1 = {{2, 6}, {2, 7}, {3, 6}, {3, 7}};
        assertEquals(expected1, enemyTank1.arrangeUp(input));
    }

    @Test
    public void functionShouldArrangeDownMatrix() {
        EnemyTank enemyTank1 = new EnemyTank(20);
        int[][] input = {{2, 6}, {2, 7}, {3, 6}, {3, 7}};
        int[][] expected1 = {{3, 7}, {3, 6}, {2, 7}, {2, 6}};
        assertEquals(expected1, enemyTank1.arrangeDown(input));
    }

    @Test
    public void functionShouldArrangeLeftMatrix() {
        EnemyTank enemyTank1 = new EnemyTank(20);
        int[][] input = {{2, 6}, {2, 7}, {3, 6}, {3, 7}};
        int[][] expected1 = {{3, 6}, {2, 6}, {3, 7}, {2, 7}};
        assertEquals(expected1, enemyTank1.arrangeLeft(input));
    }
 
    @Test
    public void functionShouldArrangeRightMatrix() {
        EnemyTank enemyTank1 = new EnemyTank(20);
        int[][] input = {{2, 6}, {2, 7}, {3, 6}, {3, 7}};
        int[][] expected1 = {{2, 7}, {3, 7}, {2, 6}, {3, 6}};
        assertEquals(expected1, enemyTank1.arrangeRight(input));
    }
}

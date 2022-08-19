package jalau.at18.battlecity;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestEnemyTanks {

    @Test
    public void functionShouldGiveInitialPosition() {
        EnemyTank enemyTank1 = new EnemyTank(20);
        int[][] expected1 = {{1, 14}, {1, 13}, {0, 14}, {0, 13}};
        assertEquals(expected1, enemyTank1.initialPosition());
        EnemyTank enemyTank2 = new EnemyTank(19);
        int[][] expected2 = {{1, 25}, {1, 24}, {0, 25}, {0, 24}};
        assertEquals(expected2, enemyTank2.initialPosition());
        EnemyTank enemyTank3 = new EnemyTank(18);
        int[][] expected3 = {{1, 1}, {1, 0}, {0, 1}, {0, 0}};
        assertEquals(expected3, enemyTank3.initialPosition());
    }

    @Test
    public void functionShouldMoveUp() {
        EnemyTank enemyTank1 = new EnemyTank(20);
        int[][] input = {{3, 7}, {3, 6}, {2, 7}, {2, 6}};
        int[][] expected1 = {{1, 6}, {1, 7}, {2, 6}, {2, 7}};
        assertEquals(expected1, enemyTank1.moveUp(input));
        int[][] input2 = {{0, 7}, {1, 7}, {0, 6}, {1, 6}};
        int[][] expected2 = {{0, 6}, {0, 7}, {1, 6}, {1, 7}};
        assertEquals(expected2, enemyTank1.moveUp(input2));
    }

    @Test
    public void functionShouldMoveDown() {
        EnemyTank enemyTank1 = new EnemyTank(20);
        int[][] input = {{2, 6}, {2, 7}, {3, 6}, {3, 7}};
        int[][] expected1 = {{4, 7}, {4, 6}, {3, 7}, {3, 6}};
        assertEquals(expected1, enemyTank1.moveDown(input));
        int[][] input2 = {{24, 7}, {25, 7}, {24, 6}, {25, 6}};
        int[][] expected2 = {{25, 7}, {25, 6}, {24, 7}, {24, 6}};
        assertEquals(expected2, enemyTank1.moveDown(input2));
    }


    @Test
    public void functionShouldMoveLeft() {
        EnemyTank enemyTank1 = new EnemyTank(20);
        int[][] input = {{2, 6}, {2, 7}, {3, 6}, {3, 7}};
        int[][] expected1 = {{3, 5}, {2, 5}, {3, 6}, {2, 6}};
        assertEquals(expected1, enemyTank1.moveLeft(input));
        int[][] input2 = {{2, 0}, {2, 1}, {3, 0}, {3, 1}};
        int[][] expected2 = {{3, 0}, {2, 0}, {3, 1}, {2, 1}};
        assertEquals(expected2, enemyTank1.moveLeft(input2));
    }

    @Test
    public void functionShouldMoveRight() {
        EnemyTank enemyTank1 = new EnemyTank(20);
        int[][] input = {{2, 6}, {2, 7}, {3, 6}, {3, 7}};
        int[][] expected1 = {{2, 8}, {3, 8}, {2, 7}, {3, 7}};
        assertEquals(expected1, enemyTank1.moveRight(input));
        int[][] input2 = {{2, 24}, {2, 25}, {3, 24}, {3, 25}};
        int[][] expected2 = {{2, 25}, {3, 25}, {2, 24}, {3, 24}};
        assertEquals(expected2, enemyTank1.moveRight(input2));
    }
}

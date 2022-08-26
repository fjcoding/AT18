package jalau.at18.battlecity.elements;

import static org.junit.Assert.*;

import jalau.at18.battlecity.EnemyTank;
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
    @Test
    public void isTankCrash() {
        EnemyTank enemyTank1 = new EnemyTank(20);
        Element[][] elementsMatrix = initElementsMatrix();
        int[][] position1 = {{3, 4}, {2, 4}, {3, 5}, {2, 5}};
        enemyTank1.setPosition(position1);
        enemyTank1.setDirection("UP");
        assertFalse(enemyTank1.isTankCrash(elementsMatrix));
        int[][] position2 = {{0, 1}, {0, 2}, {1, 1}, {1, 2}};
        enemyTank1.setPosition(position2);
        enemyTank1.setDirection("DOWN");
        assertTrue(enemyTank1.isTankCrash(elementsMatrix));
        int[][] position3 = {{3, 5}, {4, 5}, {3, 4}, {4, 4}};
        enemyTank1.setPosition(position3);
        enemyTank1.setDirection("LEFT");
        assertTrue(enemyTank1.isTankCrash(elementsMatrix));
        int[][] position4 = {{2, 0}, {1, 0}, {2, 1}, {1, 1}};
        enemyTank1.setPosition(position4);
        enemyTank1.setDirection("RIGHT");
        assertTrue(enemyTank1.isTankCrash(elementsMatrix));
    }

    public Element[][] initElementsMatrix() {
        Element[][] elementsMatrix = new Element[26][26];
        for (int row = 0; row < 26; row++) {
            for (int column = 0; column < 26; column++) {
                elementsMatrix[row][column] = new Empty(); 
            }
        }
        elementsMatrix[2][2] = new Brick();
        elementsMatrix[2][3] = new Brick();
        elementsMatrix[3][2] = new Brick();
        elementsMatrix[3][3] = new Brick();
        return elementsMatrix;
    }
}

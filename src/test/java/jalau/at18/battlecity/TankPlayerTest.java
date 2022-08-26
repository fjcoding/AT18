package jalau.at18.battlecity;

import static org.junit.Assert.*;
import org.junit.Test;
import jalau.at18.battlecity.elements.Element;
import jalau.at18.battlecity.elements.Empty;

public class TankPlayerTest {
    public static final int[][] POSITION_MOVE_UP = {{24, 9}, {24, 10}, {25, 9}, {25, 10}};
    public static final int[][] POSITION_MOVE_DOWN = {{8, 17}, {8, 16}, {7, 17}, {7, 16}};
    public static final int[][] POSITION_MOVE_RIGHT = {{13, 18}, {14, 18}, {13, 17}, {14, 17}};
    public static final int[][] POSITION_MOVE_LEFT = {{18, 20}, {17, 20}, {18, 21}, {17, 21}};
    public static final int[][] POSITION_FINAL_UP = {{0, 5}, {0, 6}, {1, 5}, {1, 6}};
    public static final int[][] POSITION_FINAL_DOWN = {{25, 17}, {25, 16}, {24, 17}, {24, 16}};
    public static final int[][] POSITION_FINAL_LEFT = {{18, 0}, {17, 0}, {18, 1}, {17, 1}};
    public static final int[][] POSITION_FINAL_RIGHT = {{13, 25}, {14, 25}, {13, 25}, {14, 25}};

    @Test
    public void movementUpInputTest() {
        TankPlayer tankPlayer = new TankPlayer();
        tankPlayer.setPosition(POSITION_MOVE_UP);
        int[][] newMatrix = tankPlayer.movements("w");
        final int[][] expectedMatrix = {{23, 9}, {23, 10}, {24, 9}, {24, 10}};
        assertArrayEquals(expectedMatrix, newMatrix);
    }
    @Test
    public void movementDownInputTest() {
        TankPlayer tankPlayer = new TankPlayer();
        tankPlayer.setPosition(POSITION_MOVE_DOWN);
        int[][] newMatrix = tankPlayer.movements("s");
        final int[][] expectedMatrix = {{9, 17}, {9, 16}, {8, 17}, {8, 16}};
        assertArrayEquals(expectedMatrix, newMatrix);
    }
    @Test
    public void movementLeftInputTest() {
        TankPlayer tankPlayer = new TankPlayer();
        tankPlayer.setPosition(POSITION_MOVE_LEFT);
        int[][] newMatrix = tankPlayer.movements("a");
        final int[][] expectedMatrix = {{18, 19}, {17, 19}, {18, 20}, {17, 20}};
        assertArrayEquals(expectedMatrix, newMatrix);
    }
    @Test
    public void movementRightInputTest() {
        TankPlayer tankPlayer = new TankPlayer();
        tankPlayer.setPosition(POSITION_MOVE_RIGHT);
        int[][] newMatrix = tankPlayer.movements("d");
        final int[][] expectedMatrix = {{13, 19}, {14, 19}, {13, 18}, {14, 18}};
        assertArrayEquals(expectedMatrix, newMatrix);
    }
    @Test
    public void movementIncorrectInputTest() {
        TankPlayer tankPlayer = new TankPlayer();
        tankPlayer.setPosition(POSITION_MOVE_UP);
        int[][] newMatrix = tankPlayer.movements("h");
        final int[][] expectedMatrix = POSITION_MOVE_UP;
        assertArrayEquals(expectedMatrix, newMatrix);
    }
    @Test
    public void arrangeUpTankTest() {
        TankPlayer tankPlayer = new TankPlayer();
        tankPlayer.setPosition(POSITION_MOVE_DOWN);
        Element[][] newMatrix = tankPlayer.arrageTank(initElementsMatrix(), "w");
        int[][] position = tankPlayer.getPosition();
        final int[][] expectedPosition = {{7, 16}, {7, 17}, {8, 16}, {8, 17}};
        assertArrayEquals(position, expectedPosition);
    }
    @Test
    public void arrangeDownTankTest() {
        TankPlayer tankPlayer = new TankPlayer();
        tankPlayer.setPosition(POSITION_MOVE_DOWN);
        Element[][] newMatrix = tankPlayer.arrageTank(initElementsMatrix(), "s");
        int[][] position = tankPlayer.getPosition();
        final int[][] expectedPosition = POSITION_MOVE_DOWN;
        assertArrayEquals(position, expectedPosition);
    }
    @Test
    public void arrangeLeftTankTest() {
        TankPlayer tankPlayer = new TankPlayer();
        tankPlayer.setPosition(POSITION_MOVE_LEFT);
        Element[][] newMatrix = tankPlayer.arrageTank(initElementsMatrix(), "a");
        int[][] position = tankPlayer.getPosition();
        final int[][] expectedPosition = POSITION_MOVE_LEFT;
        assertArrayEquals(position, expectedPosition);
    }
    @Test
    public void arrangeRightTankTest() {
        TankPlayer tankPlayer = new TankPlayer();
        tankPlayer.setPosition(POSITION_MOVE_RIGHT);
        Element[][] newMatrix = tankPlayer.arrageTank(initElementsMatrix(), "d");
        int[][] position = tankPlayer.getPosition();
        final int[][] expectedPosition = POSITION_MOVE_RIGHT;
        assertArrayEquals(position, expectedPosition);
    }
    @Test
    public void notArrangeTankTest() {
        TankPlayer tankPlayer = new TankPlayer();
        tankPlayer.setPosition(POSITION_MOVE_RIGHT);
        Element[][] newMatrix = tankPlayer.arrageTank(initElementsMatrix(), "h");
        int[][] position = tankPlayer.getPosition();
        final int[][] expectedPosition = POSITION_MOVE_RIGHT;
        assertArrayEquals(position, expectedPosition);
    }
    @Test
    public void movePlayerTest() {
        TankPlayer tankPlayer = new TankPlayer();
        tankPlayer.setPosition(POSITION_MOVE_RIGHT);
        Element[][] newMatrix = tankPlayer.movePlayer(initElementsMatrix(), "d");
        int[][] position = tankPlayer.getPosition();
        final int[][] expectedPosition = {{13, 19}, {14, 19}, {13, 18}, {14, 18}};
        assertArrayEquals(position, expectedPosition);
    }

    public Element[][] initElementsMatrix() {
        Element[][] elementsMatrix = new Element[26][26];
        for (int row = 0; row < 26; row++) {
            for (int column = 0; column < 26; column++) {
                elementsMatrix[row][column] = new Empty();
            }
        }
        return elementsMatrix;
    }


}

package jalau.at18.battlecity;

import static org.junit.Assert.*;
import org.junit.Test;

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
    public void moveUpTest() {
        TankPlayer tankPlayer = new TankPlayer();
        int[][] newMatrix = tankPlayer.moveUp(POSITION_MOVE_UP);
        int[][] newMatrix2 = tankPlayer.moveUp(POSITION_FINAL_UP);
        final int[][] expectedMatrix = {{23, 9}, {23, 10}, {24, 9}, {24, 10}};
        assertArrayEquals(expectedMatrix, newMatrix);
        assertArrayEquals(POSITION_FINAL_UP, newMatrix2);

    }

    @Test
    public void moveDownTest() {
        TankPlayer tankPlayer = new TankPlayer();
        int[][] newMatrix = tankPlayer.moveDown(POSITION_MOVE_DOWN);
        int[][] newMatrix2 = tankPlayer.moveDown(POSITION_FINAL_DOWN);
        final int[][] expectedMatrix = {{9, 17}, {9, 16}, {8, 17}, {8, 16}};
        assertArrayEquals(expectedMatrix, newMatrix);
        assertArrayEquals(POSITION_FINAL_DOWN, newMatrix2);

    }

    @Test
    public void moveRightTest() {
        TankPlayer tankPlayer = new TankPlayer();
        int[][] newMatrix = tankPlayer.moveRight(POSITION_MOVE_RIGHT);
        int[][] newMatrix2 = tankPlayer.moveRight(POSITION_FINAL_RIGHT);
        final int[][] expectedMatrix = {{13, 19}, {14, 19}, {13, 18}, {14, 18}};
        assertArrayEquals(expectedMatrix, newMatrix);
        assertArrayEquals(POSITION_FINAL_RIGHT, newMatrix2);

    }

    @Test
    public void moveLeftTest() {
        TankPlayer tankPlayer = new TankPlayer();
        int[][] newMatrix = tankPlayer.moveLeft(POSITION_MOVE_LEFT);
        int[][] newMatrix2 = tankPlayer.moveLeft(POSITION_FINAL_LEFT);
        final int[][] expectedMatrix = {{18, 19}, {17, 19}, {18, 20}, {17, 20}};
        assertArrayEquals(expectedMatrix, newMatrix);
        assertArrayEquals(POSITION_FINAL_LEFT, newMatrix2);

    }
}

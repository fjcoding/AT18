package jalau.at18.battlecity;

import static org.junit.Assert.*;
import org.junit.Test;

public class TankPlayerTest {
    public static final int [][] POSITION_MOVE_UP = {{24, 9}, {24, 10}, {25, 9}, {25, 10}};
    public static final int [][] POSITION_MOVE_DOWN = {{8, 17}, {8, 16}, {7, 17}, {7, 16}};
    public static final int [][] POSITION_MOVE_RIGHT = {{13, 18}, {14, 18}, {13, 17}, {14, 17}};
    public static final int [][] POSITION_MOVE_LEFT = {{18, 20}, {17, 20}, {18, 21}, {17, 21}};


    @Test
    public void moveUpTest(){
        TankPlayer tankPlayer = new TankPlayer();
        int[][] newMatrix = tankPlayer.moveUp(POSITION_MOVE_UP);
        int[][] expectedMatrix = {{23, 9}, {23, 10}, {24, 9}, {24, 10}};
        assertArrayEquals(expectedMatrix, newMatrix);

    }
    @Test
    public void moveDownTest(){
        TankPlayer tankPlayer = new TankPlayer();
        int[][] newMatrix = tankPlayer.moveDown(POSITION_MOVE_DOWN);
        int[][] expectedMatrix = {{9, 17}, {9, 16}, {8, 17}, {8, 16}};
        assertArrayEquals(expectedMatrix, newMatrix);

    }
    @Test
    public void moveRightTest(){
        TankPlayer tankPlayer = new TankPlayer();
        int[][] newMatrix = tankPlayer.moveRight(POSITION_MOVE_RIGHT);
        int[][] expectedMatrix = {{13, 19}, {14, 19}, {13, 18}, {14, 18}};
        assertArrayEquals(expectedMatrix, newMatrix);

    }
    @Test
    public void moveLeftTest(){
        TankPlayer tankPlayer = new TankPlayer();
        int[][] newMatrix = tankPlayer.moveLeft(POSITION_MOVE_LEFT);
        int[][] expectedMatrix = {{18, 19}, {17, 19}, {18, 20}, {17, 20}};
        assertArrayEquals(expectedMatrix, newMatrix);

    }
}

package jalau.at18.battlecity;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MissileTest {
    Missiles missiles = new Missiles();
    Empty empty = new Empty();

    @Test
    public void testMoveMissileUp() {
        Element[][] missboard = {{empty,empty, empty}, {empty, empty, empty}, {empty, empty, empty}, {empty, empty,empty}};
        Missile missile = new Missile(3, 0, 3, 1, "UP", missboard);
        int[][] newBoard = missile.moveMissileUp();
        final int[][] expected = {{0,0},{0,1}}; 
        assertArrayEquals(expected, newBoard);
        Element[][] missiboard = {{empty,empty, empty}, {empty, empty, empty}, {empty, empty, empty}, {empty, empty,empty}};
        Missile missil = new Missile(0, 0, 0, 1, "UP", missiboard);
        int[][] newboard = missil.moveMissileUp();
        final int[][] expecteds = {{0,0},{0,1}}; 
        assertArrayEquals(expecteds, newboard);
    }

    @Test
    public void testMoveMissileLeft() {
        Element[][] missboard = {{empty,empty, empty}, {empty, empty, empty}, {empty, empty, empty}, {empty, empty,empty}};
        Missile missile = new Missile(0, 3, 1, 3, "LEFT", missboard);
        int[][] newBoard = missile.moveMissileLeft();
        final int[][] expected = {{0,0},{1,0}}; 
        assertArrayEquals(expected, newBoard);
        Element[][] missiboard = {{empty,empty, empty}, {empty, empty, empty}, {empty, empty, empty}, {empty, empty,empty}};
        Missile missil = new Missile(0, 0, 1, 0, "LEFT", missiboard);
        int[][] newboard = missil.moveMissileLeft();
        final int[][] expecteds = {{0,0},{1,0}}; 
        assertArrayEquals(expecteds, newboard);
    }

}

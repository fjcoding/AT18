package jalau.at18.battlecity;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MissileTest {
    Missiles missiles = new Missiles();
    Empty empty = new Empty();
/* 
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

    @Test
    public void testMoveMissileDown() {
        Element[][] missboard = {{empty,empty, empty, empty}, {empty, empty, empty, empty}, {empty, empty, empty,empty}, {empty, empty,empty,empty}};
        Missile missile = new Missile(0, 0, 0, 1, "DOWN", missboard);
        int[][] newBoard = missile.moveMissileDown(4);
        final int[][] expected = {{3,0},{3,1}}; 
        assertArrayEquals(expected, newBoard);
        Element[][] missiboard = {{empty,empty, empty, empty}, {empty, empty, empty, empty}, {empty, empty, empty, empty}, {empty, empty,empty, empty}};
        Missile missil = new Missile(3, 0, 3, 1, "DOWN", missiboard);
        int[][] newboard = missil.moveMissileDown(4);
        final int[][] expecteds = {{3,0},{3,1}}; 
        assertArrayEquals(expecteds, newboard);
    }

    @Test
    public void testMoveMissileRight() {
        Element[][] missboard = {{empty,empty, empty, empty}, {empty, empty, empty, empty}, {empty, empty, empty,empty}, {empty, empty,empty,empty}};
        Missile missile = new Missile();
        int[][] newBoard = missile.moveMissileRight(4);
        final int[][] expected = {{0,3},{1,3}}; 
        assertArrayEquals(expected, newBoard);
        Element[][] missiboard = {{empty,empty, empty, empty}, {empty, empty, empty, empty}, {empty, empty, empty, empty}, {empty, empty,empty, empty}};
        Missile missil = new Missile();
        int[][] newboard = missil.moveMissileRight(4);
        final int[][] expecteds = {{0,3},{1,3}}; 
        assertArrayEquals(expecteds, newboard);
    }*/
    @Test
    public void testSetPosition() {
        Missile missile = new Missile();
        missile.setDirection("UP");
        missile.setPosition(3, 0, 3, 1);
        int[][] newPos = missile.getPosition();
        int[][] expected = {{2,0}, {2, 1}};
        assertArrayEquals(expected, newPos);
        Missile missile1 = new Missile();
        missile1.setDirection("DOWN");
        missile1.setPosition(1, 0, 1, 1);
        int[][] newPos1 = missile1.getPosition();
        int[][] expected1 = {{2,0}, {2, 1}};
        assertArrayEquals(expected1, newPos1);
        Missile missile2 = new Missile();
        missile2.setDirection("LEFT");
        missile2.setPosition(0, 3, 1, 3);
        int[][] newPos2 = missile2.getPosition();
        int[][] expected2 = {{0,2}, {1, 2}};
        assertArrayEquals(expected2, newPos2);
        Missile missile3 = new Missile();
        missile3.setDirection("RIGHT");
        missile3.setPosition(0, 0, 1, 0);
        int[][] newPos3 = missile3.getPosition();
        int[][] expected3 = {{0,1}, {1, 1}};
        assertArrayEquals(expected3, newPos3);
    }



}

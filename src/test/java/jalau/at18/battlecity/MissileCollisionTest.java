package jalau.at18.battlecity;

import org.junit.Rule;
import org.junit.Test;

import java.io.EOFException;

import static org.junit.Assert.*;

public class MissileCollisionTest {
    @Test
    public void elementAllowPassBullet() {
        Brick brick1 = new Brick();
        Brick brick2 = new Brick();
        Water water1 = new Water();
        Water water2 = new Water();
        Missiles missilees1 = new Missiles();
        Missiles missilees2 = new Missiles();
        MissileCollision missileCollision = new MissileCollision();
        int missile1Row = 0;
        int missile1Column = 0;
        int missile2Row = 0;
        int missile2Column = 1;
        boolean allowPassBullet;
        Element[][] matrix = {{brick1, brick2}};
        allowPassBullet = missileCollision.isElementHit(matrix, missile1Row, missile1Column, missile2Row, missile2Column);
        assertTrue(allowPassBullet);
        Element[][] matrix1 = {{water1, water2}};
        allowPassBullet = missileCollision.isElementHit(matrix1, missile1Row, missile1Column, missile2Row, missile2Column);
        assertFalse(allowPassBullet);
        Element[][] matrix2 = {{missilees1, missilees2}};
        allowPassBullet = missileCollision.isElementHit(matrix2, missile1Row, missile1Column, missile2Row, missile2Column);
        assertTrue(allowPassBullet);
    }

    @Test
    public void missileHitBrick() {
        Brick brick1 = new Brick();
        Brick brick2 = new Brick();
        MissileCollision missileCollision = new MissileCollision();
        brick1.reduceLive(1);
        brick2.reduceLive(1);
        Element[][] matrix = {{brick1, brick2}};
        int missile1Row = 0;
        int missile1Column = 0;
        int missile2Row = 0;
        int missile2Column = 1;
        boolean isHitBrick = missileCollision.isElementHit(matrix, missile1Row, missile1Column, missile2Row, missile2Column);
        assertTrue(isHitBrick);
        assertEquals(0, brick1.getLive());
        assertEquals(ElementType.EMPTY, matrix[missile1Row][missile1Column].getType());
        assertEquals(ElementType.EMPTY, matrix[missile2Row][missile2Column].getType());
    }

    @Test
    public void missileHitTankPlayer() {

        TankTop tankTop1 = new TankTop();
        TankTop tankTop2 = new TankTop();
        MissileCollision missileCollision = new MissileCollision();
        Element[][] matrix = {{tankTop1, tankTop2}};
        int missile1Row = 0;
        int missile1Column = 0;
        int missile2Row = 0;
        int missile2Column = 1;
        boolean isHitTankPlayer = missileCollision.isElementHit(matrix, missile1Row, missile1Column, missile2Row, missile2Column);
        assertTrue(isHitTankPlayer);
        assertEquals(0, tankTop1.getLive());
        assertEquals(0, tankTop2.getLive());
        assertEquals(ElementType.EMPTY, matrix[missile1Row][missile1Column].getType());
        assertEquals(ElementType.EMPTY, matrix[missile2Row][missile2Column].getType());
    }

    /*
    @Test(expected = RuntimeException.class)
        public void missileHitTankPlayer() {
            TankTop tankTop1 = new TankTop();
            TankTop tankTop2 = new TankTop();
            MissileCollision missileCollision = new MissileCollision();
            Element[][] matrix = {{tankTop1, tankTop2}};
            int missile1Row = 0;
            int missile1Column = 0;
            int missile2Row = 0;
            int missile2Column = 1;
            boolean isHitTankPlayer = missileCollision.isElementHit(matrix, missile1Row, missile1Column, missile2Row, missile2Column);
            assertTrue(isHitTankPlayer);
            assertEquals(0, tankTop1.getLive());
            assertEquals(0, tankTop2.getLive());
            assertEquals(ElementType.EMPTY, matrix[missile1Row][missile1Column].getType());
            assertEquals(ElementType.EMPTY, matrix[missile2Row][missile2Column].getType());
        }
    */

}

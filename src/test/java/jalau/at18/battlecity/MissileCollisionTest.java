package jalau.at18.battlecity;

import jalau.at18.battlecity.elements.*;
import org.junit.Rule;
import org.junit.Test;
//import org.junit.contrib.java.lang.system.ExpectedSystemExit;
import jalau.at18.battlecity.elements.Element;
import jalau.at18.battlecity.elements.ElementType;

import static org.junit.Assert.*;

public class MissileCollisionTest {
    /*@Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

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
        exit.expectSystemExit();
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

    @Test
    public void missileHitEagle() {
        exit.expectSystemExit();
        Eagle eagle1 = new Eagle();
        Eagle eagle2 = new Eagle();
        Eagle eagle3 = new Eagle();
        Eagle eagle4 = new Eagle();
        MissileCollision missileCollision = new MissileCollision();
        Element[][] matrix = {{eagle1, eagle2}, {eagle3, eagle4}};
        int missile1Row = 0;
        int missile1Column = 0;
        int missile2Row = 0;
        int missile2Column = 1;
        boolean isHitEagle = missileCollision.isElementHit(matrix, missile1Row, missile1Column, missile2Row, missile2Column);
        assertTrue(isHitEagle);
    }
*/

}

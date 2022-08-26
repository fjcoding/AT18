package jalau.at18.spaceinvaders;

import org.junit.Test;
import static org.junit.Assert.*;

public class ShieldTest {
    @Test
    public void existBlock() {
        Shield shield = new Shield();
        assertEquals(true, shield.existBlockInPosition(8, 1));
    }

    @Test
    public void notExistBlock() {
        Shield shield = new Shield();
        assertEquals(false, shield.existBlockInPosition(9, 1));
    }

    @Test
    public void getCharacterHasBlockFullDurability() {
        Shield shield = new Shield();
        assertEquals('#', shield.getCharacterOfBlock(8, 1));
    }

    @Test
    public void getCharacterHasBlock3Durability() {
        Shield shield = new Shield();
        assertEquals('#', shield.getCharacterOfBlock(8, 1));
        assertEquals('=', shield.impactBlock(8, 1));
    }

    @Test
    public void getCharacterHasBlock2Durability() {
        Shield shield = new Shield();
        assertEquals('=', shield.impactBlock(8, 1));
        assertEquals((char) 126, shield.impactBlock(8, 1));
        assertEquals((char) 126, shield.getCharacterOfBlock(8, 1));
    }

    @Test
    public void impactBlockOnce() {
        Shield shield = new Shield();
        assertEquals('=', shield.impactBlock(8, 1));
    }

    @Test
    public void impactBlockTwice() {
        Shield shield = new Shield();
        assertEquals('=', shield.impactBlock(8, 1));
        assertEquals((char) 126, shield.impactBlock(8, 1));
    }

    /*@Test
    public void impactBlock4Times() {
        Shield shield = new Shield();
        assertEquals('=', shield.impactBlock(8, 1));
        assertEquals((char) 126, shield.impactBlock(8, 1));
        assertEquals('-', shield.impactBlock(8, 1));
        assertEquals('*', shield.impactBlock(8, 1));
        assertEquals(false, shield.existBlockInPosition(8, 1));
    }*/
}
package jalau.at18.spaceinvaders;
import org.junit.Test;
import static org.junit.Assert.*;

public class ShieldTest {
    @Test
    public void existBlock() {
        Shield shield = new Shield();
        assertEquals(true, shield.existBlockInPosition(8,1));
    }
    @Test
    public void notExistBlock() {
        Shield shield = new Shield();
        assertEquals(false, shield.existBlockInPosition(9,1));
    }
    @Test
    public void getCharacterWithoutBlock() {
        Shield shield = new Shield();
        assertEquals('*', shield.getCharacter(9,1));
    }
    @Test
    public void getCharacterHasBlockFullDurability() {
        Shield shield = new Shield();
        assertEquals('#', shield.getCharacter(8,1));
    }
    
    @Test
    public void getCharacterHasBlock3Durability() {
        Shield shield = new Shield();
        assertEquals(true, shield.impactBlock(8, 1));
        assertEquals('=', shield.getCharacter(8,1));
    }

    @Test
    public void getCharacterHasBlock2Durability() {
        Shield shield = new Shield();
        assertEquals(true, shield.impactBlock(8, 1));
        assertEquals(true, shield.impactBlock(8, 1));
        assertEquals((char)126, shield.getCharacter(8,1));
    }
}
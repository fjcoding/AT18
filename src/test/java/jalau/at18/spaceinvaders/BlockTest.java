package jalau.at18.spaceinvaders;

import org.junit.Test;
import static org.junit.Assert.*;

public class BlockTest {
    @Test
    public void has4durability() {
        Block block = new Block();
        assertEquals('#', block.getCharacter());
    }

    @Test
    public void has3durability() {
        Block block = new Block();
        block.impact();
        assertEquals('=', block.getCharacter());
    }

    @Test
    public void has2durability() {
        Block block = new Block();
        block.impact();
        block.impact();
        assertEquals((char) 126, block.getCharacter());
    }

    @Test
    public void has1durability() {
        Block block = new Block();
        block.impact();
        block.impact();
        block.impact();
        assertEquals('-', block.getCharacter());
    }

    @Test
    public void has0durability() {
        Block block = new Block();
        block.impact();
        block.impact();
        block.impact();
        block.impact();
        assertEquals('*', block.getCharacter());
    }
}

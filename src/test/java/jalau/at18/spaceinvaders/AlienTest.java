package jalau.at18.spaceinvaders;
import static org.junit.Assert.*;
import org.junit.Test;

public class AlienTest {
    
    @Test
    public void shouldSendArrayPosX() {
        Aliens alien = new Aliens();
        final int[] input = {4, 5, 6, 7};
        final int[] output = {4, 5, 6, 7};
        alien.setPosX(input);
        assertArrayEquals(output, alien.getPosX());
    }

    @Test
    public void shouldSendArrayPosY() {
        Aliens alien = new Aliens();
        final int[] input = {0, 1};
        final int[] output = {0, 1};
        alien.setPosY(input);
        assertArrayEquals(output, alien.getPosY());
    }
}

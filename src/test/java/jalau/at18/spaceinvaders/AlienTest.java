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

    @Test
    public void shouldAlienMoveRight(){
        Aliens aliens = new Aliens();
        final int[] expecteds = {1, 2, 3, 4};
        aliens.alienRigth();
        assertArrayEquals(expecteds, aliens.getPosX());
    }

    /*@Test
    public void shouldAlienMoveLeft(){
        Aliens aliens = new Aliens();
        final int[] expecteds = {-1, 0, 1, 2};
        aliens.alienLeft();
        assertArrayEquals(expecteds, aliens.getPosX());
    }*/

}

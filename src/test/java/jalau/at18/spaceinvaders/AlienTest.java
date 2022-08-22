package jalau.at18.spaceinvaders;
import static org.junit.Assert.*;
import org.junit.Test;

public class AlienTest {
    
    @Test
    public void shouldSendArrayPosX() {
        Alien alien = new Alien();
        final int[] input = {4, 5, 6, 7};
        final int[] output = {4, 5, 6, 7};
        alien.setPosX(input);
        assertArrayEquals(output, alien.getPosX());
    }

    @Test
    public void shouldSendArrayPosY() {
        Alien alien = new Alien();
        final int[] input = {0, 1};
        final int[] output = {0, 1};
        alien.setPosY(input);
        assertArrayEquals(output, alien.getPosY());
    }

    @Test
    public void shouldAlienMoveRight(){
        Alien alien = new Alien();
        final int[] expecteds = {1, 2, 3, 4};
        alien.alienRigth();
        assertArrayEquals(expecteds, alien.getPosX());
    }

    @Test
    public void shouldAlienMoveLeft(){
        Alien alien = new Alien();
        final int[] expecteds = {5, 6, 7, 8};
        final int[] input = {6, 7, 8, 9};
        alien.setPosX(input);
        alien.alienLeft();
        assertArrayEquals(expecteds, alien.getPosX());
    }

    @Test
    public void shouldAlienMoveDown(){
        Alien alien = new Alien();
        final int[] expecteds = {1, 2};
        alien.alienDown();
        assertArrayEquals(expecteds, alien.getPosY());
    }

    @Test
    public void doubleMovement() {
        Alien alien = new Alien();
        final int[] expecteds = {0,1,2,3};
        alien.alienRigth();
        alien.alienLeft();
        System.out.println(alien.toString());
        assertArrayEquals(expecteds, alien.getPosX());
    }

}

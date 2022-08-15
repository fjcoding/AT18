package jalau.at18.katas.likes.mauricio;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {
    @Test
    public void amountOfLikesPerPost() {
        String[] input = {"Carla", "Jaime"};
        Main main = new Main();
        assertEquals("Carla and Jaime like this", main.getLikesFromPost(input));
    }
}

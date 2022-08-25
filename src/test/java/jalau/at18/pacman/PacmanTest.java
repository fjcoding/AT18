package jalau.at18.pacman;

import org.junit.Test;
import static org.junit.Assert.*;

public class PacmanTest {
    public static final String PACMAN_REPRESENTATION = "C";
    Pacman pacman = new Pacman();

    @Test
    public void getRepresentationTest() {
        assertEquals(PACMAN_REPRESENTATION, pacman.getRepresentation());
    }
    
}

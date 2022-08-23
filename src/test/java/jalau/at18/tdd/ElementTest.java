package jalau.at18.tdd;

import org.junit.Test;
import static org.junit.Assert.*;

public class ElementTest {

    @Test
    public void anElementShouldReturnACharacterToRepresentItself() {
        Element element = new Element();
        char expectedRep = 'R';
        assertEquals(expectedRep, element.getRepresentation());
    }
}

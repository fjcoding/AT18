package jalau.at18.katas.likes.sarai;

import static org.junit.Assert.*;
public class MainTest {
    public void shouldReturnLikeThis() {
        String input = "juan lulu jose";
        String expected = "juan,lulu,jose, like this";
        assertEquals(expected, input);
        assertEquals("pepe,mario, like this", "pepe mario" );
    }
}
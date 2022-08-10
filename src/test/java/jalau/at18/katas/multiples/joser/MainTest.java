package jalau.at18.katas.multiples.joser;
import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {
    public static final int PRIMERO = 10;
    public static final int RESULTADO = 23;
    @Test
    public void testMultiples() {
        Main main = new Main();
        assertEquals(RESULTADO, main.multiples(PRIMERO));
    }
}
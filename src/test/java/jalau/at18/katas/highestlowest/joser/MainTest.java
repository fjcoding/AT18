package jalau.at18.katas.highestlowest.joser;
import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {
    @Test
    public void testHihglow() {
        Main main = new Main();
        assertEquals("8 1", main.hihglow("1 2 3 5 4 8"));
        assertEquals("8 -8", main.hihglow("-8 1 5 5 4 8"));
        assertEquals("8 0", main.hihglow("1 5 5 4 8 0"));
    }
}

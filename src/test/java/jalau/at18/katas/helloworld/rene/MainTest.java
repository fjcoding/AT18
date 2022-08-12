package jalau.at18.katas.helloworld.rene;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {

    @Test
    public void mainShouldSayHello() {
        Main main = new Main();
        assertEquals("Hello, World!", main.sayHello());
    }
}

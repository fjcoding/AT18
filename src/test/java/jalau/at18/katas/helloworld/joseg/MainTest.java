package jalau.at18.katas.helloworld.joseg;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {

    @Test
    public void mainShouldSayHello() {
        Main main = new Main();
        assertEquals("Hello wooooooorld!!!", main.sayHello());
    }
}

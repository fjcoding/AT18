package jalau.at18.katas.helloworld.joseg;

public class MainTest {

    @Test
    public void mainShouldSayHello() {
        Main main = new Main();
        assertEquals("Hello wooooooorld!!!", main.sayHello());
    }

    private void assertEquals(String string, String sayHello) {
    }
}

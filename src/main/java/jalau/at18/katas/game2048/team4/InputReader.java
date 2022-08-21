package jalau.at18.katas.game2048.team4;

import java.util.Scanner;

public class InputReader {

    private Scanner keyboard;

    public InputReader() {
        this.keyboard = new Scanner(System.in);
    }

    public String read() {
        return keyboard.nextLine();
    }

    public void close() {
        keyboard.close();
    }
}

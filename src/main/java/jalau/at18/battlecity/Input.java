package jalau.at18.battlecity;

import java.util.Scanner;

public class Input {
    private Scanner scan;

    public Input() {
        this.scan = new Scanner(System.in);
    }

    public String read() {
        return scan.nextLine();
    }

    public void finish() {
        scan.close();
    }
}

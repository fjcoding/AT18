package jalau.at18.spaceinvaders;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Game game = new Game();
        while (true) {
            char instruction = scanner.next().charAt(0);
            game.runGame(instruction);


        }
    }
}




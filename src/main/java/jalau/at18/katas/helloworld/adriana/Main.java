package jalau.at18.katas.helloworld.adriana;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Input message: ");
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        System.out.println("Message: " + message);
    }
}

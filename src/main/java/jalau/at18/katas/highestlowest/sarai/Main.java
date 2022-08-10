package jalau.at18.katas.highestlowest.sarai;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("how many numbers do you want to enter?");
        System.out.println(enterNumbers());
    }
    public static String enterNumbers() {
        Scanner scankeyboard = new Scanner(System.in);
        int quantity = scankeyboard.nextInt();
        int[] save = new int[quantity];
        System.out.println("enter numbers");
        for (int index = 0; index < quantity; index++) {
            int num = scankeyboard.nextInt();
            save[index] = num;
        }
        String message = highestLowestNumber(save);
        return message;
    }
    public static String highestLowestNumber(int[] save) {
        int highestNumber  = save[0];
        int lowestNumber = save[0];
        for (int index = 0; index < save.length; index++) {
            if (save[index] > highestNumber) {
                highestNumber  = save[index];
            }
            if (save[index] < lowestNumber) {
                lowestNumber = save[index];
            }
        }
        return "numbers " + " " + lowestNumber;
    }
}
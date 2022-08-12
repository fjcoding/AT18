package jalau.at18.katas.phonenumber.sarai;
import java.util.Scanner;

public class Main {
    static final int THREE_POSITION = 3;
    static final int SIX_POSITION = 6;
    static final int CONTT = 10;
    public static void main(String[] args) {
        System.out.println("Enter 10 numbers");
        Scanner scankeyboard = new Scanner(System.in);
        int number;
        int[] save = new int[CONTT];
        for (int index = 0; index < CONTT; index++) {
            number = scankeyboard.nextInt();
            save[index] = number;
        }
        System.out.println(phoneNumbers(save));
    }
    public static String phoneNumbers(int[] save) {
        int zero_position = 0;
        String message = "";
        for (int index = 0; index < CONTT; index++) {
            if (index == zero_position) {
                message = message + "(";
            }
            if (index == THREE_POSITION) {
                message = message + ") ";
            }
            if (index == SIX_POSITION) {
                message = message + "-";
            }
            message = message + save[index];
        }
        return message;
    }
}
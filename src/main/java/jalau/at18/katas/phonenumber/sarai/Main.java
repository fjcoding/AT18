package jalau.at18.katas.phonenumber.sarai;
import java.util.Scanner;

public class Main {
    static final int ZERO_POSITION = 0;
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
        for (int index = 0; index < CONTT; index++) {
            if (index == ZERO_POSITION) {
                System.out.print("(");
            }
            if (index == THREE_POSITION) {
                System.out.print(")");
            }
            if (index == SIX_POSITION) {
                System.out.print("-");
            }
            System.out.print(save[index]);
        }
    }
}
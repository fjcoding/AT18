package jalau.at18.katas.phonenumber.fernanda;

import java.util.*;

public class Main {
    private static final int PHONENUM_LENGTH = 10;
    private static final int NEXTTHREE = 6;
    private static final int FIRSTDIGITS = 3;
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 10 digits separated by commas");
        String tenDigit = scan.nextLine();

        String[] phoneNum = tenDigit.split(",");
        if (phoneNum.length == PHONENUM_LENGTH) {
            System.out.print("(" + phoneNum[0] + phoneNum[1] + phoneNum[2] + ") ");
            for (int place = FIRSTDIGITS; place < NEXTTHREE; place++) {
                System.out.print(phoneNum[place]);
            }
            System.out.print("-");
            for (int place = NEXTTHREE; place < PHONENUM_LENGTH; place++) {
                System.out.print(phoneNum[place]);
            }
        } else {
            System.out.println("You must enter 10 digit numbers");
        }

        scan.close();

    }
}



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
        Main main = new Main();
        System.out.print(main.numToPhoneFormat(tenDigit));
        scan.close();
    }
    public String numToPhoneFormat(String digitToFormat) {
        String[] phoneNum = digitToFormat.split(",");
        if (phoneNum.length == PHONENUM_LENGTH) {
            String threeDig = ("(" + phoneNum[0] + phoneNum[1] + phoneNum[2] + ") ");
            String nextDig = "";
            String lastDig = "";
            for (int place = FIRSTDIGITS; place < NEXTTHREE; place++) {
                nextDig = nextDig + (phoneNum[place]);
            }
            for (int place = NEXTTHREE; place < PHONENUM_LENGTH; place++) {
                lastDig = lastDig + (phoneNum[place]);
            }
            return (threeDig + nextDig + "-" + lastDig);
        } else {
            return ("You must enter 10 digit numbers");
        }
    }
}



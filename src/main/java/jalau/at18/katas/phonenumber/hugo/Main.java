package jalau.at18.katas.phonenumber.hugo;

import java.util.Scanner;

public class Main {
    static final Integer NUM_3 = 3;
    static final Integer NUM_4 = 4;
    static final Integer NUM_5 = 5;
    static final Integer NUM_6 = 6;
    static final Integer NUM_7 = 7;
    static final Integer NUM_8 = 8;
    static final Integer NUM_9 = 9;
    static final Integer NUM_10 = 10;
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        System.out.println("Enter a phonenumber with 10 digits");
        Scanner numin = new Scanner(System.in);
        String numcatch = numin.nextLine();
        int[] digit = new int[numcatch.length()];
        for (int index = 0; index < NUM_10; index++) {
            digit[index] = 0;
        }
        for (int index = 0; index < numcatch.length(); index++) {
            digit[index] = Character.getNumericValue(numcatch.charAt(index));
        }
        // System.out.println(Arrays.toString(digit));
        System.out.println("Phonenumber is: (" + digit[0] + digit[1] + digit[2] + ") " + digit[NUM_3] + digit[NUM_4] + digit[NUM_5]
                + "-" + digit[NUM_6]
                + digit[NUM_7] + digit[NUM_8] + digit[NUM_9]);
    }
}

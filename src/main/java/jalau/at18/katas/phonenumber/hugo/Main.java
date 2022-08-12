package jalau.at18.katas.phonenumber.hugo;

import java.util.Scanner;

public class Main {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        System.out.println("Enter a phonenumber with 10 digits");
        Scanner numin = new Scanner(System.in);
        String numcatch = numin.nextLine();
        int[] digit = new int[numcatch.length()];
        for (int index = 0; index < 10; index++) {
            digit[index] = 0;
        }
        for (int index = 0; index < numcatch.length(); index++) {
            digit[index] = Character.getNumericValue(numcatch.charAt(index));
        }
        // System.out.println(Arrays.toString(digit));
        System.out.println("Phonenumber is: (" + digit[0] + digit[1] + digit[2] + ") " + digit[3] + digit[4] + digit[5]
                + "-" + digit[6]
                + digit[7] + digit[8] + digit[9]);
    }
}

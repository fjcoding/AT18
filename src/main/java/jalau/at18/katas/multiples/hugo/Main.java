package jalau.at18.katas.multiples.hugo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter an integer number to find the sum of 3 and 5 multiples");
        int numint = num.nextInt();

        int three = 0;
        int five = 0;
        if (numint >= 0) {
            for (int index = 0; index < numint; index++) {
                if (index % 3 == 0 && index != 0) {
                    three = three + index;
                } else {
                    if (index % 5 == 0 && index != 0) {

                        five = five + index;
                    }
                }
            }
            System.out.print("the sum of 3 and 5 multiples below this number is: ");
            System.out.println(three + five);
        }
    }
}

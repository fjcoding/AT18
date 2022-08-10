package multiples;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner num = new Scanner(System.in);
        System.out.println("Enter an integer number to find the sum of 3 and 5 multiples");
        int numint = num.nextInt();

        int three = 0;
        int five = 0;
        if (numint >= 0) {
            for (int i = 0; i < numint; i++) {
                if (i % 3 == 0 && i != 0) {
                
                    three = three + i;

                } else {
                    if (i % 5 == 0 && i != 0) {
                        
                        five = five + i;
                    }
                }
            }
            System.out.print("the sum of 3 and 5 multiples below this number is: ");
            System.out.println(three + five);
        }
    }
}

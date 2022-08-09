package jalau.at18.katas.multiples.adriana;

import java.util.Scanner;

public class Main {
    static final Integer DIVISORS_OF_1 = 3;
    static final Integer DIVISORS_OF_2 = 5;
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        Integer number = scan.nextInt();
        System.out.println(" ");
        System.out.println("Number: " + number);
        Integer sumMultiples = getSumMult(number);
        System.out.println("Sum: " + sumMultiples);
    }
    private static Integer getSumMult(Integer number) {
        Integer sum = 0;
        if (number >= 0) {
            for (int count = 1; count < number; count++) {
                if ((count % DIVISORS_OF_1 == 0) || (count % DIVISORS_OF_2 == 0)) {
                    sum = sum + count;
                }
            }
        }
        return sum;
    }
}
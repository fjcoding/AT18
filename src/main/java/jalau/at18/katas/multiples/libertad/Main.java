package jalau.at18.katas.multiples.libertad;
import java.util.Scanner;

public class Main {
    private static final int THREE_FOR_MULTIPLES = 3;
    private static final int FIVE_FOR_MULTIPLES = 5;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        Main main = new Main();
        System.out.println(main.sumOfNumbers(number));
        scan.close();
    }

    public int sumOfNumbers(int number) {
        int zero = 0;
        int result = zero;
        if (number > zero) {
            while (number > zero) {
                number--;
                if (number % THREE_FOR_MULTIPLES == zero || number % FIVE_FOR_MULTIPLES == zero) {
                    result += number;
                }
            }
        }
        return result;
    }
}
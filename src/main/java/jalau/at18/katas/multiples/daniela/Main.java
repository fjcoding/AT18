package jalau.at18.katas.multiples.daniela;
import java.util.Scanner;
public class Main {
    static final Integer DIVIDE_1 = 3;
    static final Integer DIVIDE_2 = 5;
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        Integer number = scan.nextInt();
        Integer sumMultiples = getSumMult(number);
        System.out.println("Sum: " + sumMultiples);
    }
    public static Integer getSumMult(Integer number) {
        Integer sum = 0;
        if (number >= 0) {
            for (int find = 1; find < number; find++) {
                if (find % DIVIDE_1 == 0 || find % DIVIDE_2 == 0) {
                    sum = sum + find;
                }
            }
        }
        return sum;
    }
}
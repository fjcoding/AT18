package jalau.at18.katas.multiples.sarai;
import java.util.Scanner;
public class Main {
    static final int THREE_MODULE = 3;
    static final int FIVE_MODULE = 5;
    public static void main(String[] args) {
        System.out.println("Enter a number ");
        System.out.println(ingresar());
    }
    public static String ingresar() {
        Scanner scankeyboard = new Scanner(System.in);
        int num = scankeyboard.nextInt();
        String result = enterNumbers(num);
        return result;
    }
    public static String enterNumbers(int num) {
        int adition = 0;
        if (num > 0) {
            for (int index = 0; index < num; index++) {
                if (index % THREE_MODULE == 0 || index % FIVE_MODULE == 0) {
                    System.out.println(index);
                    adition += index;
                }
            }
            return "the sum of the numbers is: " + adition;
        } else {
            return "the sum of the numbers is: 0 ";
        }
    }
}

package jalau.at18.katas.multiples.sarai;
import java.util.Scanner;
public class Main {
    static final int MODULOS_TRES = 3;
    static final int MODULO_CINCO = 5;
    public static void main(String[] args) {
        int num;
        int suma = 0;
        Scanner numero_scanner = new Scanner(System.in);
        System.out.println("Enter a number ");
        num = numero_scanner.nextInt();
        if (num > 0) {
            for (int index = 0; index < num; index++) {
                if (index % MODULOS_TRES == 0 || index % MODULO_CINCO == 0) {
                    System.out.println(index);
                    suma += index;
                }
            }
            System.out.println("the sum of the numbers is: " + suma);
        } else {
            System.out.println("the sum of the numbers is: 0 ");
        }
    }
}

package jalau.at18.katas.phonenumber.sarai;
import java.util.Scanner;

public class Main {
    static final int POSICION_CERO = 0;
    static final int POSICION_TRES = 3;
    static final int POSICION_SEIS = 6;
    static final int CONTT = 10;
    public static void main(String[] args) {
        Scanner numero_scanner = new Scanner(System.in);
        int num;
        System.out.println("Enter 10 numbers");
        int[] almac = new int[CONTT];
        for (int index = 0; index < CONTT; index++) {
            num = numero_scanner.nextInt();
            almac[index] = num;
        }
        for (int index = 0; index < CONTT; index++) {
            if (index == POSICION_CERO) {
                System.out.print("(");
            }
            if (index == POSICION_TRES) {
                System.out.print(")");
            }
            if (index == POSICION_SEIS) {
                System.out.print("-");
            }
            System.out.print(almac[index]);
        }
    }
}
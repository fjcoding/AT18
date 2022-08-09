package jalau.at18.katas.highestlowest.sarai;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cant;
        Scanner scanner_teclado = new Scanner(System.in);
        System.out.println("how many numbers do you want to enter?");
        cant = scanner_teclado.nextInt();
        int[] alma = new int[cant];
        System.out.println("enter numbers");
        for (int index = 0; index < cant; index++) {
            int num = scanner_teclado.nextInt();
            alma[index] = num;
        }
        int numMayor = alma[0];
        int numMenor = alma[0];
        for (int index = 0; index < alma.length; index++) {
            if (alma[index] > numMayor) {
                numMayor = alma[index];
            }
            if (alma[index] < numMenor) {
                numMenor = alma[index];
            }
        }
        System.out.println("numbers " + numMayor + " " + numMenor);
    }
}

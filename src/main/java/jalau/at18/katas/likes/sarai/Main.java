package jalau.at18.katas.likes.sarai;
import java.util.Scanner;
public class Main {
    static final int MAS_DE_CUATRO_NOMBRES = 4;
    static final int TRES_PERSONAS = 3;
    public static void main(String[] args) {
        String nombres;
        Scanner palabra_scanner = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int tam = palabra_scanner.nextInt();
        if (tam >= 1) {
            String[] personas = new String[tam];
            System.out.println("Enter names");
            for (int index = 0; index < tam; index++) {
                nombres = palabra_scanner.next();
                personas[index] = nombres;
                if (tam == 1) {
                    System.out.println(personas[index] + " likes this");
                }
            }
            if (tam > 1 && tam < MAS_DE_CUATRO_NOMBRES) {
                for (int index = 0; index < personas.length; index++) {
                    System.out.print(personas[index] + ",");
                }
                System.out.print(" like this");
            }
            if (tam >= MAS_DE_CUATRO_NOMBRES) {
                for (int index = 0; index < 2; index++) {
                    System.out.print(personas[index] + ",");
                }
                System.out.print(personas[2]);
                int ress = tam - TRES_PERSONAS;
                System.out.print(" and " + ress + " others like this");
            }
        } else {
            if (tam == 0 || tam < 1) {
                System.out.println("no one likes this");
            }
        }
    }
}
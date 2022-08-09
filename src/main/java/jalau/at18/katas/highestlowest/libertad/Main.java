package jalau.at18.katas.highestlowest.libertad;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introdusca los numeros:");
        String datos = scan.nextLine();
        String[] numeros = datos.split(" ");
        int iterator = 0;
        int mayor = Integer.parseInt(numeros[iterator]);
        int menor = Integer.parseInt(numeros[iterator]);
        while (iterator < numeros.length) {
            int numero = Integer.parseInt(numeros[iterator]);
            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
            iterator++;
        }
        System.out.println(mayor + " " + menor);
        scan.close();
    }
}

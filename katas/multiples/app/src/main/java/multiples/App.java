/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package multiples;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        // System.out.println(new App().getGreeting());
        Scanner numero = new Scanner(System.in);
        System.out.println("Ingresar un numero entero para hallar los multiplos de 3 y 5");
        int numint = numero.nextInt();

        int tres = 0;
        int cinco = 0;
        if (numint >= 0) {
            for (int i = 0; i < numint; i++) {
                if (i % 3 == 0 && i != 0) {
                    //System.out.println(i + " multiplo de 3");
                    tres = tres + i;
                } else {
                    if (i % 5 == 0 && i != 0) {
                        //System.out.println(i + " multiplo de 5");
                        cinco = cinco + i;
                    }
                }
            }
            System.out.print("La suma de los multiplos de 3 y 5 menores al numero introducido es : ");
            System.out.println(tres + cinco);
        }
    }
}
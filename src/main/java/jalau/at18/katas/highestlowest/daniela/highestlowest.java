package jalau.at18.katas.highestlowest.daniela;

import java.util.Arrays;

public class highestlowest {
    public static void main(String[] args) {
        String numeros = "1 2 3 4 8 6";
        String[] separar = numeros.split(" ");
        int[] entero = new int[separar.length];
        for (int encontrar = 0; encontrar < separar.length; encontrar++) {
            entero[encontrar] = Integer.parseInt(separar[encontrar]);
        }
        Arrays.sort(entero);
        int[] lista = entero;
        int maximo = lista[0];
        int minimo = lista[0];
        for (int encontrar = 0; encontrar < separar.length; encontrar++) {
            if (maximo < lista[encontrar]) {
                maximo = lista[encontrar];
            }
            if (minimo > lista[encontrar]) {
                minimo = lista[encontrar];
            }
        }
        System.out.println("out:" + maximo + " " + minimo);
    }
}
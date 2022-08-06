package jalau.at18.katas.highestlowest.daniela;

import java.util.Arrays;

public class highestlowest {
    public static void main(String[] args) {
        String numeros = "1 2 3 4 8 6";
        String[] separar = numeros.split(" ");
        int[] entero = new int[separar.length];
        for (int i = 0; i < separar.length; i++) {
            entero[i] = Integer.parseInt(separar[i]);

        }
        Arrays.sort(entero);

        int[] lista = entero;
        int maximo = lista[0];
        int minimo = lista[0];
        for (int i = 0; i < separar.length; i++) {
            if (maximo < lista[i])
                maximo = lista[i];
            if (minimo > lista[i])
                minimo = lista[i];

        }
        // String colocarcomas = numeros.replaceAll("\\s", ",");
        System.out.println("out:" + maximo + " " + minimo);
        // System.out.println(minimo);
        // int [] num = new int [colocarcomas.length()];

    }
}

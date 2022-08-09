package jalau.at18.katas.highestlowest.libertad;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int menor,mayor;
        mayor=-1000;
        menor=1000;
        System.out.println("Introdusca los numeros:");
        String datos= scan.nextLine();
        String[] numeros = datos.split(" ");
        int i=0;
        while(i<numeros.length){
            int numero= Integer.parseInt(numeros[i]);
            if(numero>mayor){
                mayor=numero;
            }
            if(numero<menor){
                menor=numero;
            }
            i++;
        }
        System.out.println(mayor+" "+menor);
        scan.close();
    }
}

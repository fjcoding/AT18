package jalau.at18.katas.multiples.daniela;

public class multiples {
    static void myMultiplo(int number) {
        final int valor = 0;
        final int multiplo3 = 3;
        final int multiplo5 = 5;
        if (number < valor) {
            System.out.println("The number is not valid");
        }
        int sumatotal = valor;
        for (int encontrar = valor; encontrar < number; encontrar++) {
            if (encontrar % multiplo3 == valor || encontrar % multiplo5 == valor) {
                sumatotal += encontrar;
            }
        }

        System.out.println("La suma total es:" + sumatotal);
    }

    public static void main(String[] args) {
        final int encontrar = 100;
        myMultiplo(encontrar);
    }

}

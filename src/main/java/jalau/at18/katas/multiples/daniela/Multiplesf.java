package jalau.at18.katas.multiples.daniela;

public class Multiplesf {
    static void myMultiplo(int number) {
        final int value = 0;
        final int multiple3 = 3;
        final int multiple5 = 5;
        if (number < value) {
            System.out.println("The number is not valid");
        }
        int total = value;
        for (int find = value; find < number; find++) {
            if (find % multiple3 == value || find % multiple5 == value) {
                total += find;
            }
        }

        System.out.println("La suma total es:" + total);
    }

    public static void main(String[] args) {
        final int encontrar = 100;
        myMultiplo(encontrar);
    }
}

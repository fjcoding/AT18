package jalau.at18.katas.multiples.daniela;

public class multiples {
    static void MultiplesFuntion(int number) {
        if (number < 0) {
            System.out.println("The number is not valid");
        }
        int sumatotal = 0;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                // int sumatotal = 0;
                sumatotal += i;
                // System.out.println("La suma total es:" + sumatotal);
            }

        }
        System.out.println("La suma total es:" + sumatotal);

    }

    public static void main(String[] args) {
        MultiplesFuntion(100);
    }

}

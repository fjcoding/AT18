package jalau.at18.katas.multiples.daniela;

public class multiples {
    static void MultiplesFuntion(int number) {
        if (number < 0) {
            System.out.println("The number is not valid");}
        int sumatotal = 0;
        for (int encontrar = 0; encontrar < number; encontrar++) {
            if (encontrar % 3 == 0 || encontrar % 5 == 0) {
                sumatotal += encontrar;}
        }
            
        System.out.println("La suma total es:" + sumatotal);
    }

    public static void main(String[] args) {
        MultiplesFuntion(100);
    }

}

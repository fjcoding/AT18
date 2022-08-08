package jalau.at18.katas.highestlowest.alvaro;

public class Main {

    public static void main(String[] args) {
        String inputNumbers = "1 2 3 4 -5 200 -500";
        int[] num;
        String[] split = inputNumbers.split(" ");
        num = new int[split.length];
        for (int ind = 0; ind < split.length; ind++) {
            num[ind] = Integer.parseInt(split[ind]);
        }
        compareGetHighestNumber(num);
        compareGetLowestNumber(num);

    }
    public static int compareGetHighestNumber(int[]split) {
        int max = 0;
        for (int valor: split) {
            if (valor > max) {
                max = valor;
            }
        }
        System.out.println("el maximo numero es: " + max);
        return max;

    }
    public static int compareGetLowestNumber(int[]split) {
        int min = 0;
        for (int valor : split) {
            if (valor < min) {
                min = valor;
            }
        }
        System.out.println("el menor numero es: " + min);
        return min;
    }
}
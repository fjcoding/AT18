package jalau.at18.katas.multiples.rodrigob;
public class Multiples {

    public static void main(String[] args) {
        final int input = 10;
        System.out.print(sum(input));
    }
    public static int sum(int number) {
        int out = 0;
        final int multi1 = 3;
        final int multi2 = 5;
        if (number < 0) {
            return 0;
        }
        for (int increase = 0; increase < number; increase++) {
            if (increase % multi1 == 0 || increase % multi2 == 0) {
                out += increase;
            }
        }
        return out;
    }
}
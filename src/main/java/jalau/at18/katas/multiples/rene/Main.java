package jalau.at18.katas.multiples.rene;

public class Main {
    public static void main(String[] args) {
        final int inputNumber = 20;
        System.out.println(new Main().multiples(inputNumber));
    }

    public int multiples(int number) {
        int sum = 0;
        final int multiple3 = 3;
        final int multiple5 = 5;
        number--;
        while (number != 0) {
            if (number < 0) {
                int defaultNumber = 0;
                return defaultNumber;
            }
            if (number % multiple3 == 0 || number % multiple5 == 0) {
                sum = sum + number;
            }
            number--;
        }
        return sum;
    }
}

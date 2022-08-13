package jalau.at18.katas.multiples.daniela;

public class Main {
    static final Integer DIVIDE_1 = 3;
    static final Integer DIVIDE_2 = 5;
    public static void main(String[] args) {
        final Integer number = 100;
        getSumMult(number);
    }
    public static Integer getSumMult(Integer number) {
        Integer sum = 0;
        if (number >= 0) {
            for (int find = 1; find < number; find++) {
                if (find % DIVIDE_1 == 0 || find % DIVIDE_2 == 0) {
                    sum = sum + find;
                }
            }
        }
        return sum;
    }
}
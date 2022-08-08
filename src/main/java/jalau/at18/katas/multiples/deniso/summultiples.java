package jalau.at18.katas.multiples.deniso;
public class summultiples {

    private static final int NUMBER_SIZE = 10;
    private static final int NUMBER_ONE = 3;
    private static final int NUMBER_TWO = 5;
    public static void main(String[] args) {
        int sum = 0;
        if (NUMBER_SIZE > 0) {
            for (int index = 0; index < NUMBER_SIZE; index++) {
                if (index % NUMBER_ONE == 0 || index % NUMBER_TWO == 0) {
                    sum = sum + index;
                }
            }
        }
        System.out.println("La suma de multiplos es:" + sum);
    }
}
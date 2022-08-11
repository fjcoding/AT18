package jalau.at18.katas.phonenumber.daniela;

public class Phone {
    public static String myPhone(Integer[] numbers) {
        String telephone1 = "";
        String telephone2 = "";
        String telephone3 = "";
        final int limit1 = 3;
        final int limit2 = 6;
        for (int find = 0; find < numbers.length; find++) {
            if (find < limit1) {
                telephone1 += String.valueOf(numbers[find]);
            } else if (find >= limit1 && find < limit2) {
                telephone2 += String.valueOf(numbers[find]);
            } else if (find >= limit2) {
                telephone3 += String.valueOf(numbers[find]);
            }
        }
        //System.out.println("(" + telephone1 + ")" + telephone2 + "-" + telephone3);
        return "(" + telephone1 + ")"+" " + telephone2 + "-" + telephone3;
    }

    public static void main(String[] args) {
        final Integer[] array = {1, 2, 3, 4};
        myPhone(array);
    }
}

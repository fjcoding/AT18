package jalau.at18.katas.phonenumber.daniela;

public class phonenumber {

    static void phonenumberfuntion(int numbers[]) {
        String telephone1 = "";
        String telephone2 = "";
        String telephone3 = "";

        // int numbers=number.length();
        for (int i = 0; i < numbers.length; i++) {
            if (i < 3) {
                telephone1 += String.valueOf(numbers[i]);
            } else if (i >= 3 && i < 6) {
                telephone2 += String.valueOf(numbers[i]);
            } else if (i >= 6) {
                telephone3 += String.valueOf(numbers[i]);
            }
        }
        System.out.println("(" + telephone1 + ")" + telephone2 + "-" + telephone3);

    }

    public static void main(String[] args) {
        int telephone[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        phonenumberfuntion(telephone);
    }

}

package jalau.at18.katas.phonenumber.daniela;

public class phonenumber {

    static void PhoneNumberFuntion(int numbers[]) {
        String telephone1 = "";
        String telephone2 = "";
        String telephone3 = "";

        // int numbers=number.length();
        for (int buscar = 0; buscar < numbers.length; buscar++) {
            if (buscar < 3) {
                telephone1 += String.valueOf(numbers[buscar]);
            } else if (buscar >= 3 && buscar < 6) {
                telephone2 += String.valueOf(numbers[buscar]);
            } else if (buscar >= 6) {
                telephone3 += String.valueOf(numbers[buscar]);
            }
        }
        System.out.println("(" + telephone1 + ")" + telephone2 + "-" + telephone3);

    }

    public static void main(String[] args) {
        int telephone[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        PhoneNumberFuntion(telephone);
    }

}
package jalau.at18.katas.phonenumber.daniela;

public class phonenumber{
    static void myPhone(int[] numbers) {
        String telephone1 = "";
        String telephone2 = "";
        String telephone3 = "";
        final int limit1 = 3;
        final int limit2 = 6;
        for (int buscar = 0; buscar < numbers.length; buscar++) {
            if (buscar < limit1) {
                telephone1 += String.valueOf(numbers[buscar]);
            } else if (buscar >= limit1 && buscar < limit2) {
                telephone2 += String.valueOf(numbers[buscar]);
            } else if (buscar >= limit2) {
                telephone3 += String.valueOf(numbers[buscar]);
            }
        }
        System.out.println("(" + telephone1 + ")" + telephone2 + "-" + telephone3);
    }

    public static void main(String[] args) {
        final int[] telephone = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        myPhone(telephone);
    }
}
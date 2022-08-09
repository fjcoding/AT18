package jalau.at18.katas.phonenumber.maria;

public class CreatePhoneNumber {

    public static final int THREE = 3;
    public static final int FOUR = 4;
    public static final int FIVE = 5;
    public static final int SIX = 6;
    public static final int SEVEN = 7;
    public static final int EIGHT = 8;
    public static final int NINE = 9;
    public static final int ZERO = 0;
    public static final int PHONE_NUMBER_LENGTH = 10;

    public static void main(String[] args) {
        int[] numbersArray = {1, 2, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, ZERO};
        System.out.println(phoneNumberForm(numbersArray)); // => returns "(123) 456-7890"
    }

    public static String phoneNumberForm(int[] numbersArray) {
        String phoneNumber = "";
        if (numbersArray.length < PHONE_NUMBER_LENGTH) {
            return "Array must have 10 digits";
        }

        if (numbersArray.length == PHONE_NUMBER_LENGTH) {
            phoneNumber = "(" + getPortion(numbersArray, 0, 2) + ")" + " "
                    + getPortion(numbersArray, THREE, FIVE) + "-"
                    + getPortion(numbersArray, SIX, NINE);
        }

        return phoneNumber;
    }

    private static String getPortion(int[] array, int from, int to) {
        String result = "";
        for (int index = from; index <= to; index++) {
            result += array[index];
        }
        return result;
    }
}

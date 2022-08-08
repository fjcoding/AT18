package jalau.at18.katas.phonenumber.maria;

public class Main {
    public static void main(String[] args) {
        int[] numbersArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(phoneNumberForm(numbersArray)); // => returns "(123) 456-7890"
    }
    public static String phoneNumberForm(int[] numbersArray) {
        String phoneNumber = "";
        if (numbersArray.length < 10) {
            return "Array must have 10 digits";
        }
        if (numbersArray.length == 10) {
            phoneNumber = "(" + numbersArray[0] + "" + numbersArray[1] + numbersArray[2] + ")" + " " + numbersArray[3] + numbersArray[4] + numbersArray[5] + "-" + numbersArray[6] + numbersArray[7] + numbersArray[8] + numbersArray[9];
        }
        return phoneNumber;
    }
}

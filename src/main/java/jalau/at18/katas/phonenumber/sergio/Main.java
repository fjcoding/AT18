package jalau.at18.katas.phonenumber.sergio;

public class Main {

    public static void main(String[] args) {
        int number = 1;
        int[] input = new int[] {number, number, number, number, number, number, number, number, number, number};
        String result = returnPhoneNumber(input);
        System.out.println(result);
    }

    public static final int COUNTRYCODESIZE = 3;
    public static final int AREACODESIZE = 6;

    public static String returnPhoneNumber(int[] input) {
        String countryCode = "";
        String areaCode = "";
        String phone = "";
        String fullPhone = "";
        int counter = 0;
        for (int number : input) {
            if (counter < COUNTRYCODESIZE) {
                countryCode = countryCode + String.valueOf(number);

            } else if (counter >= COUNTRYCODESIZE & counter < AREACODESIZE) {
                areaCode = areaCode + String.valueOf(number);
            } else {
                phone = phone + String.valueOf(number);
            }
            counter++;
        }
        fullPhone = "(" + countryCode + ")" + " " + areaCode + "-" + phone;
        return (fullPhone);

    }

}
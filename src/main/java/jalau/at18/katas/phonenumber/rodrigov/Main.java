package jalau.at18.katas.phonenumber.rodrigov;
public class Main {
    public static void main(String[] args) {
        final int firstVar = 3;
        final int secondVar = 4;
        final int thirdVar = 5;
        final int fourthVar = 6;
        final int fifthVar = 7;
        final int sixthVar = 8;
        final int seventhVar = 9;
        final int limitNumber = 10;
        final boolean flagValidator = false;
        int[] phoneNumber = {1, 2, firstVar, secondVar, thirdVar, fourthVar, fifthVar, sixthVar, seventhVar, 0};
        boolean flag = true;
        String phoneAsString = "";
        for (int iterator = 0; iterator < phoneNumber.length; iterator++) {
            if (phoneNumber[iterator] > limitNumber) {
                flag = false;
            }
            phoneAsString += phoneNumber[iterator];
        }
        if (flag == flagValidator) {
            String firstPart = "(" + phoneAsString.substring(0, firstVar) + ") ";
            String secondPart = phoneAsString.substring(firstVar, fourthVar);
            String thirdPart = phoneAsString.substring(fifthVar, phoneAsString.length());
            System.out.println(firstPart + secondPart + "-" + thirdPart);
        } else {
            System.out.println("0");
        }
    }
}
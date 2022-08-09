package jalau.at18.katas.phonenumber.rodrigov;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String number = JOptionPane.showInputDialog("Enter your phone number:");
        System.out.println(new Main().phoneNumber(number));
    }
    public String phoneNumber(String number) {
        final boolean flagValidator = false;
        final int limitNumber = 10;
        final int firstVar = 3;
        final int fourthVar = 6;
        String[] phoneNumber = number.split(" ");
        boolean flag = true;
        String phoneAsString = "";
        for (int iterator = 0; iterator < phoneNumber.length; iterator++) {
            if (Integer.parseInt(phoneNumber[iterator]) > limitNumber) {
                flag = false;
            }
            phoneAsString += phoneNumber[iterator];
        }
        if (flag == flagValidator) {
            String firstPart = "(" + phoneAsString.substring(0, firstVar) + ") ";
            String secondPart = phoneAsString.substring(firstVar, fourthVar);
            String thirdPart = phoneAsString.substring(fourthVar, phoneAsString.length());
            return firstPart + secondPart + "-" + thirdPart;
        } else {
            return "0";
        }
    }
}
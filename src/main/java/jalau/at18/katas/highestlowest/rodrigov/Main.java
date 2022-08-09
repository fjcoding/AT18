package jalau.at18.katas.highestlowest.rodrigov;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String numbersList = JOptionPane.showInputDialog("Input numbers:");
        System.out.println(new Main().highestLowest(numbersList));
    }
    public String highestLowest(String numberList) {
        String[] numbers = numberList.split(" ");
        int lowestNumber = Integer.parseInt(numbers[0]);
        int highestNumber = Integer.parseInt(numbers[0]);
        for (int iterator = 0; iterator < numbers.length; iterator++) {
            if (Integer.parseInt(numbers[iterator]) <= lowestNumber) {
                lowestNumber = Integer.parseInt(numbers[iterator]);
            }
            if (Integer.parseInt(numbers[iterator]) >= highestNumber) {
                highestNumber = Integer.parseInt(numbers[iterator]);
            }
        }
        return highestNumber + " " + lowestNumber;
    }
}
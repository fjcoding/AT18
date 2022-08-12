package jalau.at18.katas.highestlowest.rodrigov;
public class Main {
    public static void main(String[] args) {
        String numbersList = "1 2 3 4 5";
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
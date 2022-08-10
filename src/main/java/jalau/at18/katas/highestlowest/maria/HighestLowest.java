package jalau.at18.katas.highestlowest.maria;

public class HighestLowest {

    public static String highestLowest(String numbers) {
        int highestNumber = Integer.MIN_VALUE;
        int lowestNumber = Integer.MAX_VALUE;
        String[] numbersList = numbers.split("\\s+");
        if (numbersList.length > 0) {
            for (String number : numbersList) {
                int auxNumber = Integer.parseInt(number);
                if (auxNumber > highestNumber) {
                    highestNumber = auxNumber;
                }
                if (auxNumber < lowestNumber) {
                    lowestNumber = auxNumber;
                }
            }
        }
        return String.valueOf(highestNumber) + " " + String.valueOf(lowestNumber);
    }
}

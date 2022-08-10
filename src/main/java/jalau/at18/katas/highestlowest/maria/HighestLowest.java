package jalau.at18.katas.highestlowest.maria;

public class HighestLowest {

    public static void main(String[] args) {
        System.out.println(highestLowest("3 3")); // return "5 1"
        System.out.println(highestLowest("1 2 3 4 5")); // return "5 1"
        System.out.println(highestLowest("1 2 -3 4 5")); //return "5 -3"
        System.out.println(highestLowest("1 9 3 4 -5")); // return "9 -5"
    }

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

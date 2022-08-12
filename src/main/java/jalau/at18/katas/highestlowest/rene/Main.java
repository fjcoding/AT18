package jalau.at18.katas.highestlowest.rene;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().func("1 3 400 5 6 7 -4 3 2"));

    }

    public String func(String numbers) {
        String[] numbersArray = numbers.split(" ");
        int highestNumber = Integer.parseInt(numbersArray[0]);
        for (int index = 0; index < numbersArray.length; index++) {
            int numberToCompare = Integer.parseInt(numbersArray[index]);
            if (numberToCompare > highestNumber) {
                highestNumber = numberToCompare;
            }
        }
        int lowestNumber = Integer.parseInt(numbersArray[0]);
        for (int index = 0; index < numbersArray.length; index++) {
            int numberToCompare = Integer.parseInt(numbersArray[index]);
            if (numberToCompare < lowestNumber) {
                lowestNumber = numberToCompare;
            }
        }
        return String.valueOf(highestNumber) + " " + String.valueOf(lowestNumber);
    }
}

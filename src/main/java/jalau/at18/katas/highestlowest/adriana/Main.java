package jalau.at18.katas.highestlowest.adriana;

public class Main {
    public static void main(String[] args) {
        String str = "-4 -5 7 -9 9 3 6 10 -5";
        String[] array = str.split(" ");
        Integer high = getHighest(array);
        Integer low = getLowest(array);
        System.out.println("highAndLow(" + str + ")");
        System.out.println(high + " " + low);
    }
    private static Integer getHighest(String[] array) {
        Integer high = 0;
        Integer length = array.length;
        for (int count = 0; count < length; count++) {
            if (count == 0) {
                high = Integer.parseInt(array[count]);
            } else {
                if (Integer.parseInt(array[count]) > high) {
                    high = Integer.parseInt(array[count]);
                }
            }
        }
        return high;
    }
    private static Integer getLowest(String[] array) {
        Integer low = 0;
        Integer length = array.length;
        for (int counter = 0; counter < length; counter++) {
            if (counter == 0) {
                low = Integer.parseInt(array[counter]);
            } else {
                if (Integer.parseInt(array[counter]) < low) {
                    low = Integer.parseInt(array[counter]);
                }
            }
        }
        return low;
    }
}
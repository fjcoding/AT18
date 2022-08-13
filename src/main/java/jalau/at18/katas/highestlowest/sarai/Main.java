package jalau.at18.katas.highestlowest.sarai;

public class Main {
    public static final int NUMAUX = 1;
    public static void main(String[] args) {
        int[] save = new int[] {NUMAUX, NUMAUX, NUMAUX, NUMAUX, NUMAUX};
        System.out.println(highestLowestNumber(save));
    }
    public static String highestLowestNumber(int[] save) {
        int highestNumber  = save[0];
        int lowestNumber = save[0];
        for (int index = 0; index < save.length; index++) {
            if (save[index] > highestNumber) {
                highestNumber  = save[index];
            }
            if (save[index] < lowestNumber) {
                lowestNumber = save[index];
            }
        }
        return highestNumber + " " + lowestNumber;
    }
}
package jalau.at18.katas.highestlowest.joser;
public class Main {

    public static void main(String[] args) {
        System.out.println(new Main().hihglow("-5 -4 3 -1 9 15 6 4 -5"));
    }

    public String hihglow(String str) {
        String[] values = str.split(" ");
        int max = 0;
        int min = 0;
        for (int index = 0; index < values.length; index++) {
            max = Math.max(max, Integer.parseInt(values[index]));
            min = Math.min(min, Integer.parseInt(values[index]));
        }
        return max + " " + min;
    }
}
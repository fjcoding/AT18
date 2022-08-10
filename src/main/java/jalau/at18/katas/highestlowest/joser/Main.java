package jalau.at18.katas.highestlowest.joser;
public class Main {

    public static void main(String[] args) {
        System.out.println(new Main().hihglow("1 5 5 4 8 0"));
    }

    public String hihglow(String str) {
        String[] values = str.split(" ");
        int max = Integer.parseInt(values[0]);
        int min = Integer.parseInt(values[0]);
        for (int index = 0; index < values.length; index++) {
            max = Math.max(max, Integer.parseInt(values[index]));
            min = Math.min(min, Integer.parseInt(values[index]));
        }
        return max + " " + min;
    }
}
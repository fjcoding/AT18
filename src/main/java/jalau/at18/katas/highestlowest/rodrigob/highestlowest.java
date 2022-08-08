package jalau.at18.katas.highestlowest.rodrigob;

public class Highestlowest {

    public static void main(String[] args) {
        System.out.print(result("20 40 5 8 7 6 56"));
    }
    public static String result(String numbers) {
        String out;
        int aux;
        int maximun = 0;
        String[] divide = numbers.split(" ");
        int[] compare = new int[divide.length];
        int minimun = (compare.length - 1);
        for (int index = 0; index < compare.length; index++) {
            compare[index] = Integer.parseInt(divide[index]);
        }
        for (int count = 0; count < compare.length; count++) {
            for (int index = 0; index < compare.length - 1; index++) {
                if (compare[index] < compare[index + 1]) {
                    aux = compare[index];
                    compare[index] = compare[index + 1];
                    compare[index + 1] = aux;
                }
            }
        }
        out = compare[maximun] + " " + compare[minimun];
        return out;
    }
}
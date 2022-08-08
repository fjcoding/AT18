package jalau.at18.katas.highestlowest.joser;
public class Main {

    public static void main(String[] args) {
        System.out.println(new Main().hilo("-5 -4 3 -1 9 15 6 4 -5"));
    }

    public String hilo(String str) {
        String[] valores = str.split(" ");
        int max = 0;
        int min = 0;
        for (int index = 0; index < valores.length; index++) {
            max = Math.max(max, Integer.parseInt(valores[index]));
            min = Math.min(min, Integer.parseInt(valores[index]));
        }
        return max + " " + min;
    }
}
package jalau.at18.katas.highestlowest.joser;
public class Main {

    public static void main(String[] args) {

        System.out.println(new Main().Hilo("-4 -5 7 -9 9 3 6 10 -5"));
           
    }

    public String Hilo(String str) {

        String [] valores = str.split(" ");
        int max = 0, min = 0;
        
        for (int i = 0; i < valores.length; i++) {
            max = Math.max(max, Integer.parseInt(valores[i]));
            min = Math.min(min, Integer.parseInt(valores[i]));
        }

        return max+" "+min;
    }
}
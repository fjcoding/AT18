package jalau.at18.katas.multiples.carlos;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String text = JOptionPane.showInputDialog("Number:");
        Main main = new Main();
        int multiples = main.multiples(text);
        System.out.println(multiples);
    }
    public static int multiples(String text) {
        int number = Integer.parseInt(text);
        int aux = number;
        final int mult1 = 3;
        final int mult2 = 5;
        int sum = 0;
        for (int index = 0; index < aux; index++) {
            if (index % mult1 == 0) {
                sum = sum + index;
            } else if (index % mult2 == 0) {
                sum = sum + index;
            }
        }
        return sum;
    }
}

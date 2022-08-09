package jalau.at18.katas.multiples.carlos;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String text = JOptionPane.showInputDialog("Number:");
        int number = Integer.parseInt(text);
        int aux = number;
        int mult1 = 3;
        int mult2 = 5;
        int sum = 0;
        for (int index = 0; index <= aux; index++) {
             if (index % mult1 == 0){
                 sum = sum + index;
             }
             else if (index % mult2 == 0){
                sum = sum + index;
             }

        }
        System.out.println(sum);
    }
}

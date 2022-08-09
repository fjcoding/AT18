package jalau.at18.katas.likes.carlos;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String text = JOptionPane.showInputDialog("Names:");
        String names[] = text.split(",");
        int cant = names.length;
        String person[] = new String[cant];

        if (cant == 0) {
            System.out.println("no one likes this");
        } else {
            for (int index = 0; index < cant; index++) {
                person[index] = names[index];
            }

            if (cant == 1) {
                System.out.println(person[0] + " likes this");
            } else if (cant == 2) {
                System.out.print(person[0] + " and " + person[1] + " like this");
            } else if (cant == 3) {
                System.out.print(person[0] + ", " + person[1] + " and " + person[2] + " like this");
            } else if (cant > 3) {
                System.out.print(person[0] + ", " + person[1] + " and " + (cant - 2) + " others like this");
            }
        }
    }
}

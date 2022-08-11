package jalau.at18.katas.likes.carlos;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String text = JOptionPane.showInputDialog("Names:");
        Main main = new Main();
        String likes = main.likes(text);
        System.out.println(likes);
    }
    public static String likes(String text) {
        String[] names = text.split(",");
        int cant = names.length;
        String[] person = new String[cant];
        final int case1 = 0;
        final int case2 = 1;
        final int case3 = 2;
        final int limit = 3;
        String solution = "";

        if (cant == 0) {
            System.out.println("no one likes this");
        } else {
            for (int index = case1; index < cant; index++) {
                person[index] = names[index];
            }

            if (cant == case2) {
                solution = (person[0] + " likes this");
            } else if (cant == case3) {
                solution = (person[0] + " and " + person[1] + " like this");
            } else if (cant == limit) {
                solution = (person[0] + ", " + person[1] + " and " + person[2] + " like this");
            } else if (cant > limit) {
                solution = (person[0] + ", " + person[1] + " and " + (cant - 2) + " others like this");
            }
        }
        return (solution);
    }
}
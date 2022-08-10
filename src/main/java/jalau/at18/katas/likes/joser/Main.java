package jalau.at18.katas.likes.joser;
import javax.swing.JOptionPane;
public class Main {

    public static final int THREE = 3;
    public static void main(String[] args) {
        String inpu = JOptionPane.showInputDialog("Enter the names:");
        System.out.println(new Main().likes(inpu));
    }
    public String likes(String str) {
        String[] names = str.split(" ");
        System.out.println(names[0]);
        if (str.equals("")) {
            return "no one likes this";
        }
        if (names.length == 1) {
            return names[0] + " likes this";
        }
        if (names.length == 2) {
            return names[0] + " and " + names[1] + " like this";
        }
        if (names.length == THREE) {
            return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        }
        if (names.length > THREE) {
            return names[0] + ", " + names[1] + " and " + (names[2].length() - 2) + " others like this";
        }
        return "void";
    }
}
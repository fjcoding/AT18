package jalau.at18.katas.likes.joser;
import javax.swing.JOptionPane;
public class Main {

    public static final int THREE = 3;
    public static void main(String[] args) {
        String inpu = JOptionPane.showInputDialog("Enter the names:");
        String[] names = inpu.split(" ");
        System.out.println(new Main().likes(names));
    }
    public String likes(String[] str) {
        if (str.length == 0) {
            return "no one likes this";
        }
        if (str.length == 1) {
            return str[0] + "no one likes this";
        }
        if (str.length == 2) {
            return str[0] + " and " + str[1] + " like this";
        }
        if (str.length == THREE) {
            return str[0] + "," + str[1] + " and " + str[2] + " like this";
        }
        if (str.length > THREE) {
            return str[0] + "," + str[1] + " and " + (str[2].length() - 2) + " others like this";
        }
        return "void";
    }
}

// ```
// []                                -->  "no one likes this"
// ["Peter"]                         -->  "Peter likes this"
// ["
// Jacob Alex                 -->  "Jacob and Alex like this"
// ["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
// ["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
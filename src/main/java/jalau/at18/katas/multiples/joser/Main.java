package jalau.at18.katas.multiples.joser;
import javax.swing.JOptionPane;
public class Main {
    public static final int THREE = 3;
    public static final int FIVE = 5;

    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter value:"));
        System.out.println(new Main().multiples(number));
    }

    public int multiples(int number) {
        int sum = 0;
        if (number < 0) {
            return 0;
        } else {
            for (int index = 1; index < number; index++) {
                if (index % THREE == 0 || index % FIVE == 0) {
                    sum += index;
                }
            }
        }
        return sum;
    }
}

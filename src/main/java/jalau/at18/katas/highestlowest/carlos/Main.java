package jalau.at18.katas.highestlowest.carlos;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String text = JOptionPane.showInputDialog("Numbers:");
        String[] numToTex = text.split(" ");
        int dates = numToTex.length;
        int[] number = new int[dates];
        for (int index = 0; index < dates; index++) {
            number[index] = Integer.parseInt(numToTex[index]);
        }
        int highest = number[0];
        int lowest = number[0];
        for (int index = 0; index < dates; index++) {
            if (number[index] > highest) {
                highest = number[index];
            }
            if (number[index] < lowest) {
                lowest = number[index];
            }
        }
        System.out.println(highest + " " + lowest);
    }
}
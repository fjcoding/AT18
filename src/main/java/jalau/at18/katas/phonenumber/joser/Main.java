package jalau.at18.katas.phonenumber.joser;
import javax.swing.JOptionPane;
public class Main {
    public static final int THREE = 3;
    public static final int SIX = 6;
    public static final int TEN = 10;
    public static void main(String[] args) {
        String telphone = JOptionPane.showInputDialog("Enter the numbers:");
        System.out.println(new Main().phoneNumber(telphone));
    }
    public String phoneNumber(String str) {
        String tel = str.replace(" ", "");
        return '(' + tel.substring(0, THREE) + ") " + tel.substring(THREE, SIX) + "-" + tel.substring(SIX, TEN);
    }
}
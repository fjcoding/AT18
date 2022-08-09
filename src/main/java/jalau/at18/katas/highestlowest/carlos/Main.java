package jalau.at18.katas.highestlowest.carlos;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Numeros:");
        String[] numEnTex = texto.split(" ");
        int datos = numEnTex.length;
        int[] numero = new int[datos];
        for (int index = 0; index < datos; index++) {
            numero[index] = Integer.parseInt(numEnTex[index]);
        }
        int mayor = numero[0];
        int menor = numero[0];
        for (int index = 0; index < datos; index++) {
            if (numero[index] > mayor) {
                mayor = numero[index];
            }
            if (numero[index] < menor) {
                menor = numero[index];
            }
        }
        System.out.println(mayor + " " + menor);
    }
}
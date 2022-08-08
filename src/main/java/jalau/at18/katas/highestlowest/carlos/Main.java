package jalau.at18.katas.highestlowest.carlos;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args ) {
        String texto=JOptionPane.showInputDialog("Numeros:");
        String numEnTex[]=texto.split(" ");
        int n=numEnTex.length;
        int numero[]=new int [n];
        for (int i=0; i<n;i++){
            numero[i]=Integer.parseInt(numEnTex[i]);
        }
        int mayor=numero[1];
        int menor=numero[1];
        for(int i=0;i<n;i++){
           if (numero[i]>mayor){
               mayor=numero[i];
           }
           if(numero[i]<menor){
               menor=numero[i];
           }
        }
        System.out.println(mayor+" "+menor);
    }
}

package main.java.jalau.at18.katas.highestlowest.carlos;
public class Main{


    String texto=JOptionPane.showInputDialog("Numeros:");
        String numEnTex[]=texto.split(" ");
        int n=numEnTex.length;
        int numero[]=new int [n];
        for (int i=0; i<n;i++){
            numero[i]=Integer.parseInt(numEnTex[i]);
        }
        int mayor=0;
        int menor=0;
        for(int j=0;j<n;j++){
           if (numero[i]>mayor){
               mayor=numero[j];
           }
           if(numero[j]<menor){
               menor=numero[j];
           }
        }
        System.out.println(mayor+" "+menor);
}
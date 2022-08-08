package jalau.at18.katas.highestlowest.fernanda;

import java.util.*;

public class Main {
    public static void main(String[] args)  throws InterruptedException{ 
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter string of numbers separated by spaces");
    String number = scan.nextLine();
    String[] num = number.split(" ");
    int[] numb = new int[num.length];

    for (int i = 0; i < num.length; i++) { 
        numb[i] = Integer.parseInt(num[i]);    
    }
        
    int lastNum = (num.length) - 1;
    Arrays.sort(numb);
    System.out.println(numb[0] + "   " + numb[lastNum]);
    scan.close();
    }

}

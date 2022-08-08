package jalau.at18.katas.highestlowest.fernanda;

import java.util.*;

public class Main {
    public static void main(String[] args)  throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string of numbers separated by spaces");
        String number = scan.nextLine();
        String[] num = number.split(" ");
        int[] numb = new int[num.length];

        for (int place = 0; place < num.length; place++) {
            numb[place] = Integer.parseInt(num[place]);
        }
        int lastNum = (num.length) - 1;
        Arrays.sort(numb);
        System.out.println(numb[0] + "   " + numb[lastNum]);
        scan.close();
    }

}

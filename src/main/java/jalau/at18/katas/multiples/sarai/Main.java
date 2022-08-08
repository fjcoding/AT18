package jalau.at18.katas.multiples.sarai;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int num, suma=0;
        Scanner pp=new Scanner(System.in);
        System.out.println("Enter a number ");
        num=pp.nextInt();
       if(num>0)
       {
           for (int i = 0; i < num; i++)
           {
               if (i % 3 == 0 || i % 5 == 0)
               {
                  System.out.println(i);
                   suma += i;
               }
           }
          System.out.println("the sum of the numbers is: " + suma);
       }
       
       else
           System.out.println("the sum of the numbers is: 0 ");


       


    }
}

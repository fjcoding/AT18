package jalau.at18.katas.phonenumber.sarai;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pp=new Scanner(System.in);
        int num;
        System.out.println("Enter 10 numbers");
        int contt = 10;
        int[] almac = new int[10];
        for (int i = 0; i < contt; i++)
        {    num=pp.nextInt();
             almac[i] = num;
        }

        for(int i = 0; i < 10;i++){ 
            if(i==0)
            {
               System.out.print("(");
            }
            if (i == 3)
            {
                System.out.print(")");
            }
            if (i==6)
            {
                System.out.print("-");
            }
            System.out.print(almac[i]);
        }
    }
}

package jalau.at18.katas.highestlowest.sarai;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cant;
         Scanner pp=new Scanner(System.in);
         System.out.println("How many numbers do you want to enter?");
         cant=pp.nextInt();
         int[] alma = new int[cant];

        System.out.println("enter numbers");
        for (int i = 0; i<cant; i++)
        {
            int num = pp.nextInt();
            alma[i] = num;
        }
        int numMayor = alma[0];
        int numMenor = alma[0];
        for (int i = 0; i <alma.length; i++)
        {
                if (alma[i] > numMayor)
                {
                    numMayor = alma[i];
                }
                if (alma[i] < numMenor)
                {
                    numMenor = alma[i];
                }
        }
     System.out.println("numbers "+ numMayor+ " " + numMenor);





    }
}

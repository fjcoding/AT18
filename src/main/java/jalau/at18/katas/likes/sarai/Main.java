package jalau.at18.katas.likes.sarai;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       
        
        String nombres;
        Scanner pp=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int tam=pp.nextInt();
 
        if(tam>=1)
        {
            String[] personas = new String[tam];
            System.out.println("Enter names");
               for (int i = 0; i < tam; i++)
               {
                   nombres = pp.next();
                   personas[i] = nombres;
                   if (tam == 1)
                   {
                       System.out.println(personas[i] + " likes this");
                   }
               }

              

              if (tam >1 && tam < 4 )
              {
                  for(int i = 0; i < personas.length; i++)//imprimir los nombres del array
                  {  
                      System.out.print(personas[i] + ",");
                  }

                  System.out.print(" like this");

              }


               if(tam >= 4)
              { 
                      for (int i = 0; i < 2 ; i++)//imprimir los nombres del array
                      {
                           System.out.print(personas[i] + ",");
                      }
                      System.out.print(personas[2]);

                  int ress = tam - 3;
                  System.out.print(" and "+ ress +" others like this");
              }
        }
        else
        {
        
         if (tam == 0 || tam<1)
           {
               System.out.println("no one likes this");
           }
        }




    }
}

package jalau.at18.katas.phonenumber.fernanda;

import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int phoneNumleng = 10;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 10 digits separated by commas");
        String tenDigit = scan.nextLine();

        String[] phoneNum = tenDigit.split(",");
        if(phoneNum.length == phoneNumleng){

            System.out.print("(" + phoneNum[0] + phoneNum[1] + phoneNum[2] + ") ");
            System.out.print(phoneNum[3] + phoneNum[4]+ phoneNum[5] + "-" + phoneNum[6]+phoneNum[7]+phoneNum[8]+phoneNum[9]);

        } else{
            System.out.println("Debe ingresar 10 numeros");
        }

        scan.close();

        

        

    } 
}



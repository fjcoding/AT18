
package jalau.at18.katas.likes.fernanda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        int onlyThreeLikes = 3;
        int fourOrMoreLikes = 4;
        int onlyTwoLikes = 2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string of names separated by commas");
        String likeNames = scan.nextLine();
        String[] nameArray = likeNames.split(",");
        if (nameArray.length >= fourOrMoreLikes) {
        System.out.println(nameArray[0] + " , " +  nameArray[1]+ " and " + (nameArray.length - 2) + " others Like this");
        }
            else {
                if (nameArray.length == onlyThreeLikes){
                    System.out.println(nameArray[0] + " , " + nameArray[1] + " and " + nameArray[2] + " Like this");
                }
                else {
                    if (nameArray.length == onlyTwoLikes){
                        System.out.println(nameArray[0] + " and " + nameArray[1] + " like this");
                    }
                    else {
                        System.out.println("No one likes this");
                    }
                }
            }
        scan.close();
    }
}





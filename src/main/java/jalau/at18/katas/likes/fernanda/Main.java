
package jalau.at18.katas.likes.fernanda;

import java.util.Scanner;

public class Main {
    private static final int ONLY_THREELIKES = 3;
    private static final int FOUR_OR_MORELIKES = 4;

    public static void main(String[] args) throws InterruptedException {
        int onlyTwoLikes = 2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string of names separated by commas");
        String likeNames = scan.nextLine();
        String[] nameArray = likeNames.split(",");
        if (nameArray.length >= FOUR_OR_MORELIKES) {
            System.out.println(nameArray[0] + " , " +  nameArray[1] + " and " + (nameArray.length - 2) + " others Like this");
        } else {
            if (nameArray.length == ONLY_THREELIKES) {
                System.out.println(nameArray[0] + " , " + nameArray[1] + " and " + nameArray[2] + " Like this");
            } else {
                if (nameArray.length == onlyTwoLikes) {
                    System.out.println(nameArray[0] + " and " + nameArray[1] + " like this");
                } else {
                    System.out.println("No one likes this");
                }
            }
        }
        scan.close();
    }
}





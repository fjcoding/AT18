
package jalau.at18.katas.likes.fernanda;

import java.util.Scanner;

public class Main {
    private static final int ONLY_TWOLIKES = 2;
    private static final int ONLY_THREELIKES = 3;
    private static final int FOUR_OR_MORELIKES = 4;

    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string of names separated by commas");
        String likeNames = scan.nextLine();
        Main main = new Main();
        System.out.print(main.whoLikesIt(likeNames));
        scan.close();
    }
    public String whoLikesIt(String likes) {
        String[] nameArray = likes.split(",");
        String amountLikes;
        if (nameArray.length >= FOUR_OR_MORELIKES) {
            amountLikes = (nameArray[0] + " , " +  nameArray[1] + " and " + (nameArray.length - 2) + " others Like this");
        } else {
            if (nameArray.length == ONLY_THREELIKES) {
                amountLikes = (nameArray[0] + " , " + nameArray[1] + " and " + nameArray[2] + " Like this");
            } else {
                if (nameArray.length == ONLY_TWOLIKES) {
                    amountLikes = (nameArray[0] + " and " + nameArray[1] + " like this");
                } else {
                    amountLikes = ("No one likes this");
                }
            }
        }
        return amountLikes;
    }
}





package jalau.at18.katas.likes.hugo;

import java.util.Scanner;

public class Main {
    static final Integer NUM_3 = 3;

    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        // String[] likes = {};
        // String[] likes = { "Peter" };
        // String[] likes = {"Jacob", "Alex"};
        // String[] likes = {"Max", "John", "Mark"};
        // String[] likes = { "Alex", "Jacob", "Mark", "Max" };

        // String names = new String();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the names of people who liked this spaced with a blank space");
        String names = input.nextLine();

        String[] likes = names.split(" ");

        System.out.println(likes.length + " likes");
        int elementnum = likes.length;

        if (elementnum == 0) {
            System.out.println("No one likes this");
        } else {
            if (elementnum == 1) {
                System.out.println(likes[0] + " likes this");
            } else {
                if (elementnum == 2) {
                    System.out.println(likes[0] + " and " + likes[1] + " likes this");
                } else {
                    if (elementnum == NUM_3) {
                        System.out.println(likes[0] + ", " + likes[1] + " and " + likes[2] + " likes this");
                    } else {
                        System.out.println(
                                likes[0] + ", " + likes[1] + " and " + (likes.length - 2) + " others likes this");
                    }
                }
            }
        }

        /*switch (elementnum) {
            case 0:
                System.out.println("No one likes this");
                break;
            case 1:
                System.out.println(likes[0] + " likes this");
                break;
            case 2:
                System.out.println(likes[0] + " and " + likes[1] + " likes this");
                break;
            case NUM_3:
                System.out.println(likes[0] + ", " + likes[1] + " and " + likes[2] + " likes this");
                break;
            default:
                System.out.println(likes[0] + ", " + likes[1] + " and " + (likes.length - 2) + " others likes this");
                break;
        }*/

    }

}

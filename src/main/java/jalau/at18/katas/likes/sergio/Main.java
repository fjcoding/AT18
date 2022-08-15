package jalau.at18.katas.likes.sergio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner readString = new Scanner(System.in);
        System.out.println("Ingrese los nombres separados por un espacio: ");
        String namesString = readString.nextLine();
        System.out.println(likesString(namesString));
    }

    public static final int ONETOTHREE = 3;

    public static String likesString(String namesString) {
        String[] splitNames = namesString.split(" ");
        if (splitNames.length == 0) {
            String likes = "no one likes this";
            return likes;
        }
        if (splitNames.length == 1) {
            String likes = splitNames[0] + " " + "likes this";
            return likes;
        }
        if (splitNames.length > 1 & splitNames.length < ONETOTHREE) {
            String likes = splitNames[0] + " and " + splitNames[1] + " " + "like this";
            return likes;
        }
        if (splitNames.length == ONETOTHREE) {
            String likes = splitNames[0] + ", " + splitNames[1] + " and " + splitNames[ONETOTHREE - 1] + " like this";
            return likes;
        } else {
            int morePersons = splitNames.length - 2;
            String likes = splitNames[0] + ", " + splitNames[1] + " and " + morePersons + " others like this";
            return likes;
        }
    }
}

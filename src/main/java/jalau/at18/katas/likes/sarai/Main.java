package jalau.at18.katas.likes.sarai;
import java.util.Scanner;
public class Main {
    static final int MORETHANFOURNAMES = 4;
    static final int THREEPEOPLE = 3;
    public static void main(String[] args) {
        String names;
        Scanner scankeyboard = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int arraySize = scankeyboard.nextInt();
        if (arraySize >= 1) {
            String[] people = new String[arraySize];
            System.out.println("Enter names");
            for (int index = 0; index < arraySize; index++) {
                names = scankeyboard.next();
                people[index] = names;
                if (arraySize == 1) {
                    System.out.println(people[index] + " likes this");
                }
            }
            if (arraySize > 1 && arraySize < MORETHANFOURNAMES) {
                for (int index = 0; index < people.length; index++) {
                    System.out.print(people[index] + ",");
                }
                System.out.print(" like this");
            }
            if (arraySize >= MORETHANFOURNAMES) {
                for (int index = 0; index < 2; index++) {
                    System.out.print(people[index] + ",");
                }
                System.out.print(people[2]);
                int subtract = arraySize - THREEPEOPLE;
                System.out.print(" and " + subtract + " others like this");
            }
        } else {
            if (arraySize == 0 || arraySize < 1) {
                System.out.println("no one likes this");
            }
        }
    }
}
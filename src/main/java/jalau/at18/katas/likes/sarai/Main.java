package jalau.at18.katas.likes.sarai;
import java.util.Scanner;
public class Main {
    static final int FOURNAMES = 4;
    static final int THREEPEOPLE = 3;
    static final int TWOPEOPLE = 2;
    public static void main(String[] args) {
        String names;
        Scanner scankeyboard = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int arraySize = scankeyboard.nextInt();
        String[] people = new String[arraySize];
        System.out.println("Enter names");
        for (int index = 0; index < arraySize; index++) {
            names = scankeyboard.next();
            people[index] = names;
        }
        System.out.println(showPeople(people, arraySize));
    }
    public static String showPeople(String[] people, int arraySize) {
        int counnt = 0;
        int cont = 0;
        String menssage = "";
        if (arraySize == 0 || arraySize < 1) {
            menssage = "no one likes this";
        }
        if (arraySize == 1) {
            for (int index = 0; index < people.length; index++) {
                menssage = people[index] + " likes this";
            }
        }
        if (arraySize > 1 && arraySize == TWOPEOPLE) {
            for (int index = 0; index < people.length; index++) {
                if (counnt == 0) {
                    menssage = menssage + people[index] + " and ";
                    counnt++;
                } else {
                    menssage = menssage + people[index];
                }
            }
            menssage = menssage + " like this";
        }
        if (arraySize > 1 && arraySize == THREEPEOPLE) {
            for (int index = 0; index < people.length; index++) {
                if (cont == 0) {
                    menssage = menssage + people[index] + ", ";
                    cont++;
                } else if (cont == 1) {
                    menssage = menssage + people[index] + " and ";
                    cont++;
                } else if (cont == 2) {
                    menssage = menssage + people[index] + " like this";
                    cont++;
                }
            }
        }
        if (arraySize >= FOURNAMES) {
            for (int index = 0; index < TWOPEOPLE; index++) {
                if (cont == 0) {
                    menssage = menssage + people[index] + ", ";
                    cont++;
                } else if (cont == 1) {
                    menssage = menssage + people[index];
                    cont++;
                }
            }
            int subtract = arraySize - TWOPEOPLE;
            menssage = menssage + " and " + subtract + " others like this";
        }
        return menssage;
    }
}
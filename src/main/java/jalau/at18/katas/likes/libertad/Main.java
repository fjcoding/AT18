package jalau.at18.katas.likes.libertad;

public class Main {

    public static void main(String[] args) {
        String[] names = {"Jose", "Lucas"};
        System.out.println(whoLikes(names));
    }

    public static String whoLikes(String[] names) {
        String messageAditional = " likes this";
        String messageName = "no one";
        int one = 1;
        int two = 2;
        int three = 3;
        if (names.length == one) {
            messageName = names[0];
        }
        if (names.length == two) {
            messageAditional = " like this";
            messageName = names[0] + " and " + names[1];
        }
        if (names.length == three) {
            messageAditional = " like this";
            messageName = names[0] + ", " + names[1] + " and " + names[2];
        }
        if (names.length > three) {
            messageAditional = " like this";
            messageName = names[0] + ", " + names[1] + " and " + (names.length-2) + "others";
        }
        return messageName+messageAditional;
    }
}
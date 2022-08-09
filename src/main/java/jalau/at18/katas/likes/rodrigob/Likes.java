package jalau.at18.katas.likes.rodrigob;
public class Likes {

    public static void main(String[] args) {
        System.out.print(whoLikes(new String[] {"Valeria", "Alex", "Andres", "Jacob", "Mark", "Max"}));
    }
    public static String whoLikes(String[] names) {
        String out = "";
        final int option = 3;
        switch (names.length) {
            case 0:
                out = "no one likes this";
                break;
            case 1:
                out = names[0] + " likes this";
                break;
            case 2:
                out = names[0] + " and " + names[1] + " like this";
                break;
            case option:
                out = names[0] + ", " + names[1] + " and " + names[2] + " like this";
                break;
            default:
                out = names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
                break;
        }
        return out;
    }
}
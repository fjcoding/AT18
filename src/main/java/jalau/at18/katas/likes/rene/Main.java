package jalau.at18.katas.likes.rene;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Camila", "Fabricio", "Sebastian", "Adrian", "Jose", "Cristian", "Fabian", "Ee"};
        System.out.println(new Main().likes(names));

    }

    public String likes(String[] names) {
        final int oneLike = 1;
        final int twoLike = 2;
        final int threeLike = 3;
        if (names.length == 0) {
            return "No one like this";
        } else if (names.length == oneLike) {
            return names[0] + " like this";
        } else if (names.length == twoLike) {
            return  names[0] + " and " + names[1] + " like this";
        } else if (names.length == threeLike) {
            return names[0] + ", "  + names[1] + " and " + names[2] + " like this";
        } else {
            return names[0] + ", "  + names[1] + " and " + (names.length - 2) + " others like this";
        }

    }
}

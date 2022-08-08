package jalau.at18.katas.likes.rodrigov;
public class Main {
    public static void main(String[] args) {
        String[] names = {"Alex", "Jacob", "Mark", "Max", "Nathan"};
        String nameDisplay = "";
        final int threePeople = 3;
        final int fourPeople = 4;
        if (names.length == 0) {
            nameDisplay = "no one like this";
        } else {
            if (names.length == 1) {
                nameDisplay = names[0] + " like this";
            } else {
                if (names.length == 2) {
                    nameDisplay = names[0] + " and " + names[1] + " like this";
                } else {
                    if (names.length == threePeople) {
                        nameDisplay = names[0] + ", " + names[1] + " and " + names[2] + " like this";
                    } else {
                        if (names.length >= fourPeople) {
                            nameDisplay = names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
                        }
                    }
                }
            }
        }
        System.out.println(nameDisplay);
    }
}
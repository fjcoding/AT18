package jalau.at18.katas.likes.rodrigov;
public class Main {
    public static void main(String[] args) {
        String namesList = "Alex Jacob Mark Max";
        System.out.println(new Main().likes(namesList));
    }
    public String likes(String namesList) {
        String[] names = namesList.split(" ");
        String nameDisplay = "";
        final int threePeople = 3;
        final int fourPeople = 4;
        if (names.length == 0) {
            nameDisplay = "no one likes this";
        } else {
            if (names.length == 1) {
                if (names[0].length() == 0) {
                    nameDisplay = "no one likes this";
                } else {
                    nameDisplay = names[0] + " likes this";
                }
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
        return nameDisplay;
    }
}
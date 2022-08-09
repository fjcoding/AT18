package jalau.at18.katas.likes.maria;

public class Likes {

    public static final int THREE_PEOPLE = 3;

    public static void main(String[] args) {
        String[] people1 = {}; //-->  "no one likes this"
        String[] people2 = {"Peter"}; //-->  "Peter likes this"
        String[] people3 = {"Jacob", "Alex"}; //-->  "Jacob and Alex like this"
        String[] people4 = {"Max", "John", "Mark"}; //"Max, John and Mark like this"
        String[] people5 = {"Alex", "Jacob", "Mark", "Max"}; //-->  "Alex, Jacob and 2 others like this"
        String[] people6 = {"Karina", "Elsa", "Marcela", "Silvia", "Oscar", "Vladimir", "Romina"};
        System.out.println(likeAnswer(people1));
        System.out.println(likeAnswer(people2));
        System.out.println(likeAnswer(people3));
        System.out.println(likeAnswer(people4));
        System.out.println(likeAnswer(people5));
        System.out.println(likeAnswer(people6));
    }

    public static String likeAnswer(String[] namesList) {
        String likeThis = " likes this";
        String otherLikeThis = " others like this";
        String message = "";
        int numberPeople = namesList.length;
        if (numberPeople == 0) {
            return "no one likes this";
        }

        if (numberPeople == 1) {
            message = namesList[0] + likeThis;
        }
        if (numberPeople == 2) {
            message = namesList[0] + " and " + namesList[1] + likeThis;
        }
        if (numberPeople == THREE_PEOPLE) {
            message = namesList[0] + ", " + namesList[1] + " and " + namesList[2] + likeThis;
        }
        if (numberPeople > THREE_PEOPLE) {
            message = namesList[0] + ", " + namesList[1] + " and " + String.valueOf(numberPeople - 2) + otherLikeThis;
        }

        return message;
    }
}
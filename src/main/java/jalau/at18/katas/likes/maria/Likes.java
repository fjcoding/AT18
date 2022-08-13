package jalau.at18.katas.likes.maria;

public class Likes {

    public static final int THREE_PEOPLE = 3;

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
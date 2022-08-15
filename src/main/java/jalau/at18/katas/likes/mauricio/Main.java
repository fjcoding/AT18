package jalau.at18.katas.likes.mauricio;

public class Main {
    private static final int FIRST_CASE = 0;
    private static final int SECOND_CASE = 1;
    private static final int THIRD_CASE = 2;
    private static final int FOURTH_CASE = 3;
    private static final int FIFTH_CASE = 4;

    public static void main(String[] args) {
        String[] nameList = {"Carlos", "Alberto", "Karina", "Liz"};
        String likes = getLikesFromPost(nameList);
        System.out.println(likes);
    }

    static String getLikesFromPost(String[] nameList) {
        String firstName = "None";
        String secondName = "None";
        String thirdName = "None";
        switch (nameList.length) {
            case FIRST_CASE:
                String firstMessage = "No one likes this";
                return firstMessage;
            case SECOND_CASE:
                firstName = nameList[0];
                String second_message = firstName + " likes this";
                return second_message;
            case THIRD_CASE:
                firstName = nameList[0];
                secondName = nameList[1];
                String third_message = firstName + " and " + secondName + " like this";
                return third_message;
            case FOURTH_CASE:
                firstName = nameList[0];
                secondName = nameList[1];
                thirdName = nameList[2];
                String fourthMessage = firstName + ", " + secondName + " and " + thirdName + " like this";
                return fourthMessage;
            case FIFTH_CASE:
                firstName = nameList[0];
                secondName = nameList[1];
                int restOfNames = nameList.length - 2;
                String fifthMessage = firstName + ", " + secondName + " and " + restOfNames + " others like this";
                return fifthMessage;
            default:
                String noIndicator = "There is no a likes indicator";
                return noIndicator;
        }
    }
}

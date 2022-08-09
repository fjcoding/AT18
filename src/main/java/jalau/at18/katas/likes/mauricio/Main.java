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
        String first_name = "None";
        String second_name = "None";
        String third_name = "None";
        switch (nameList.length) {
            case FIRST_CASE:
                String first_message = "No one likes this";
                return first_message;
            case SECOND_CASE:
                first_name = nameList[0];
                String second_message = first_name + " likes this";
                return second_message;
            case THIRD_CASE:
                first_name = nameList[0];
                second_name = nameList[1];
                String third_message = first_name + " and " + second_name + " like this";
                return third_message;
            case FOURTH_CASE:
                first_name = nameList[0];
                second_name = nameList[1];
                third_name = nameList[2];
                String fourth_message = first_name + ", " + second_name + " and " + third_name + " like this";
                return fourth_message;
            case FIFTH_CASE:
                first_name = nameList[0];
                second_name = nameList[1];
                int rest_of_names = nameList.length - 2;
                String fifth_message = first_name + ", " + second_name + " and " + rest_of_names + " others like this";
                return fifth_message;
            default:
                String no_indicator = "There is no a likes indicator";
                return no_indicator;
        }
    }
}

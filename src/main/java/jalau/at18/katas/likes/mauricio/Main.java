package jalau.at18.katas.likes.mauricio;

public class Main {
    private static final int FIRST_CASE = 0;
    private static final int SECOND_CASE = 1;
    private static final int THIRD_CASE = 2;
    private static final int FOURTH_CASE = 3;
    private static final int FIFTH_CASE = 4;

    public static void main(String[] args) {
        String[] name_list = {"Carlos", "Alberto", "Karina", "Liz"};
        String first_name = "None";
        String second_name = "None";
        String third_name = "None";
        switch (name_list.length) {
            case FIRST_CASE:
                System.out.println("No one likes this");
                break;
            case SECOND_CASE:
                first_name = name_list[0];
                System.out.println(first_name + " likes this");
                break;
            case THIRD_CASE:
                first_name = name_list[0];
                second_name = name_list[1];
                System.out.println(first_name + " and " + second_name + " like this");
                break;
            case FOURTH_CASE:
                first_name = name_list[0];
                second_name = name_list[1];
                third_name = name_list[2];
                System.out.println(first_name + ", " + second_name + " and " + third_name + " like this");
                break;
            case FIFTH_CASE:
                first_name = name_list[0];
                second_name = name_list[1];
                int rest_of_names = name_list.length - 2;
                System.out.println(first_name + ", " + second_name + " and " + rest_of_names + " others like this");
                break;
            default:
                System.out.println("There is no a likes indicator");
                break;
        }
    }
}

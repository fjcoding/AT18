package jalau.at18.katas.likes.mauricio;

public class Main {
    public static void main(String[] args) {
        String name_list[] = { "Carlos", "Alberto", "Karina", "Liz" };
        String first_name = "None", second_name = "None", third_name = "None";
        switch (name_list.length) {
            case 0:
                System.out.println("No one likes this");
                break;
            case 1:
                first_name = name_list[0];
                System.out.println(first_name + " likes this");
                break;
            case 2:
                first_name = name_list[0];
                second_name = name_list[1];
                System.out.println(first_name + " and " + second_name + " like this");
                break;
            case 3:
                first_name = name_list[0];
                second_name = name_list[1];
                third_name = name_list[2];
                System.out.println(first_name + ", " + second_name + " and " + third_name + " like this");
                break;
            case 4:
                first_name = name_list[0];
                second_name = name_list[1];
                int rest_of_names = name_list.length - 2;
                System.out.println(first_name + ", " + second_name + " and " + rest_of_names + " others like this");
                break;
        }
    }
}

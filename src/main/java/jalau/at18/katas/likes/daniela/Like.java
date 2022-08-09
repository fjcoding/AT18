package jalau.at18.katas.likes.daniela;

public class Like {
    static void myLikes() {
        String[] names = {"Daniela", "Alejandra", "javier", "mayra" };
        int people = names.length;
        final int quantity1 = 1;
        final int quantity2 = 2;
        final int quantity3 = 3;
        final int quantity = 0;
        final int quantity4 = 4;
        if (people > quantity) {
            int total_people = names.length;
            if (total_people == quantity1) {
                System.out.println(names + "like this");
            }
            if (total_people == quantity2) {
                System.out.println(
                        names[total_people - quantity1] + " " + "and" + " "
                                + names[total_people - quantity2] + " "
                                + "like this");
            }
            if (total_people == quantity3) {
                System.out.println(names[total_people - quantity3] + " " + "," + " "
                        + names[total_people - quantity2] + "and" + names[total_people - quantity1]
                        + "like this");
            }
            if (total_people >= quantity4) {
                int extra = total_people - 2;
                System.out.println(
                        names[total_people - quantity3] + ", " + names[total_people - quantity2]
                                + " " + "and" + " "
                                + extra + " " + "others likes this");
            }
            if (total_people == quantity) {
                System.out.println("No body likes this");
            }
        }
    }

    public static void main(String[] args) {
        myLikes();
    }
}

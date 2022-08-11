package jalau.at18.katas.likes.daniela;

public class Like {
    public static String myLikes(String[] names) {
        //String[] names = {"Daniela", "Alejandra", "javier", "mayra" };
        int people = names.length;
        final int quantity1 = 1;
        final int quantity2 = 2;
        final int quantity3 = 3;
        final int quantity = 0;
        final int quantity4 = 4;
        String end = "complete execute";
        String text = "";
        if (people > quantity) {
            int total_people = names.length;
            if (total_people == quantity1) {
                text = text + " " + "like this";
            }
            if (total_people == quantity2) {
                text = names[total_people - quantity2] + " " + "and" + " "
                                + names[total_people - quantity1] + " "
                                + "likes this";
            }
            if (total_people == quantity3) {
                text = names[total_people - quantity3] + "," + " "
                        + names[total_people - quantity2] + " " + "and" + " " + names[total_people - quantity1]
                        + " " + "likes this";
            }
            if (total_people >= quantity4) {
                int extra = total_people - 2;
                text = names[total_people - quantity4] + "," + " " + names[total_people - quantity3]
                                + " " + "and" + " "
                                + extra + " " + "others likes this";
            }
        else if (people == quantity) {
                text = "No body likes this";
            }
        }
        return text;
    }

    public static void main(String[] args) {
        String[] names = {"Daniela", "Alejandra", "javier", "mayra" };
        System.out.println(myLikes(names));
    }
}

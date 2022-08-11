package jalau.at18.katas.likes.daniela;

public class Like {
    public static String myLikes(String[] names) {
        // String[] names = {"Daniela", "Alejandra", "javier", "mayra" };
        int people = names.length;
        final int quantity1 = 1;
        final int quantity2 = 2;
        final int quantity3 = 3;
        final int quantity = 0;
        final int quantity4 = 4;
        String end = "complete execute";
        String text = "";
        if (people == quantity) {
            text = "No body like this";
        } else {
            for (int count = 0; count < people; count++) {
                if (count == 0) {
                    text = names[count];
                } else {
                    if (people == quantity2) {
                        text = names[people - quantity2] + " " + "and" + " "
                                + names[people - quantity1] + " " + "likes this";
                    }
                    if (people == quantity3) {
                        text = names[people - quantity3] + "," + " "
                                + names[people - quantity2] + " " + "and" + " " + names[people - quantity1]
                                + " " + "likes this";
                    }
                    if (people >= quantity4) {
                        int extra = people - 2;
                        text = names[people - quantity4] + "," + " " + names[people - quantity3]
                                + " " + "and" + " "
                                + extra + " " + "others likes this";
                    }
                }
            }
        }

        if (people == 1) {
            text = text + " " + "likes this";
        } /*else {
            text = text + "likes this";
        }*/
        return text;
    }
    public static void main(String[] args) {
        String[] names = {"Daniela", "Alejandra", "javier", "mayra" };
        System.out.println(myLikes(names));
    }
}
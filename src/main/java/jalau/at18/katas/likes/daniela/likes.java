package jalau.at18.katas.likes.daniela;

public class likes {

    static void LikesFuntion() {
        String[] nombres = { "Daniela", "Alejandra", "javier", "mayra" };
        int personas = nombres.length;
        if (personas > 0) {
            int cantidad_de_personas = nombres.length;
            if (cantidad_de_personas == 1) {
                System.out.println(nombres + "like this");}
            if (cantidad_de_personas == 2) {
                System.out.println(
                        nombres[cantidad_de_personas - 1] + " " + "and" + " " + nombres[cantidad_de_personas - 2] + " "+"like this");}
            if (cantidad_de_personas == 3) {
                System.out.println(nombres[cantidad_de_personas - 3] + " " + "," + " "
                        + nombres[cantidad_de_personas - 2] + "and" + nombres[cantidad_de_personas - 1] + "like this");}
            if (cantidad_de_personas >= 4) {
                int extras = cantidad_de_personas - 2;
                System.out.println(
                        nombres[cantidad_de_personas - 3] + ", " + nombres[cantidad_de_personas - 2] + " " + "and" + " "
                                + extras + " " + "others likes this");}
            if (cantidad_de_personas == 0) {
                System.out.println("No body likes this");}
        }
    }

    public static void main(String[] args) {
        LikesFuntion();

    }

}

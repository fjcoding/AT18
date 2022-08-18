package jalau.at18.battlecity;

public class Main {
    public static void main(String[] arg) {
        Brick completeBrick = new Brick();
        Ice ice = new Ice();
        Water water = new Water();
        Bushes bushes = new Bushes();

        Element[][] matrix1 = {{completeBrick, ice}, {water, bushes}};

        for (int row = 0; row < matrix1.length; row++) {
            for (int column = 0; column < matrix1.length; column++) {
                System.out.print(matrix1[row][column].getImage() + " ");
            }
            System.out.println();
        }

    }

}

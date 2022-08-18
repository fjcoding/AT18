package jalau.at18.battlecity;

public class Main {
    public static void main(String[] arg) {
        CompleteBrick completeBrick = new CompleteBrick();
        LeftBrick leftBrick = new LeftBrick();
        LeftSteal leftSteal = new LeftSteal();
        Bushes bushes = new Bushes();

        Element[][] matrix1 = {{completeBrick, leftBrick}, {leftSteal, bushes}};

        for (int row = 0; row < matrix1.length; row++) {
            for (int column = 0; column < matrix1.length; column++) {
                System.out.print(matrix1[row][column].getImage() + " ");
            }
            System.out.println();
        }

    }

}

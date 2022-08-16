package jalau.at18.spaceinvaders;

public class Board {
    private char[][] matrix;
    
    public Board(){
        matrix = new char[10][10];
        initialize();
    }

    private void initialize(){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = '*';
            }
        }
    }

    @Override
    public String toString(){
        String showBoard = "";
        showBoard += "-----------------------" + "\n";
        for (int i = 0; i < matrix.length; i++) {
            showBoard += "| ";
            for (int j = 0; j < matrix.length; j++) {
                showBoard += matrix[i][j] + " ";
            }
            showBoard += "|" + "\n";
        }
        showBoard += "-----------------------" + "\n";
        return showBoard;
    }

    public void setElement(int posX, int posY, char newContent){
        matrix[posX][posY] = newContent;
    }

    public char[][] getMatrix(){
        return matrix;
    }
}

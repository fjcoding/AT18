package jalau.at18.katas.game2048.team2;

import java.util.Random;
//import java.util.Vector;

//import javax.swing.text.Position;

//2 clases una de jugador y de tablero
//Array de 2 dimensiones
//funcion de movimientos validos
//Casillas vacias y con eso limitar los movimientos
//Variable score
//Crear sumatoria de variables iguales
//Solo la posición es random y el numero aparece es siempre el 2
//public static final position1 = 0;
public class Board {
    public int[][] board;
    public int score;
    public int sizeBoard;
    public final int tokenInitial = 2;
    public final int tokenSecond = 2;
    public final int size = 4;

    public Board(int sizeBoard, int score) {
        this.sizeBoard = sizeBoard;
        this.score = score;
        score = 0;
        board = new int[4][4];
        createTable();
    }

    public void showTable() {
        for (int indexRows = 0; indexRows < size; indexRows++) {
            for (int indexColumns = 0; indexColumns < size; indexColumns++) {
                System.out.print(board[indexRows][indexColumns] + " ");
            }
            System.out.println();
        }
    }

    public void createTable() {
        for (int indexRows = 0; indexRows < size; indexRows++) {
            for (int indexColumns = 0; indexColumns < size; indexColumns++) {
                board[indexRows][indexColumns] = 0;
            }
        }
    }

    public int getPosition(int x, int y) {
        return board[x][y];
    }

    public boolean isValidThePosition(int x, int y) {
        if (board[x][y] == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void replacePositions(int position1, int Position2, int number) {

        if (board[position1][Position2] == 0) {
            board[position1][Position2] = number;
        }
    }

    public void moveNumberUp(char direction) {

        if (direction == 'w') {
            for(int col=0;col<4;col++){
                int count=0;
                for(int row=0;row<4;row++) {
                   if(board[row][col]!=0) {
                        board[0+count][col]=board[row][col];

                        if(0+count!=row) {
                            board[row][col]=0;
                        }
                            count++;
                        }

                }

             }

            for(int col=0;col<4;col++) {
                for(int row=0;row<4-1;row++) {
                    if(board[row][col]==board[row+1][col]) {
                        board[row][col]+=board[row+1][col];
                        board[row+1][col]=0;
                        break;

                   }
                }
            }
            for(int col=0;col<4;col++) {

                int count=0;
                for(int row=0;row<4;row++) {
                    if(board[row][col]!=0) {
                        board[0+count][col]=board[row][col];

                        if(0+count!=row) {
                            board[row][col]=0;
                        }
                        count++;
                    }
                }

            }


        }
    }


    public void moveNumberR(char direction) {

        if (direction == 'd') {
            for(int row=0;row<4;row++){
                int count=0;
                for(int col=4-1;col>=0;col--) {

                    if(board[row][col]!=0) {
                        board[row][4-1-count]=board[row][col];
                        if(4-1-count!=col) {
                            board[row][col]=0;
                        }
                    count++;
                    }

                }

             }

            for(int row=0;row<4;row++) {
                for(int col=4-1;col>0;col--) {
                    if(board[row][col]==board[row][col-1]) {
                        board[row][col]+=board[row][col-1];
                        board[row][col-1]=0;
                        break;
                    }
                }
            }
            for(int row=0;row<4;row++){
                    int count=0;

                    for(int col=4-1;col>=0;col--)
                    {
                       if(board[row][col]!=0)
                       {   board[row][4-1-count]=board[row][col];
                          //empty the original tile position after tile is moved
                          if(4-1-count!=col)
                          { board[row][col]=0;}
                          count++;}

                    }

            }

        }
    }

    public void moveNumberL(char direction) {

        if (direction == 'a') {
            for(int row=0;row<4;row++) {
                int count=0;
                for(int col=0;col<4;col++) {
                   if(board[row][col]!=0) {

                    board[row][0+count]=board[row][col];
                    if(0+count!=col) {
                        board[row][col]=0;}
                        count++;
                    }
                }

             }

            for(int row=0;row<4;row++) {
                for(int col=0;col<4-1;col++) {
                    if(board[row][col]==board[row][col+1]) {
                        board[row][col]+=board[row][col+1];
                        board[row][col+1]=0;
                        break;

                   }
                }
            }
            for(int row=0;row<4;row++) {
                int count=0;
                for(int col=0;col<4;col++) {

                    if(board[row][col]!=0) {
                        board[row][0+count]=board[row][col];
                        if(0+count!=col) {
                            board[row][col]=0;}
                            count++;}
                    }

                 }

    }
    }

    public void MoveNumberD(char direction) {
        int cont = 0;
        if (direction == 's') {

            for(int col=0;col<4;col++){
                int count=0;
                for(int row=4-1;row>=0;row--) {
                   if(board[row][col]!=0) {
                    board[4-1-count][col]=board[row][col];
                    if(4-1-count!=row) {

                        board[row][col]=0;}
                        count++;
                    }

                }

             }
             //sumar
            for(int col=0;col<4;col++) {
                for(int row=4-1;row>0;row--) {
                    if(board[row][col]==board[row-1][col]) {
                        board[row][col]+=board[row-1][col];
                        board[row-1][col]=0;
                        break;

                   }
                }
                }
            for(int col=0;col<4;col++) {

                int count=0;
                for(int row=4-1;row>=0;row--) {

                       if(board[row][col]!=0) {
                        board[4-1-count][col]=board[row][col];
                        if(4-1-count!=row) {

                        board[row][col]=0;}
                        count++;}

                    }

                 }
        }

    }

}

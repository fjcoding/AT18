package jalau.at18.katas.game2048.team2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);

        while(true)
        {   System.out.println("ingrese 's' para iniciar el juego o 'n' para cerrar ");
            char letra = scanner.next().charAt(0);

            if(letra=='s'){
                Board board = new Board(4, 0);
                board.createTable();
                board.showTable();
                board.generateTokens();
            }
            else 
            {
                break;              
            }
        }
        
        
    }
}

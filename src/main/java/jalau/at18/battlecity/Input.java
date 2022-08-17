package jalau.at18.battlecity;

import java.util.Scanner;

public class Input {
    private Scanner scan;
    private TankPlayer tankOne;

    public Input() {
        this.scan = new Scanner(System.in);
        this.tankOne = new TankPlayer();
    }

    public String read (){
         this.tankOne.setMove(scan.nextLine());
    }


    public void finish(){
        scan.close();
    }
}

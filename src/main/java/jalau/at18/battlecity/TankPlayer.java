package jalau.at18.battlecity;

public class TankPlayer {
    private String direction;
    private int [] frontPosition;
    private int [] backPosition;


    public TankPlayer(){
        this.frontPosition = new int [] {10, 25, 11, 25};
        this.backPosition = new int [] {10, 26, 11, 26};

    }

    public void setMove(String direction){
        this.direction = direction;
    }

    public void movement(){
        if(this.direction.equals("w")){

        }
        if(this.direction.equals("s")){

        }
        if(this.direction.equals("a")){

        }
        if(this.direction.equals("d")){

        }
    }

    public int [][] moveUp(String direction){
        this.frontPosition = new int [] {10, (this.frontPosition[1] - 1), 11, (this.frontPosition[3] - 1)};
        this.backPosition = new int [] {10, (this.backPosition[1] - 1), 11, (this.backPosition[3] - 1)};

    }
}

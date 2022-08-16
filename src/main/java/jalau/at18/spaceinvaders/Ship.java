package jalau.at18.spaceinvaders;

public class Ship {
    private int lifes = 3;
    private int posX;
    private int posY;

    public Ship(){

    }

    public void setLifes(int updateLifes){
        lifes= updateLifes;
    }

    public void setPosX(int newPosition){
        posX = newPosition;
    }

    public int getLifes(){
        return lifes;
    }

    public int getPosX(){
        return posX;
    }

    public int getPosY(){
        return posY;
    }
}

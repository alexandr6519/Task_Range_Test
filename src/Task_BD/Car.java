package Task_BD;

public class Car {
    private String color;
    private int doorCount;
    private int speed;

    public Car (String color, int doorCount, int speed){
        this.color = color;
        this.doorCount = doorCount;
        this.speed = speed;
    }

    public String getColor(){
        return color;
    }

    public int getDoorCount(){
        return doorCount;
    }

    public int getSpeed(){
        return speed;
    }
}

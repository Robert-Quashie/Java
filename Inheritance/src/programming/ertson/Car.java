package programming.ertson;

public class Car extends Vehicle{
    String color;
    public Car( int numberOfDoors, int numberOfSeat,String color) {
        super(4, numberOfDoors, numberOfSeat);
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void speed(String speedValue){
        super.changingGears(speedValue);
    }
}

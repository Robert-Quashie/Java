package programming.ertson;

public class Car extends Vehicle{
    private int doors;
    private int engineCapacity;
    public Car(String name,int door, int engineCapacity){
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}

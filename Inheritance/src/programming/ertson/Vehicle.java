package programming.ertson;

public class Vehicle {
    private int numberOfTires;
    private int numberOfDoors;
    private int numberOfSeat;

    public Vehicle(int numberOfTires,int numberOfDoors,int numberOfSeat ){
        this.numberOfTires = numberOfTires;
        this.numberOfDoors = numberOfDoors;
        this.numberOfSeat = numberOfSeat;
    }
    public int getNumberOfTires(){
        return numberOfTires;
    }
    public int getNumberOfDoors(){
        return numberOfDoors;
    }
   public int getNumberOfSeat(){
        return  numberOfSeat;
   }

//   Handling the steering wheel
   public void validateSteering(String answer){
        String toLowerCase = answer.toLowerCase();
        if(toLowerCase.equals("yes") || toLowerCase.equals("true")){
            System.out.println(handSteering());
        }else{
            System.out.println("hand steering not in session");
            System.out.println("Please fix your hand behind the wheels");
        }

   }
   private String handSteering(){
        return "Hand steering in action";
   }
//   Controlling gears
    public void changingGears(String gearPositionValue){
        switch (gearPositionValue){
            case "1":
                System.out.println("Gears changed to " + gearPositionValue);
                System.out.println("Vehicle is moving at a 1km/5h");
                break;
            case "2":
                System.out.println("Gears changed to " + gearPositionValue);
                System.out.println("Vehicle is moving at a 1km/2hr");
                break;
            case "3":
                System.out.println("Gears changed to " + gearPositionValue);
                System.out.println("Vehicle is moving at a 1km/3h");
                break;
            case "D":
                System.out.println("Gears changed to " + gearPositionValue);
                System.out.println("Vehicle is Automatic,hence in drive mode");
                break;
            case "R":
                System.out.println("Gears changed to " + gearPositionValue);
                System.out.println("Vehicle is is Automatic,hence in reverse mode");
                break;
            default:
                System.out.println("Gears not changed");
                System.out.println("********** parking mode detected******");
        }

    }
}

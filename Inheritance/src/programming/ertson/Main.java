package programming.ertson;

public class Main {

    public static void main(String[] args) {
//	Vehicle car1 = new Vehicle(4,4,4);
//	car1.validateSteering("no");
//
//        System.out.println("Test for yes answer");
//        car1.validateSteering("Yes");
//        System.out.println(car1.getNumberOfDoors());
//        car1.changingGears("2");
        System.out.println("Benz creation");
        Car benz = new Car(4,4,"white");
        benz.speed("D");
        System.out.println("Ford 1 creation");
        Ford ford1 = new Ford(4,4,"gray");
        ford1.speed("R");
    }
}

package programming.ertson;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("201G","Dell",dimensions,250);

        Monitor theMonitor = new Monitor("rsi beast","Acer",5,new Resolution(5,5));
        MotherBoard theMotherBoard = new MotherBoard("intel j7","Asus",4,6,"v3.1");

        PC thePC = new PC(theCase,theMonitor,theMotherBoard);

      thePC.powerUp();
    }
}

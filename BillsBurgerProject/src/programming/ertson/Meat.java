package programming.ertson;

public class Meat {
    private boolean meat;
    public int meatPrice;

    public Meat(boolean meat) {
        this.meat = meat;
        if(meat){
            this.meatPrice = 10;
        }
    }
}

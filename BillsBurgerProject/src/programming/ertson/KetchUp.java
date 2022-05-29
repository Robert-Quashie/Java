package programming.ertson;

public class KetchUp {
    private boolean addKetchUp;
    public int ketchUpPrice;

    public KetchUp(boolean addKetchUp) {
        this.addKetchUp = addKetchUp;
        if(addKetchUp){
            this.ketchUpPrice = 10;
        }
    }
}

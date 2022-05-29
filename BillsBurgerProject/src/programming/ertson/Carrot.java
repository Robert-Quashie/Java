package programming.ertson;

public class Carrot {
    private boolean addCarrot;
    public int carrotPrice;

    public Carrot(boolean addCarrot) {
        this.addCarrot = addCarrot;
        if(addCarrot){
            this.carrotPrice = 10;
        }

    }
}

package programming.ertson;

public class Lettuce {
    private boolean addLettuce;
    public int lettucePrice;

    public Lettuce(boolean addLettuce) {
        this.addLettuce = addLettuce;
        if(addLettuce){
            this.lettucePrice = 10;
        }
    }
}

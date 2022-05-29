package programming.ertson;

public class Tomato {
    private boolean addTomato;
    public int tomatoPrice;
    public Tomato(boolean addTomato) {
        this.addTomato = addTomato;
        if(addTomato){
            this.tomatoPrice = 10;
        }
    }
}

package programming.ertson;

public class HealthyBurger extends Hamburger{
    private boolean beef;
    private boolean cheese;
    private int beefPrice;
    private int cheesePrice;
    private int breadRollPrice;
    public HealthyBurger( BreadRoll breadRoll, Meat meat,boolean beef, boolean cheese) {
        super("Healthy Burger",breadRoll,meat);
        this.breadRollPrice = 10;
        if(beef){
            beefPrice = 10;
        }
        if(cheese){
            cheesePrice = 10;
        }
    }


    public boolean isBeef() {

        return beef;
    }

    public boolean isCheese() {
        return cheese;
    }

    @Override
    public void totalBurgerPrice() {
        int healthyBurgerPrice = burgerBasePrice + beefPrice + cheesePrice + breadRollPrice;
        System.out.println("Total Healthy Burger Price is Ghc"+ healthyBurgerPrice);

    }
}

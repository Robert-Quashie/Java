package programming.ertson;

public class Deluxe extends Hamburger{
    private boolean chips;
    private boolean drinks;
    private int chipsPrice = 10;
    private int drinksPrice = 10;
    public Deluxe() {
        super("Deluxe Hamburger", new BreadRoll("Deluxe bread Roll"), new Meat(false));
        this.chips = true;
        this.drinks = true;
    }

    @Override
    public void totalBurgerPrice() {
        int totalDeluxePrice = burgerBasePrice + chipsPrice + drinksPrice;
        System.out.println("Total Deluxe price is Ghc" + totalDeluxePrice);
    }
}

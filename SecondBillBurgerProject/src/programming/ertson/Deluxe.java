package programming.ertson;

public class Deluxe extends Hamburger{
   private String chips;
   private double chipsPrice;
   private String drink;
   private double drinkPrice;
   private double price;

    public Deluxe(double price, String breadRollType, String meat) {
        super(price, "Deluxe", breadRollType, meat);
        drink = "Drink";
        drinkPrice =  2.50;
        chips = "chips";
        chipsPrice  = 1.70;
        this.price = price;
    }

    @Override
    public double getTotalPrice() {
        totalPrice = chipsPrice + drinkPrice + price ;
        System.out.println("Total price of deluxe is $ " + totalPrice);
        return totalPrice;

    }
}

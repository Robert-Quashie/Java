package programming.ertson;

public class Hamburger {
    private String name;
    private BreadRoll breadRoll;
    private Lettuce lettuce;
    private Tomato tomato;
    private Carrot carrot;
    private KetchUp ketchup;
    private Meat meat;
    public final int burgerBasePrice = 30;

    public Hamburger(String name,BreadRoll breadRoll, Meat meat) {
        this.name = name;
        this.breadRoll = breadRoll;
        this.meat = meat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreadRoll(BreadRoll breadRoll) {
        this.breadRoll = breadRoll;
    }

    public void setLettuce(Lettuce lettuce) {
        this.lettuce = lettuce;
    }

    public void setTomato(Tomato tomato) {
        this.tomato = tomato;
    }

    public void setCarrot(Carrot carrot) {
        this.carrot = carrot;
    }

    public void setKetchup(KetchUp ketchup) {
        this.ketchup = ketchup;
    }

    public void setMeat(Meat meat) {
        this.meat = meat;
    }

    public BreadRoll getBreadRoll() {
        return breadRoll;
    }

    public Lettuce getLettuce() {
        return lettuce;
    }

    public Tomato getTomato() {
        return tomato;
    }

    public Carrot getCarrot() {
        return carrot;
    }

    public KetchUp getKetchup() {
        return ketchup;
    }

    public Meat getMeat() {
        return meat;
    }

    public void totalBurgerPrice(){
        int addOnPrices = getMeat().meatPrice +getBreadRoll().breadRollPrice + getCarrot().carrotPrice + getKetchup().ketchUpPrice + getLettuce().lettucePrice + getTomato().tomatoPrice;
        int totalPrice = burgerBasePrice + addOnPrices;
        System.out.println("Add on  price is Ghc"+ addOnPrices );
        System.out.println("Total cost of Burger ordered is Ghc"+ totalPrice);

    }

}

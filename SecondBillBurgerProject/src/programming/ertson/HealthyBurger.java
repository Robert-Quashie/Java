package programming.ertson;

public class HealthyBurger extends Hamburger{
    private String additionalItem5;
    private double additionalItem5Price;
    private String additionalItem6;
    private double additionalItem6Price;
    public HealthyBurger(double price, String meat) {
        super(price, "Healthy Burger", "Brown rye bread roll", meat);
    }

    public void addItem5(String additionalItem5, double additionalItem5Price) {
//        super.addItem5(additionalItem5, additionalItem5Price);
        if(additionalItem5 != null){
            this.additionalItem5 = additionalItem5;
            this.additionalItem5Price = additionalItem5Price;
            System.out.println("Additional item #5 " + "\n" + "name: " + additionalItem5 + " ...........Price: "+ additionalItem5Price );
            totalPrice += additionalItem5Price;
        }

    }

    public void addItem6(String additionalItem6, double additionalItem6Price) {
//        super.addItem6(additionalItem6, additionalItem6Price);
        if(additionalItem6 != null){
            this.additionalItem6 = additionalItem6;
            this.additionalItem6Price = additionalItem6Price;
            System.out.println("Additional item #6 " + "\n" + "name: " + additionalItem6 + " ...........Price: "+ additionalItem6Price );
            totalPrice += additionalItem6Price;
        }

    }

    @Override
    public double getTotalPrice() {
//        super.getTotalPrice();
        System.out.println("Total price of healthy Hamburger is $" + totalPrice);
        return totalPrice;
    }
}

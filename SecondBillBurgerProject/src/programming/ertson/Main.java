package programming.ertson;

public class Main {

    public static void main(String[] args) {
	Hamburger base = new Hamburger(3.40,"taste great","Taste bread","Beef");
	base.addItem1("tomato",1.50);
	base.addItem2("carrot",1.10);
	base.getTotalPrice();

//	HealthyBurger newHealthyBurger  = new HealthyBurger(4.0,"sausage");
//	newHealthyBurger.addItem1("carrot",1.1);
//	newHealthyBurger.addItem2("fish",2.4);
//	newHealthyBurger.addItem6("spring onion",1.9);
//	newHealthyBurger.getTotalPrice();
//
//
//
//		Deluxe deluxe = new Deluxe(3.5,"BREAD","meat");
//		deluxe.getTotalPrice();

    }
}
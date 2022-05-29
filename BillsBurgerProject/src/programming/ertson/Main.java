package programming.ertson;

public class Main {

    public static void main(String[] args) {
//    HealthyBurger burger = new HealthyBurger("Swiss",new BreadRoll("Swiss bread"),new Meat(true));
//    burger.isCheese();
//    burger.isBeef();
//    burger.totalBurgerPrice();

        Hamburger japan = new Hamburger("Japan",new BreadRoll("JP bread"),new Meat(true));
        japan.setCarrot(new Carrot(true));
        japan.setLettuce(new Lettuce(true));
        japan.setTomato(new Tomato(true));
        japan.setKetchup(new KetchUp(true));
        japan.totalBurgerPrice();

        System.out.println("*************************************");
        HealthyBurger healthyBurger = new HealthyBurger(new BreadRoll("healthy bread roll"),new Meat(true),true,true);
        healthyBurger.totalBurgerPrice();

        System.out.println("***********************************************");
        Deluxe frenchDeluxe = new Deluxe();
        frenchDeluxe.totalBurgerPrice();
    }

}

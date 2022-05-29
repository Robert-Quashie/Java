package programming.ertson;

//import javax.lang.model.type.NullType;

public class Hamburger {
    private double price;
    private  String name;
    private String breadRollType;
    private String meat;
    private String additionalItem1;
    private double additionalItem1Price;
    private String additionalItem2;
    private double additionalItem2Price;
    private String additionalItem3;
    private double additionalItem3Price;
    private String additionalItem4;
    private double additionalItem4Price;
    public double totalPrice;

    public Hamburger(double price, String name, String breadRollType, String meat) {
        this.price = price;
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.totalPrice += price;
    }


    public void addItem1 (String additionalItem1, double additionalItem1Price){
        if(additionalItem1 != null){
            this.additionalItem1 = additionalItem1;
            this.additionalItem1Price = additionalItem1Price;
            System.out.println("Additional item #1 " + "\n" + "name: " + additionalItem1 + " ............Price: "+ additionalItem1Price );
            totalPrice += additionalItem1Price;
        }

    }

    public void addItem2 (String additionalItem2,double additionalItem2Price){
        if(additionalItem2 != null){
            this.additionalItem2 = additionalItem2;
            this.additionalItem2Price = additionalItem2Price;
            System.out.println("Additional item #2 " + "\n" + "name: " + additionalItem2 + " .............Price: "+ additionalItem2Price );
            totalPrice += additionalItem2Price;
        }

    }

    public void addItem3 (String additionalItem3,double additionalItem3Price){
        if(additionalItem3 != null){
            this.additionalItem3 = additionalItem3;
            this.additionalItem3Price = additionalItem3Price;
            System.out.println("Additional item #3 " + "\n" + "name: " + additionalItem3 + " ...........Price: "+ additionalItem3Price );
            totalPrice += additionalItem3Price;
        }

    }

    public void addItem4 (String additionalItem4,double additionalItem4Price){
        if(additionalItem4 != null){
            this.additionalItem4 = additionalItem4;
            this.additionalItem4Price = additionalItem4Price;
            System.out.println("Additional item #4 " + "\n" + "name: " + additionalItem4 + " .........Price: "+ additionalItem4Price );
            totalPrice += additionalItem4Price;
        }

    }

    public double getTotalPrice(){
        System.out.println("Total price of " + name + " Hamburger is $" + totalPrice);
        return totalPrice;
    }



}

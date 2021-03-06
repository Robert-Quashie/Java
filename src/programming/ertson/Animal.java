package programming.ertson;

public class Animal {
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;
//    creating constructor
    public Animal(String name,int brain,int body, int size,int weight){
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void eat(){
        System.out.println("Animal.eat() called");
    }
    public String getName(){
        return this.name;
    }
    public int getBrain(){
        return this.brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}

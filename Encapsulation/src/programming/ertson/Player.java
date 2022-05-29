package programming.ertson;

public class Player {
    public String name;
    public String weapon;
    public int health;

    public void loseHealth(int damage){
        this.health -= damage;
        if(this.health <= 0){
            System.out.println("Player " + name + " knocked out");
        }
    }
    public int remainingHealth(){
        return this.health;
    }
}

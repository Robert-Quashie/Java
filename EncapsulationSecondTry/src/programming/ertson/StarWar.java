package programming.ertson;

public class StarWar extends Movie{
    public StarWar() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over the universe";
    }
}

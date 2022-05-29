package programming.ertson;

public class Main {

    public static void main(String[] args) {
	for(int i = 0;i < 11; i++){
	    Movie movie = randomMovie();
        System.out.println("Movie#" + i + ": " + movie.getName() + "\n" +
                "Plot: " + movie.plot());
    }
    }
    public static Movie randomMovie(){
        int randomNumber = (int)(Math.random()* 5) + 1;
        System.out.println("Random number generated = " + randomNumber);
        switch(randomNumber){
            case 1:
                return new Jaw();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWar();
            case 5:
                return new Forgettable();
        }
        return null;
    }
}

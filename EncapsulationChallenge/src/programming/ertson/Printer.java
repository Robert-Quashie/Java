package programming.ertson;

public class Printer {
    private int tonerLevel;
    private boolean duplex;
    private int numberOfPagesPrinted;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel > -1 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }else{
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
    }
    public int fillUpToner(int value) {
        if( value > 0 && value <= 100){
            if(tonerLevel + value <= 100){
                tonerLevel += value;
            }
        }else{
            value = -1;
        }
        return tonerLevel;
    }

    public void numberOfPages(int number){
        int numberOfPages;
        if(duplex){
            numberOfPages = (number / 2) + (number % 2);
            System.out.println("Printing in duplex mode");
            System.out.println("Printing "+ numberOfPages + " pages");
            numberOfPagesPrinted += numberOfPages;
        }else{
            numberOfPages = number;
            System.out.println("Printing "+ numberOfPages + " pages");
            numberOfPagesPrinted += numberOfPages;
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }
}

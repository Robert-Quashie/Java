package programming.ertson;

public class Main {

    public static void main(String[] args) {
    Printer printer = new Printer(10,false);
        System.out.println("Toner level = "+ printer.getTonerLevel());

        printer.fillUpToner(50);
        System.out.println("Toner level = "+ printer.getTonerLevel());

        printer.numberOfPages(5);
//        System.out.println(printer.getNumberOfPagesPrinted());


    }
}

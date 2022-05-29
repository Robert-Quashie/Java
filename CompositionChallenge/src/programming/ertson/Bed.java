package programming.ertson;

public class Bed {
    private int bedSize;
    private boolean isBedLaid;
    private int number_of_pillow;
    private String colorOfBedSheet;

    public Bed(int bedSize, boolean isBedLaid, int number_of_pillow,String colorOfBedSheet) {
        this.bedSize = bedSize;
        this.isBedLaid = isBedLaid;
        this.number_of_pillow = number_of_pillow;
        this.colorOfBedSheet = colorOfBedSheet;
    }
    private void changeBedSheet(){
        System.out.println("Bed sheet must be changed after every 24 hours ");
    }
    public void colorOfBedSheet(){
        if(this.colorOfBedSheet.equals("White")){
            changeBedSheet();
        }
    }

    public int getBedSize() {
        return bedSize;
    }

    public boolean isBedLaid() {
        return isBedLaid;
    }

    public int getNumber_of_pillow() {
        return number_of_pillow;
    }
}

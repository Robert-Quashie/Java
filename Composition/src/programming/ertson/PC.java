package programming.ertson;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PC(Case theCase, Monitor monitor, MotherBoard motherBoard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }
    public void powerUp(){
        theCase.pressPowerSwitch();
        theLogo();
    }
    private void theLogo (){
        monitor.drawPixelAt(500,300,"yellow");
    }
}

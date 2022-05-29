package programming.ertson;

public class House {
    private Bed bed;
    private Floor floor;
    private Ceiling ceiling;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;

    public House(Bed bed, Floor floor, Ceiling ceiling, Wall wall1, Wall wall2, Wall wall3, Wall wall4) {
        this.bed = bed;
        this.floor = floor;
        this.ceiling = ceiling;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
    }

    public Bed getBed() {
        return bed;
    }

    public Floor getFloor() {
        return floor;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall4() {
        return wall4;
    }
}

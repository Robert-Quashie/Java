package programming.ertson;

public class Main {

    public static void main(String[] args) {
        Bed bed = new Bed(30,true,3,"White");
        Floor floor = new Floor("Tiled");
        Ceiling ceiling = new Ceiling("gray",true,true);
        Wall wall1 = new Wall(20,"north",15);
        Wall wall2 = new Wall(20,"south",15);
        Wall wall3 = new Wall(20,"west",15);
        Wall wall4 = new Wall(20,"east",15);

        House oneBedRoomHouse = new House(bed,floor,ceiling,wall1,wall2,wall3,wall4);
        oneBedRoomHouse.getBed().colorOfBedSheet();
        oneBedRoomHouse.getWall1().lightSwitchOn(1);



        
    }
}

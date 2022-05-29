package programming.ertson;

public class Wall {
    private int height;
    private String direction;
    private int width;

    public Wall(int height, String direction, int width) {
        this.height = height;
        this.direction = direction;
        this.width = width;
    }
    public void lightSwitchOn (int lightValue) {
        switch (lightValue) {
            case 1:
                System.out.println("Switch power turned On");
                System.out.println("Light On");
                break;
            case 2:
                System.out.println("Switch power turned off");
                System.out.println("Light Off");
                break;
            default:
                System.out.println("Faulty switch hence failed input value");
        }
    }
    public int getHeight() {
        return height;
    }

    public String getDirection() {
        return direction;
    }

    public int getWidth() {
        return width;
    }
}

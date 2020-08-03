package Task4Interface;

public class Train extends Vehicle implements Driveable{
    private String name;
    private String color;

    public Train(String name) {
        this.name = name;
    }

    public Train(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Train() {
    }

    public void drive() {

    }
}

package Task4Interface;

public class Boat extends Vehicle implements Swimable, Driveable{
    private String name;
    private String color;

    public Boat(String name) {
        this.name = name;
    }

    public Boat(String name, String color) {
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

    public Boat() {
    }

    public void swim() {

    }

    public void drive() {

    }
}

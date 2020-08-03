package Task4Interface;

public class Bike extends Vehicle implements Rideable, Driveable{
    private String name;
    private String color;

    public Bike(String name) {
        super();
        this.name = name;
    }

    public Bike(String name, String color) {
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

    public Bike() {
    }

    public void ride() {

    }

    public void drive() {

    }
}

package Task4Interface;

public class Car<color> extends Vehicle implements Driveable, Rideable{
    private String name;
    private String color;

    public Car(String name) {
        this.name = name;
    }

    public Car(String name, String color) {
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

    public Car() {
    }

    public void drive() {

    }

    public void ride() {

    }
}

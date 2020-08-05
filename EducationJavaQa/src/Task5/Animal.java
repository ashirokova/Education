package Task5;

public class Animal {

    private String name;
    private Integer age;
    private String color;

    public Animal(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String toString() {
        return  "Name='" + name + '\'' +
                ", Age=" + age +
                ", Color='" + color + '\'';
    }
}

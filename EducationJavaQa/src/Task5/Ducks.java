package Task5;

public class Ducks extends Animal {
    private String sex;



    public Ducks(String name, int age, String sex, String color) {
        super(name, age, color);
        this.sex=sex;
    }

    public Ducks(String huey, int i, String sex) {
        super(huey, i, sex);
        this.sex=sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    public String toString() {
        return  "Name='" + getName() + '\'' +
                ", Age=" + getAge() +
                ", Sex='" + sex + '\'';
    }
}

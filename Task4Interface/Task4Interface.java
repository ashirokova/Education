package Task4Interface;

import javax.xml.namespace.QName;

public class Task4Interface {

        public static void main(String[] args) {
Bike Bike = new Bike("Yamaha", "Red");
Bike.getColor();
            String name = Bike.getName();{
                System.out.println("Bike" + " " +Bike.getName()+ " " + Bike.getColor());
            }
Boat Boat = new Boat("Александр Невский", "White");
            Boat.getColor();
            Boat.getName();{
                System.out.println("Boat" + " " +Boat.getName() + " " + Boat.getColor());
            }

Car Car = new Car("Ford", "black");
            Car.getName();
            Car.getColor(); {
                System.out.println("Car" + " " + Car.getName() + " " + Car.getColor());
            }
            Plane Plane = new Plane("ТУ", "Silver");
            Plane.getName();
            Plane.getColor(); {
                System.out.println("Plane" + " " + Plane.getName() + " " + Plane.getColor());
            }
            Train Train = new Train("РЖД","Green");
            Train.getName();
            Train.getColor(); {
                System.out.println("Train" + " " + Train.getName() + " " + Train.getColor());

            }
        }

    }






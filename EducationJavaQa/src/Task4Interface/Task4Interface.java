package Task4Interface;


public class Task4Interface {

        public static void main(String[] args) {
Bike bike = new Bike("Yamaha", "Red");
                System.out.println("Bike" + " " +bike.getName()+ " " + bike.getColor());

Boat boat = new Boat("Александр Невский", "White");
                System.out.println("Boat" + " " +boat.getName() + " " + boat.getColor());


Car car = new Car("Ford", "black");

                System.out.println("Car" + " " + car.getName() + " " +  car.getColor());

            Plane plane = new Plane("ТУ", "Silver");

                System.out.println("Plane" + " " + plane.getName() + " " + plane.getColor());

            Train train = new Train("РЖД","Green");

                System.out.println("Train" + " " + train.getName() + " " + train.getColor());

            }
        }








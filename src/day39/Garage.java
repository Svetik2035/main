package day39;

public class Garage {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.make = "Toyota";
        car1.model = "4 Runner";
        car1.color = "White";
        car1.year = 2020;
        car1.goForward();

        System.out.println("car1.make = " + car1.model);
        System.out.println("car1.color = " + car1.color);

        System.out.println("---------------");

        Car car2 = new Car();
        car2.make = "Hyundai";
        car2.model = "SantaFe";
        car2.color = "Black";
        car2.year = 2017;
        car2.goForward();
        System.out.println("car2.year = " + car2.year);
        System.out.println("car2.color = " + car2.color);

        car2.year = 2020;
        System.out.println("car2.year = " + car2.year);
        // if i want to change some attribute , for example, color of the car:
        car2.color = car1.color; //it will change the car color to the white, like car1 has
    }
}

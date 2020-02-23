package day39;

public class Garage_2 {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.make = "Toyota";
        car1.model = "4 Runner";
        car1.color = "White";
        car1.year = 2020;
        car1.goForward();
        car1.printYear();
        System.out.println("-------------------------");

        Car car2 = new Car();
        car2.make = "Hyundai";
        car2.model = "SantaFe";
        car2.color = "Black";
        car2.year = 2017;
        car2.goForward();
        car2.printYear();
        System.out.println("END");

    }
}

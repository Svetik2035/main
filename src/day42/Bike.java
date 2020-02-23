package day42;

public class Bike {
    int speed ;
    int gear ;

    public Bike(){

        System.out.println("message  from constructor");
        gear = 1 ;
    }
    public Bike(int newGear){
        gear = newGear;
    }
    public Bike(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }

    public Bike(String str) {
        System.out.println("ACCEPT STRING @!!!!");
    }

}

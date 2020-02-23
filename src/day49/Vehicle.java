package day49;

public abstract class Vehicle {

    int year;
    boolean goForward= true;

    public Vehicle(int year){
        this.year = this.year;
    }
    public abstract void start();

    public void goForward(){
        System.out.println("vehicle going forward");
    }
}

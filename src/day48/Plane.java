package day48;

//we build a relationship b/n class and interface

/**using implements key word
 * (compared to extends keyword for class to class)
 * it will build a IS -A Relationship
 * we can say Plane IS _ A Flyable// inheritance relationships
 * since we are inheriting an abstract method
 * we need to provide body by overriding it
 *
 */

public class Plane implements Flyable{
     String name;
     int capacity;
     int speed;

    @Override
    public void fly() {
        System.out.println("Plane is flying");
    }

    public static void main(String[] args) {
        Plane p1 = new Plane();
        p1.fly();
        // anything static, we can access in static way
        //including the static field of interface
        System.out.println(Flyable.HAVE_WINGS);
        // if we have static field in this class
        //can we access it directly? -Yes, we can
        System.out.println(HAVE_WINGS);
    }
}

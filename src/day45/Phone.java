package day45;

public class Phone extends Electronic {

    //Sub class inherits every visible(accessible by access modifier)
    //instance field and static field
    //Sub class inherits every visible(accessible by access modifier)
    //instance method and static method
    // since we extend the Electronic class in here:
    // we are using here :
    //String brand ;
    //static boolean useElectricity = true;

    double size;
    double price;

    // bad idea to a main method
    // but we are doing it anyway for less screen to look at.

    public static void main(String[] args) {

        Phone p1 = new Phone();
        p1.size = 12;
        p1.price = 399 ;
        p1.brand = "Apple";

        System.out.println(Electronic.useElectricity);


    }
}

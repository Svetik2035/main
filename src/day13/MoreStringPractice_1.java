package day13;

public class MoreStringPractice_1 {
    public static void main(String[] args) {

        String name = "Pumpkin" ;
        System.out.println( name );

        //name = "Cat";
        //System.out.println( name );

        name.toUpperCase();
        System.out.println(name);//it will print out Pumpkin
        System.out.println( name.toUpperCase());// it will print PUMPKIN
        // to store the result for long term memory we need to get a hold of the object
        // we need to change the name to store it

        name =name.toUpperCase() ;
        System.out.println( name );

        // every time it will create a new object, and pointer changes from old object to new object
        //only new object will be stored and all old objects that loose a pointer
        // they will be garbage collected (deleted)
        // KNOW IT WELL FOR INTERVIEW!!!!

        /*String is immutable, once created, it cannot be changed
        any String actions/methods
        * */


    }
}

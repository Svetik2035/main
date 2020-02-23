package DAY44;

public class Course {
    // there is only one value for this counter shared by all the objects
    static int counter;
    // each object will have their own name and type
    String name;
    String type;


    // create a constructor-piece of code that runs when an object  is being created
    public Course(String name, String type) {
        this.name = name;
        this.type = type;
        ++counter;//let's increment a count, when we did it,
        // it counted, and printed: Course.counter = 5

        // You can access static field
        // in constructor, instance method , static methods
    }

}
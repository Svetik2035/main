package day50;

public class Square extends Shape{

// these two below we inherited from a parent class
   // String name;
   //double area;
     int length;

    public Square(String name, int length) {
        super(name);// reuse the functionality of a super class
        this.length = length;
    }


    @Override
    public void calculateArea() {
      area = length * length;
      // this is how we calculated an area for a square,
        // because all the sides are the same size.
    }

    @Override
    public void draw() {
        System.out.println(" Draw 4 equal lines with 90 degrees , length " + length);

    }
    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }

    //    public abstract void calculateArea();
//    public abstract void draw();


}

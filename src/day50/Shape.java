package day50;
/*Task 2
		Create an Interface called Drawable
				it has draw method
		Create an abstract class called Shape
		it implements Drawable interface
		it has 2 fields :  String name , double area
		abstract method calculateArea();
		Create 2 concrete Shape classes called
				Square
					field : length
					instance methods : (implement all abstract methods)
					toString method
				Circle
					field : radius
					instance methods : (implement all abstract methods)
					toString method
* */
// abstract class is not required to implement
//the abstract methods of the interface

public abstract class Shape implements Drawable {
    String name;
    double area;
    //why abstract class has a constructor even if we cannot use it to craete an object?
    //it exists purely to let sub class to call call and reuse it in sub class
    public  Shape(String name){
               this.name=name;
    }
    public abstract void calculateArea();
    //public abstract void draw();
}

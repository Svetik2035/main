package Udemy_Training;

public class CustomClasses {


    /*1.Instance variable(field) belongs to an instance of the class.
    2.Instance is an object created out of the class.
    3.We create an object , using new keyword, and this is called instantiation
    4.each object has it's own unique identity and states of the objects-->attributes:*/
    String name;
    int age;
    char gender;
    String job;
   /* 5.now we will talk about object behaviour:
    the are instance methods:*/
    public void run(){
    }
    public void bike(){
    }
    public void swim(){
    }

   /* There are several kinds of methods:
    1.Methods takes no arguments and returns nothing: for example:*/

     public void run1(){
     System.out.println("running");
    }
   /* a. public ->Access Modifier
    b. void ->Return Type
    c.Method name
    d.()->Parameters/Arguments go into these parenthesis

    Instance method has a direct access to instance variables!!!!
    name, age, gender, job;--> which we declared aon the top:*/
   public void swimming(){
       System.out.println(name + " is swimming");
   }

   // 2. Method takes 1 argument and returns nothing:
   public void runMiles(int mileCount){
       System.out.print(name +" is running " + mileCount + " miles");
   }
   //Method takes 1 int argument and returns an int:
    /*where is:
    * public -Access Modifier
    * int- Return Type
    * burnCaloriesWthMiles - Method name
    * (int mileCount) -Parameter
    *  return 10 * mileCount;-> return
    * */
    public int burnCaloriesWthMiles(int mileCount){
        System.out.print(name + " is running " + mileCount + " miles");
        return 10 * mileCount;
    }

    public static void main(String[] args) {
        System.out.println("running");



    }


}

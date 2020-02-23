package Udemy_Training;

public class Encapsulation {
    /*1.Encapsulation ia a restricted access of the inner workings of that class
    or any objects based on that class; also, it is information/data hiding.
    2.An object should not reveal anything about itself except what is absolutely necessary
     for other parts of the application to work.
    * */
    private String name;
    private int age;

    public Encapsulation(String name, int age){
        this.name = name;
        this.age = age ;

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;

    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public static void main(String[] args) {

       Encapsulation p1 = new Encapsulation("John", 25);
       p1.setAge(27);
       p1.setName("Adam");
        System.out.println(p1.getName() + " "+ p1.getAge());

    }
}

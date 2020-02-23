package day41;

public class Person{
    private String name;
    private int age;
    private long ssn ;

    //write a method to give a value to the field
    public void setAll(String newName, int newAge, long newSsn){
        name = newName;
        age = newAge ;
        ssn = newSsn;

    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ssn=" + ssn +
                '}';
    }
}

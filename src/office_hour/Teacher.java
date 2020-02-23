package office_hour;

public class Teacher {
    private String  name;
    private int age ;

    public static void main(String[] args) {

    }
    public String getName(){
        return name ;

    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
       this.age =age;
    }
    public void initializeFields(String name , int age ){
        this.name = name ;
        this.age = age ;
        // what if setting the name and age requires 100 lines of check
        // can I reuse a code that I already have for setting name and age
        setName(name);
        setAge(age);
    }
}

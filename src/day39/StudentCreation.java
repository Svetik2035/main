package day39;

public class StudentCreation {
    public static void main(String[] args) {
        // how do we create an object out of template
        Student s1 = new Student();//created an object
        //Set the values for s1 object attributes
        s1.name = "Karima" ;
        s1.age  = 18 ;
        s1.gender = 'F';
        System.out.println("s1 name " + s1.name);

       Student s2 = new Student();//created an object
        //Set the values for s1 object attributes
        s2.name = "Juma" ;
        s2.age  = 31 ;
        s2.gender = 'M';

        System.out.println("s2 age " + s2.age);
        // this is what we need to do a first value of Juma's age we store first
        int oldAge = s2.age ;

        s2.age = 28 ;
        System.out.println(s2.name + " | " + s2.age + " | " + s2.gender);
        // we printed all three attributes of s2 in one line
        // " | " we used to divide information
        // in printout : Juma | 28 | M
        System.out.println("Juma's Old Age = " + oldAge);

        //tell me the difference between old age and new age

        System.out.println("The difference is  " + (oldAge - s2.age));
    }
}

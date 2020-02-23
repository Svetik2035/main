package day04;

public class StringPractice {

    public static void main(String[] args) {

        String firstName ="Svetlana"  ;
        String lastName = "Gorokhova"  ;

        String fullNam = firstName +"\t"+ lastName ;
        // \t will give a space in between two variables

        System.out.println("my first name is" + "\t" + firstName) ;
        System.out.println("my last name is" + "\t"+ lastName) ;
        System.out.println("my first name is" + "\t" + lastName) ;

        System.out.println("---------------");

        String yourName = "Oleg";
        String yourLastName= "Gamarnik";
        String yourFullName = yourName + yourLastName;

        System.out.println("Print your name: " + yourName);
        System.out.println("Print your last Name: " + yourLastName);
        System.out.println("Print your full name: "+ yourName +" " + yourLastName);






    }


}

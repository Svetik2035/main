package String_Methods;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        //charAt() method

        //index num   01234567
        String str = "Cybertek";
        System.out.println(str.charAt(4));

        char ch = str.charAt(4);
        System.out.println(ch);

        //index num    0123456
        String str2 = "Mu htar";// empty space has index as well

        //in the Scanner we can use charAt method as well
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter char value");
        char ch1 = scan.next().charAt(0);
        System.out.println(ch1);

        //length() method:
        String name = "Donald J Trump";
        int n = name.length();

        //concat():
        String s1 = "Cybertek";
        s1.concat("School");// attempt to modify, but it will not work
        //returns a brand new String
        System.out.println(s1);// String is immutable, and prints ->Cybertek
        //if I will print this it will print Cybertek only,
        // because String is immutable and cannot be modified
        // if I will reassign the value than it will do what I intended:

        s1 = s1.concat(" School");//we are assigning a new value to s1, and it will print-> Cybertek School
        System.out.println(s1);

        //toUppercase():
        String N ="cybertek";
        N.toUpperCase();
        System.out.println(N);// prints: cybertek, string is immutable

        N = N.toUpperCase();// reassign the value of N
        System.out.println(N);//prints: CYBERTEK

        //toLowerCase():
        String name1 = "ABDURAHMAN";
        name1.toLowerCase();
        System.out.println(name1);//prints: ABDURAHMAN, because String is immutable
        // when we reassign the value, we will have a brand new String value
        name1 =name1.toLowerCase();
        System.out.println(name1);






    }
}

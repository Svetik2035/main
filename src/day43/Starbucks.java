package day43;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Starbucks {
    public static void main(String[] args) {
        Coffee c1 = new Coffee();
        c1.setType("Turkish");
        c1.setCaffeineLevel(8);
        c1.setPrice(-4.99);
        System.out.println("c1 = " + c1.toString());

        Coffee c2 = new Coffee("Intesito", 9);
        System.out.println("c2 = " + c2);

        Coffee c3 = new Coffee("Blonde", 5,1.6);
        System.out.println("c3 = " + c3);

        Coffee c4 = new Coffee("Latte", 3, -2.3);
        System.out.println("c4 = " + c4);


        // any non-primitive types can be assign to a null
        // when you write null, it means nothing, and you cannot create any reference to an object,
        // and object will be deleted
        String str = null;
        Scanner scan = null;
        Coffee cx = null ;

        List<String> lst = new ArrayList<>();
        lst.add("abc");
        lst.add(null);
        lst.add(null);
    }
}

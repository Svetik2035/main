package day60;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionIntro {
    public static void main(String[] args) {


    //List<String> names = new ArrayList<>();
    Collection<String> names = new ArrayList<>();
        names.add("Hassan");
        names.add("Sevim");
        names.add("Abdullo");
        names.add("Tuana");
        names.add("Daria");
        names.add("Lorin");

        names.addAll(names);
        names.remove("Hassan");
        System.out.println("names = " + names);
        //  System.out.println("first item = "+ names.get());
        // Collections do not have a get method
        for(String eachName : names){
            System.out.println("eachName = " + eachName);
        }
}
}
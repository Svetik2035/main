package day61;

import java.util.LinkedList;
import java.util.List;

public class List_LinkedListImplementation {
    public static void main(String[] args) {

        //  List<String> lst = new ArrayList<>();
        List<String> lst = new LinkedList<>();// this is like people holding hands;
        lst.add("Sveta");
        lst.add("Tanya");
        lst.add("Katya");
        lst.add("Oleg");

        System.out.println("lst = " + lst);// print the list

        lst.remove("Oleg");
        System.out.println("lst = " + lst);

    }
}

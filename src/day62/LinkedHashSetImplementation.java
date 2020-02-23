package day62;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
// primary difference b/n HashSet and LinkedHashSet keeps insertion in order
//HashSet is always way faster since it has less responsibility
public class LinkedHashSetImplementation {
    public static void main(String[] args) {


    //if you want to keep an insertion order(first comes , first serves)
    // and it also remove duplicates
        // It is sub class of HashSet
    Set<Integer> myNums = new LinkedHashSet<>();

        myNums.add(10);
        myNums.add(10);
        myNums.add(22);
        myNums.add(13);
        myNums.add(13);
        myNums.add(30);
        myNums.add(30);

        System.out.println("myNums LinkedHashSet = " + myNums);

        Set<Integer> myNums2 = new HashSet<>();

        myNums.add(10);
        myNums.add(10);
        myNums.add(22);
        myNums.add(13);
        myNums.add(13);
        myNums.add(30);
        myNums.add(30);

        System.out.println("myNums HashSet = " + myNums2);
    }
}

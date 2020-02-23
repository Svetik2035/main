package day62;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetInterfaceIntro2 {
    public static void main(String[] args) {
        // Creating a HashSet with items already inside
        /*
        Remember : In HashSet There is NO defined order!!!!
        YOUR OUTPUT CAN BE IN ANY ORDER JAVA DESIRES**/
        List<Integer> numList = Arrays.asList(10, 10, 20, 20, 20, 30, 30, 30);
        System.out.println("numList = " + numList);

        Set<Integer> myNumSet = new HashSet<>(numList);
        System.out.println("myNumSet = " + myNumSet);
        //Create a Set of string called states
        //add a bunch of states with some duplicates
        // iterate over them



}

}

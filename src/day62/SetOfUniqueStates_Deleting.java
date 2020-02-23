package day62;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetOfUniqueStates_Deleting {
    public static void main(String[] args) {
        Set<String> states = new HashSet<>();
        // all Collection type has addAll method
        states.addAll(Arrays.asList("Maryland","New York","Pennsylvania",
                "Washington","Virginia","Maryland","Washington"));
        System.out.println("states before = " + states);
        //states.remove("Maryland");
        //System.out.println("states after = " + states);
        //remove all the states with letter "a"
        //to remove item while iterating over the collection
        Iterator<String> stIter = states.iterator();
        while(stIter.hasNext()){
             String each = stIter.next();
             if(each.contains("a")){
                 System.out.println("removing = " + each);
                 stIter.remove();
             }

        }
        System.out.println("states after = " + states);
    }
}

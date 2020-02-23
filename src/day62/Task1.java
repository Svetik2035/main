package day62;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        Set<String> states = new HashSet<>();
       /*add them by one:

        states.add("Maryland");
        states.add("New York");
        states.add("Pennsylvania");
        states.add("Washington");
        states.add("Virginia");
        states.add("Maryland");
        states.add("Washington");
        or use addAll method:
        */
        states.addAll(Arrays.asList("Maryland","New York","Pennsylvania","Washington","Virginia","Maryland","Washington"));
        //any type of collection has a size method to count the items:
        System.out.println("How many states in my list?  = " + states.size());

        for( String each : states){
            System.out.println("Each State = "+ each);
        }
        // For Loop does not work!!! No Index!!!
        //We can use iterator for any type of collection at all times

   // Creating an iterator:
        Iterator<String> stIter = states.iterator();
        while(stIter.hasNext()){
            System.out.println("stIter.next() = "+ stIter.next());
        }
     /* states.forEach(each-> System.out.println());
        System.out.println("Each State = "+ each);*/
    }

}

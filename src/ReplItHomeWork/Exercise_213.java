package ReplItHomeWork;


import java.util.ArrayList;
import java.util.Arrays;

class Main {
    public static ArrayList<Integer> removeInst(ArrayList<Integer> r, Integer n) {
        r.removeIf(a->a==n);
        return r;
    }

    public static void main(String[] args)
    {

        ArrayList<Integer>  arr = new ArrayList<>();
        Integer[] nums = new Integer[]{1,1,2,3};
        arr.addAll(Arrays.asList(nums));

        System.out.print(removeInst(arr,1));


    }//end main

    /**
     * ArrayList removeIf() method in Java
     * The removeIf() method of ArrayList is used to remove all of the
     * elements of this ArrayList that satisfies a given predicate filter which is
     * passed as a parameter to the method.
     *
     * Errors or runtime exceptions are thrown during iteration
     * or by the predicate are pass to the caller. This method returns
     * True, if we are able to remove some element.
     *
     * Java 8 has an important in-built functional interface which is Predicate.
     * Predicate, or a condition checking function, check the given input for a given condition
     * and returns a boolean result for the same indicating whether the condition was met or not.
     * import java.util.*;
     * public class GFG {
     *
     *     public static void main(String[] args)
     *     {
     *
     *         // create an ArrayList which going to
     *         // contains a list of Numbers
     *         ArrayList<Integer> Numbers = new ArrayList<Integer>();
     *
     *         // Add Number to list
     *         Numbers.add(23);
     *         Numbers.add(32);
     *         Numbers.add(45);
     *         Numbers.add(63);
     *
     *         // apply removeIf() method
     *         // we are going to remove numbers divisible by 3
     *         Numbers.removeIf(n -> (n % 3 == 0));
     *
     *         // print list
     *         for (int i : Numbers) {
     *             System.out.println(i);
     *         }
     *     }
     * }
     */
}
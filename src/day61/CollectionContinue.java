package day61;

import java.util.*;

public class CollectionContinue {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,6,4,5,7,8));
        System.out.println("nums = " + nums);

        // We cannot use "get method" for collection as reference type!!!
       //  Only reference type decides what we can Access!!!
        List<Integer> nums2 = new ArrayList<>(Arrays.asList(10,7,4,11,67,8));
        //Sort the Collection
        Collections.sort(nums2);
        System.out.println("nums2 = " + nums2);
    }
}

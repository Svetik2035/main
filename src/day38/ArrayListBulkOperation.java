package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListBulkOperation {
    public static void main(String[] args) {
        List<String> groceries = Arrays.asList("Eggs", "Milk","Butter", "Apple", "Salmon");
        System.out.println("groceries =" + groceries);

        ArrayList<String> newLst = new ArrayList<>(groceries);
        newLst.add("Diet coke");
        newLst.add("Sugar");
        System.out.println("newLst = " + newLst);

        //actually I have a list of items for you here: Pasta, Branzini, asparagus, spinach
        //good new is I already created a List object for you so you can just add them all to your existing list
        List<String> newItemsToAdd = Arrays.asList("Pasta", "Branzini", "asparagus", "spinach");
        newLst.addAll( newLst);
        System.out.println("new Lst with all items = " + newLst);

        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(123);
        nums1.add(100);
        nums1.add(223);
        nums1.add(133);
        nums1.add(125);
        nums1.add(122);

        ArrayList<Integer> nums2 = new ArrayList<>();



    }
}

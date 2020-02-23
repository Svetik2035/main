package Day36;

import java.util.ArrayList;

public class ArraysListMethods_V2 {
    public static void main(String[] args) {

        // create an ArrayList Object of long and assign it to a variable

        ArrayList<Long> lst = new ArrayList<>();

        lst.add(12L);
        lst.add(100L);
        lst.add(150L);
        lst.add(200L);// add method allows you to add items in array list one by one from top to bottom

        System.out.println("lst = " + lst);

        //I want to insert 125 between 100L and 150L , basically, 2nd and 3rd item

        lst.add(2,125L);
        System.out.println("lst = \n\t" + lst);

        System.out.println("lst.get(3) = \n\t" +lst.get(3));

        //updating value at certain index: set() method

        lst.set(3,195L) ;
        System.out.println("New Value for lst.get(3) = \n\t" + lst.get(3));

        //remove item by it's value

        lst.remove(100L);


        System.out.println("lst after removing 100 = \n\t" + lst);

        // remove item by its index
        lst.remove(2);
        System.out.println("lst after removing item in index 2  = \n\t" + lst);

        // looking for the location of certain item

        System.out.println("Location of 100L is using lst.indexOf(100L) = " +lst.indexOf(100L));
        System.out.println("Location of 23L is using lst.indexOf(23L) = " +lst.indexOf(23L));

        //check weather a list is empty ot not
        System.out.println("lst.size() > 0 = " + (lst.size()>0));
        System.out.println("\nlst.isEmpty() = " +lst.isEmpty());

    }
}

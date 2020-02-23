package Day36;

import java.util.ArrayList;

public class ArraysListMethods {
    public static void main(String[] args) {

        // create an ArrayList Object of long and assign it to a variable

        ArrayList<Long> lst = new ArrayList<>();

        lst.add( 12L );
        lst.add( 100L );
        lst.add( 150L );
        lst.add( 200L ) ;// add method allows you to add items in array list one by one from top to bottom

        System.out.println("lst = " + lst);

        // to count array items inside of ArrayList we will use the size () method

        System.out.println("Counting items using lst.size() = " + lst.size());

        // Getting items inside of ArrayList object and print out the value

        System.out.println("Counting items using lst.get(0) = " + lst.get(0));

        //Task: Get the sum of above ArrayList items:
        long sum = 0;
        for (int i = 0; i <lst.size() ; i++) {
            sum+= lst.get(i);

        }
        System.out.println("Sum = " + sum);

        //task 2 : Get the max of above arrayList items:
        long max = lst.get(0) ; // we are assuming that first number is max number and we compare each number with it
        // if another number is larger than first number than it gets replaced in max value instead of it
        for (int x = 0; x <lst.size() ; x++) {

            if(lst.get(x) > max){
                max = lst.get(x);
            }


        }
        System.out.println("max =" + max);




    }
}

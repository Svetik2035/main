package day24;

import java.util.Arrays;

public class ArraysMethodSorting {
    public static void main(String[] args) {
        int [] scores = new int[]{99, 44, 66, 23, 19, 55};

        System.out.println(Arrays.toString(scores));
        System.out.println("original first item value : " + scores [0]);
        //for sorting an array in ascending order (from low to high)
        //sort -->> Arrays.sort(yourArrayHere)

        Arrays.sort(scores);
        //SO WHAT HAPPENED TO MY ORIGINAL ORDER? - IT IS GONE!!!
        //CAN i GET IT BACK? NO!!!!
        //THE ORIGINAL INDEX OF ITEMS HAS CHANGED!!!
        System.out.println(Arrays.toString(scores));
        // FIRST ITEM VALUE
        System.out.println("new first item value : " + scores [0]);

        //ONLY FIRST CHARACTER MATTER WHEN SORTING A STRING ARRAY

        System.out.println("-----character sorting--------");
        //the low to high order for character is decided by it's ASCII table value
        // special characters come first, number , uppercase than lowercase


        char [] nameChars = {'G', 'A','D', 'Z','C','A',} ;
        System.out.println( "before sorting nameChars = " + Arrays.toString(nameChars));
        Arrays.sort(nameChars);
        System.out.println( " after sorting nameChars = " + Arrays.toString(nameChars));

        //the low to high order for character is decided by it's ASCII table value
        // special characters come first, number , uppercase than lowercase

        System.out.println("-----String sorting--------");

        String[] superHeroes = {"Superman", "Batman", "Wonder Woman", "Aquaman", "Cyborg", "Flash", "100", "9", "09"};
        System.out.println("before sorting superHeroes = " + Arrays.toString(superHeroes));
        Arrays.sort(superHeroes);
        System.out.println( " after sorting nameChars = " + Arrays.toString(superHeroes));

        System.out.println("-----Boolean sorting---- SORT METHOD DOES NOT WORK FOR BOOLEAN ARRAY ----");

        boolean [] fiveSwitchOnOffs = {true, false ,false , true, true};
        System.out.println("fiveSwitchOnOffs = " + Arrays.toString(fiveSwitchOnOffs) );
        //Arrays.sort(fiveSwitchOnOffs); DOES NOT WORK FOR BOOLEAN ARRAY!!

        //Arrays.sort(arrObject) does not return a value that we can store
        //it only takes action to reshuffle the indexof an original array object to keep it in sorted




    }
}

package day22;

public class LoppingTroughAArrow {
    public static void main(String[] args) {
        int [] scores = new int[4];
        scores [0] = 95 ;
        scores [1] = 70 ;
        scores [2] = 88 ;
        scores [3] = 100;


        System.out.println( scores[0]);
        System.out.println( scores[1]);
        System.out.println( scores[2]);
        System.out.println( scores[3]);

        //how do we get the size of any array object
        System.out.println();
        int itemCount = scores.length ; //  array object has Property called length; no parenthesis after it
        //that is a difference
        int lastItemIndex = itemCount - 1;

        //I can use any othis ways, all will give the results
       // for (int x = 0; x <=lastItemIndex ; x++) {
        // for (int x = 0;x <= itemCount-1 ; x++) {

        for (int x = 0; x < itemCount ; x++) {
            System.out.println( scores[x]);

        }
        // how do we get  the char count of a String
        String name = "Jon Snow";
        int charCount = name.length();// this thing  is different , it is a String method



                // creating an array object with empty slot
                //int[] scores = new int[4];
                // assigning value to each index
                scores[0] = 95;
                scores[1] = 70;
                scores[2] = 88;
                scores[3] = 100;

                // how do we get the size of any array object
                // array object has a property called length
                //int itemCount = scores.length;
                //int lastItemIndex = itemCount - 1;

//      for (int x = 0; x <= lastItemIndex ; x++) {
//      for (int x = 0; x <= itemCount-1 ; x++) {
                for (int x = 0; x < itemCount; x++) {

                    System.out.println(scores[x]);

                }

                // print this array in reverse order


                // accessing the elements inside array one by one
//        System.out.println(scores[0]);
//        System.out.println(scores[1]);
//        System.out.println(scores[2]);
//        System.out.println(scores[3]);


                // how do we get the char count of a String
               // String name = "Jon Snow";
              //  int charCount = name.length();


        System.out.println(scores[3]);
        System.out.println(scores[2]);
        System.out.println(scores[1]);
        System.out.println(scores[0]);








    }
}

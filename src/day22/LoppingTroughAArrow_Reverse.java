package day22;

public class LoppingTroughAArrow_Reverse {
    public static void main(String[] args) {
        int [] scores = new int[4];
        scores [0] = 95 ;
        scores [1] = 70 ;
        scores [2] = 88 ;
        scores [3] = 100;

        int elementCount = scores.length ;
        int lastItemIndex = elementCount - 1;

        // we are printing in the reverse order so
        //we start with highest index till lowest index 0 -->>3-0

        /*System.out.println(scores[3]);
        System.out.println(scores[2]);
        System.out.println(scores[1]);
        System.out.println(scores[0]);
        instead of this we will create a for loop
        */
        for (int x = lastItemIndex; x >= 0 ; x--) {
            System.out.println("index location " + x);
            System.out.println( scores [x] );

        }












    }
}

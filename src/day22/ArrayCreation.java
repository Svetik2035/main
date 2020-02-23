package day22;

public class ArrayCreation {
    public static void main(String[] args) {
        //second way to create an array
        int [] ages = new int[] {3,5,11,33,57,18};
                 
       int itemCount = ages.length ;
        System.out.println("itemCount = " + itemCount);
        System.out.println("ages = " + ages);

        //System.out.println( ages [0]);
        for (int x = 0; x <itemCount ; x++) {

            System.out.println( ages [x] );

        }
         int[] areaCode = {703, 300, 954, 665} ;

        for (int x = 0; x < areaCode.length; x++) {
            System.out.println( areaCode [x] +" ");

        }


    }
}

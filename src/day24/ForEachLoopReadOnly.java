package day24;

public class ForEachLoopReadOnly {
    public static void main(String[] args) {
        int yourFavNumber = 300;
        int myFavNumber = yourFavNumber;

        myFavNumber = 299;
        System.out.println(yourFavNumber);
        // this above will print only yourFavNumber value, which equals 300
        long[] nums = {10, 40, 20};
        // how do I change a double the value of my first item in the array
        // nums[0] = nums [0] *2 ;// in one shot version -->> nums[0] *= 2 ;
        //System.out.println(nums[0]);


        for (int x = 0; x < 3; x++) {

            // System.out.println(nums [x] *2);//Just printing will not change a value
            // nums [x] = nums [x] * 2 ;//here are doubling the value of each value
            long eachItem = nums[x];
            eachItem = 100;

        }
        for( long eachItem : nums ){
            eachItem = 100 ;
    }
        //NEVER USE FOR EACH LOOP TO MODIFY ARRAY ITEMS

        //how do I know array items are modified or not re-print
        System.out.println("AFTER WE MODIFIED THE VALUE");
        for (int x = 0; x <3 ; x++) {
            System.out.println(nums [x]);

        }
    }

}

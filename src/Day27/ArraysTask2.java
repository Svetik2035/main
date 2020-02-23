package Day27;

public class ArraysTask2 {
    public static void main(String[] args) {
        /* task2:
        write a program that returns the maximum number from an array
        DO NOT USE sort method it will be on interview
         */
        int [] nums = new int[]{100, 10000, 9999, 888, 1231, 2345};
        int max = nums[0];

        for(int i =0; i<nums.length; i++){
            if(max<nums[i]) {//comparing int max with all the numbers in array one by one
                max = nums[i];// after comparing all the numbers in array this statement will assign a new array
            }
        }
        System.out.println("first maximum number:" + max) ;

        int secondMax = nums[0];
        for (int i = 0; i <nums.length ; i++) {
            if (secondMax< nums[i] && nums[i] !=max){//I can use continue statement instead as well
                secondMax=nums[i];
            }

        }
        System.out.println("secondMax = " + secondMax);
    }

}

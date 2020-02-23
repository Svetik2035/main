package day23;

public class WarmUp_Array {
    public static void main(String[] args) {
        //create an int array of 7 items, assign values
        //first way to create an array
        int[] numbers = new int[7];
        numbers[0] = 11;
        numbers[1] = 2;
        numbers[2] = 23;
        numbers[3] = 4;
        numbers[4] = 53;
        numbers[5] = 6;
        numbers[6] = 3;
        //second way of creating array with values already filled
        int[] nums = new int[]{11, 2, 34, 4, 53, 6, 3};
        // third way and shortest way
        //THIS MUST HAPPEN IN ONE LINE, WE CANNOT DECLARE FIRST AND ASSIGN LATER
        int[] nums2 = {11, 2, 34, 4, 53, 6, 3};

        for (int x = numbers.length - 1; x >= 0; x--) {
            System.out.println("numbers = " + numbers[x]);

        }
        int arraySize = numbers.length;
        int lastItemIndex = arraySize - 1;

        int lastItemValue = numbers[lastItemIndex];
        System.out.println("last Item Value = " + lastItemValue);

        int middleItemValue = arraySize / 2;
        System.out.println("Middle Item Value = " + numbers[middleItemValue]);

        int sum = 0;
        for (int x = 0; x < arraySize; x++) {
            int currentItem = numbers[x];
            sum = sum + currentItem;

        }
        System.out.println("sum = " + sum);

            //check if this is correct for minimum and maximum; check codes for office hour 12-09
        // for (int i = 0; i < 8; i++) {
        // if (numbers[i]>max) {  max = numbers[i];  }
        // if (numbers[i]<min) {  min = numbers[i];  }
    }




                    



       /* System.out.println( numbers [0]);
        System.out.println( numbers [1]);
        System.out.println( numbers [2]);
        System.out.println( numbers [3]);
        System.out.println( numbers [4]);
        System.out.println( numbers [5]);
        System.out.println( numbers [6]);

        int elementCount = numbers.length ;
        int lastItemIndex = elementCount - 1;*/






        }


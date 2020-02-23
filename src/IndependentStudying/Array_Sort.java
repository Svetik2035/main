package IndependentStudying;

import java.util.Arrays;

public class Array_Sort {
    public static void main(String[] args) {
        int arr[] ={5,4,2,7};
        int temp = 0;
       // Arrays.sort(arr);
        //System.out.println("arr = " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length; j++) {
                if(arr[i]> arr[j]) {
                    temp = arr[i];//condition - put coffee in empty temp cup
                    arr[i] = arr[j];//I pour tea into coffee cup
                    arr[j] = temp; //I pour coffee into tea cup

                }


            }

        }
        System.out.println(Arrays.toString(arr));

    }
}

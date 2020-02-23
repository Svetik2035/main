package IndependentStudying;

public class MuhtarTasks {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 3};
        //int temp = arr [0];
        int count = 0;

        for (int i = 0; i < arr.length ; i++) {
             count = 0;
            for (int j=0; j< arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if(count==1){
                System.out.println("It's unique "+ arr[i]);
            }
            }


        /*
    }Tasks:
    1.  Write a program that can print out the unique values from an int Array
        Ex:
            if arr -> {1,1,2,3,3}
              output: 2
    2. Write a program that can print out the unique values from  String Array
        Ex:
            if arr -> {"a" , "a ", "b", "c", "c"}
                output: b
    3. Write a program that can find the second max number from an int array
        Ex:
            if arr -> { 1,2,3,4,5}
                output: 4
            DO NOT use sort method
    4. Swap two variable' values without using a temporary variable
        Ex:
            if a =10, b= 20;
                output: print( a ) ==> 20
                        print( b ) ==> 10*/
    }
}

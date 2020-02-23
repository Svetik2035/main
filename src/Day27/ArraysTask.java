package Day27;

public class ArraysTask {
    public static void main(String[] args) {
        /*Task02:
        1.write a program that can find a minimum number DO NOT USE sort method
        this will be on interview.
        2.write a program to find a second minimum number
         */

       // int[] scores = {100,897,654,32,1231,224,556,7,1,2,3,4};
        int[] scores = {100,-99,-1000,2000,500,0,1,2,3,4};
        int min = scores[0];//in first loop this number will be replaced with 100; min:100
        for (int i = 0 ; i<scores.length; i++) {
            if(min>scores[i]){
                min = scores[i];
            }
        }
        System.out.println("minimum number:" + min);
        int secondMinimumNumber = scores[0];
        // to find a second minimum number, we need to skip first minimum number
        // for this we will use continue; to skip
        for (int i = 0; i <scores.length;  i++) {
            if(scores[i] == min){
                continue;
            }
            if(secondMinimumNumber>scores[i]){
                secondMinimumNumber = scores[i];
            }
        }
        System.out.println("second minimum number:" + secondMinimumNumber);

        int thirdMinimumNumber = scores [0];
        for (int i = 0; i < scores.length ; i++) {
            if(thirdMinimumNumber>scores[i]){
                thirdMinimumNumber = scores[i];
            }

        }
        System.out.println("Third minimum number:" + thirdMinimumNumber);
    }

}

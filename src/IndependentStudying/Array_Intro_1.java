package IndependentStudying;

public class Array_Intro_1 {
    public static void main(String[] args) {

        int num1 = 10;
        System.out.println("num1 = " + num1);// prints in console: num1 = 10
        num1 =100;// if I assign this value, but will not create line 16, than prints in console: num1 = 10 stays the same
        System.out.println("num1 = " + num1);//prints in console: num1 = 100

        //Creating an array object with an empty slot
         int[] scores = new int [4];// creating the variable
         scores[0] = 95;
         scores[1] = 70;
         scores [2] = 88;
         scores [3] = 100;// these 4 -assigning the value

        //accessing the elements inside an array one by one
        System.out.println(scores[0]);//95
        System.out.println(scores[1]);//70
        System.out.println(scores [2]);//88
        System.out.println( scores [3]);//100

        //updating a value at certain index

        scores[1] = 99;// changed value from 70 to 99
        System.out.println(scores[1]);//printed out updated value: 99

        int [] numbers = new int [3] ;//I created a new array object
        numbers = new int[]{35, 17, 39};// with these numbers my output: 35 17 39
        System.out.println(numbers[0]);//without line 27,my out put is: 0 0 0
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        byte [] data = new byte[4];// create new array byte
        data [0] = 10 ;
        data [1] = 20;
        data [2] = 30 ;
        data [3] = 40 ;// assigned a value for each index location

        System.out.println(data [0]);//10
        System.out.println(data [1]);//20
        System.out.println(data [2]);//30
        System.out.println(data [3]);// 40   //printed out the values of each index

        // update last index value
        data [3] =127;
       // print out updated value
        System.out.println(data [3]);// 127

    }
}

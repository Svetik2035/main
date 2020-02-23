package Day27;

import java.util.Arrays;

public class Multi_Dimensional_Arrays_Practice {
    public static void main(String[] args) {
       // the formula is: N dimensional Array Must contain(N-1) dimensional Arrays
        //2 dimensional array Must contain (2-1) dimentional array

        //index                   0            1           0          1
        String [][] names = { {"Rukhshona" , "Ghoya"} , {"Hasan" , "Tetiana"} };
        //              index          0                         1
         //print Hasan
        System.out.println(names [1] [0]);
        // print Tetiana

        System.out.println(names [1] [1]);
         //to print "Dilshat" instead of "Tetiana":
        names [1][1] = "Dilshat";
        System.out.println(names [1] [1]);

        // to print both Hasan and Dilshat
        System.out.println(Arrays.toString( names [1]));// to print single dimensional array

          // print: {  {"Rukhshona"  ,"Ghoya" }  ,  {"Hasan", "Tetiana"  }  }
        System.out.println(Arrays.deepToString(names));

        int [][] numbers = {{1,2,3} , {4,5,6} , {7,8,9} , {10,11,12,13}};
        //                    0         1         2

        for (int i = 0; i < numbers.length ; i++) {//check each index of two dimensional array
            System.out.println(Arrays.toString(numbers[i]));// will print entire multidimensional array

            for (int j = 0; j < numbers[i].length; j++);
            int j = 0;
            System.out.println(numbers[i][j] + " ");//[i] represents single dimensional array
            // and [j]  represents each element inside of particular array
            // https://cybertek-b15-online.slack.com/archives/CPS9FQSVD/p1576434606457600
        }
        System.out.println("\n ==========================");
        int [] [] ages = { {10} , {12,13,14,15,16,17,}, {19,20,21,22,23} };

        for (int i = 0; i < ages.length; i++) {
            for (int j = 0; j <ages[i].length ; j++) {
                System.out.println(ages[i][j] + " ");
            }

        }
      //if you want to print only even numbers: skip the odd numbers
        System.out.println("\n ==========================");
        int [] [] ages1 = { {10} , {12,13,14,15,16,17,}, {19,20,21,22,23} };

        for (int i = 0; i < ages1.length; i++) {
            for (int j = 0; j <ages1[i].length ; j++) {
                if(ages1[i][j]% 2 ==0)
                    System.out.print(ages1[i][j] + " ");
            }

        }
        //if you want to print only odd numbers: skip the even numbers
        System.out.println("\n ==========================");
        int [] [] ages2 = { {10} , {12,13,14,15,16,17,}, {19,20,21,22,23} };

        for (int i = 0; i < ages2.length; i++) {
            for (int j = 0; j <ages2[i].length ; j++) {
                if(ages1[i][j]% 2 !=0)
                    System.out.print(ages2[i][j] + " ");
            }

        }
        System.out.println("\n ==========================");
        int [] arr1D = {1, 2, 3};
        for (int  each : arr1D) {
            System.out.println(each + " ");

        }
        System.out.println("\n ==========================");
        //                 0    1  2     0   1  2  3  4  5  6
        int[][] arr2D = { {10, 20,30} , {40,50,60,70,80,90,100} };
        //                  0                          1
        for( int[] each1DArray : arr2D ){
            for (int eachElement : each1DArray) {//variable name
                System.out.println(eachElement+ " ");

            }
        }
    }
}

package MuhtarTraining.VideoDay6;

public class Review {


    public static void main(String[] args) {
        //Task 1
        // declare two variables:
        // we have to swab the values
        // without using temporary variable
        /*int a =10;
        int b = 15;
        System.out.println(a);->15
        System.out.println(b);->10
        */
        int a =10;//15
        int b = 15;//10

        a = a+b; //a=25
        b = a - b;// 25-15=10; b =10;
        a = a-b ; //25-10 = 15; a=15



        System.out.println(a +"\n"+b);// after this swapping,
        // a will be printed as 15, b will be printed as 10.

        /*Task 2:
        -Declare 3 int variables:
        city1
        city2
        city3
     -a. print values in the same line separated by space:
       2345673  5688944  16189445
      -a. print values in the same line separated by space:
       2345673
       5688944
       16189445
        * */
        int city1 = 2345673;
        int city2 = 5688944;
        int city3 = 16189445;

        System.out.print(city1 +" " + city2 + " "+ city3);
        System.out.println("\n" +city1 +"\n" + city2 + "\n"+ city3);

    }

}

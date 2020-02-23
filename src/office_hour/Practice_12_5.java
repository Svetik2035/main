package office_hour;

public class Practice_12_5 {
    public static void main(String[] args) {
        int a = 9 ;
        while (a > 0) { // false: a <= 0
            //a: 9, 8, 7, 6, 5, 4, 3, 2, 1
            a--; // al =8
        }
        System.out.println("--------------------------------");
         for(int i = 9 ; i > 5; i--) { //i: 9,8,7, 6==>>  printed 4 times
             System.out.println("Hello, Batch 15");
         }
        System.out.println("--------------------------------");

         //Task: 10- 20
        for (int i = 10; i <=20 ; i++) {
            System.out.print(i+" ");//10 11 12 13 14 15 16 17 18 19 20

        }
        for (int i = 10; i <=20 ; ) {//right place for i++
            i++;//wrong place
            System.out.print(i+" ");// 11 12 13 14 15 16 17 18 19 20 21
            //right place for iterator -> i++
        }
        //while loop:
        int j = 10;
        while (j<= 20) {

            System.out.println(j);
            j++;// it has to be at the end of the body to generate the correct results
        }



        }

}

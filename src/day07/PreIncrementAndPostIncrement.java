package day07;

public class PreIncrementAndPostIncrement {
    public static void main(String[] args) {

        int apple = 8;
        apple++;  //increment by one -->> incrementing by  1-->> 9
        //System.out.println( ++apple );
        // increasing the value and print the value

        /* apple++ , when ++ comes after variable
         it's called increment
        it will increase the value
        BUT it will reflect the increased the value  next time the variable show up!!
         */
        System.out.println( apple++ );
        System.out.println( apple);
        int score = 50;
        System.out.println( ++score);//51

        System.out.println(score++ );//51 and ready to be 52 next time it shows up!

        System.out.println(score );//52

        System.out.println(--score );//51

        System.out.println(score--);//still 51 and ready to be 50

        System.out.println( score ); //50
    }
}

package day07;

public class IncrementDecrement {
    public static void main(String[] args) {


        int apple = 10 ;
        System.out.println("original apple is " + apple);
         apple = apple+1 ;
         apple += 1;

         // for example:it can adding by one: number of students, age, offer
        ++ apple ;// this is increasing a value by one in shortcut using ++
        ++ apple ;

        System.out.println( "used ++  twice than apple is " + apple);
        --apple;// this is decreasing a value by one in shortcut using --
        //apple = apple- 1;
        //apple-= 1;
        System.out.println( "used --  twice than apple is " + apple);
        //System.out.println( ++apple);
        //System.out.println( --apple);
        //these are the one way or use this way below

        System.out.println("used == to increment and concatenate : "+  (++apple));
        //the plus (+) is concatenation and double plus (++) is an increment
        // use parentheses for increment and decrement (++apples) or (--apples)

    }
}

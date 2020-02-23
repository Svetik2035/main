package day18;

public class DoWhileIntro {
    public static void main(String[] args) {

        //count from one to five
        //[]-square brackets
        //{}-curly braces
        //()-parenthesis
        //: colon
        //; semicolon
        //% remainder
        //! exclamation mark
        //| pipe
        // / forward slash
        //\ backslash
        //" -double quotes
        //' -single quotes
        /* do {
         take some action here and repeat it
         }while(some condition is true) ;
         }*/
       int x = 1 ;

       do{
           System.out.println( x );
           ++x;
       }while(x<= 5 );//semicolon is mandatory!!! It is what distinguish it from while loop!
        System.out.println("-----------------------");

        //print from 5 to 1
        int y = 5 ;

        do {
            System.out.println( y );
            --y;
        }while (y> 0) ;

        //While LOOP VS Do While LOOP
        /*1.While LOOP checks the condition first than enters the statement
        2. Do While Loop will take an action at least once then check the condition
        3. Do While Loop ALWAYS RUNS AT LEAST ONe Iteration
        4. WhileLOOP might NOT EVEN RUN!
         */

    }
}

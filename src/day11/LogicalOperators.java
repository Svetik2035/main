package day11;

public class LogicalOperators {
    public static void main(String[] args) {

        /*Logical operators are combining multiple conditions together
        in Java there is NO range check directly like in math
        for example:int x = 70;
        in math:  60< x < 100-->> true < 100
         in Java we have to do like this: x> 60 && x< 100
         &&  double ampersand  & single ampersand -->> logical AND operator
         this is used to check both conditions are true at the same time
                  */
       /*         true       false
      int x=70 ; x> 60 && x <100; true

                  false    true
      int x=10 ; x> 60 && x <100; false

                 true       false
      int x=110; x> 60 && x <100; false

                  true     true
      int x=99 ; x> 60 && x <100; true

        */
       /*1 pipe ir 1 pipe are used for compiling 2 conditions : logical or Operator
      if you have two conditions to check
      When will be true : As long as one side is true
      think about buying milk for two stores :
  as long as found  the milk in one store, you got the milk then you get out!
   as long as 1 side is true the result will be true!
   how do i type pipe (||)correct on keyboard?-->> press  Shift + \
        */
       /*                true    false
           int x = 70 ; x> 10 || x> 5-->> true

               true    false     false
           int x = 70 ; x> 10 || x> 5-->> false

               true    true      false
           int x = 70 ; x> 10 || x> 5-->> true

                        false    true
           int x = 70 ; x> 10 || x> 5-->> true
          */
        System.out.println("Truth Table");
        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println("Result of true && true is "+ (true && true));
        System.out.println("Result of false &&  true is "+ (false && true));
        System.out.println("Result of true && false is "+ (true && false));
        System.out.println("Result of false && false is "+ (false && false));

        System.out.println("Result of true || true is "+ (true || true));
        System.out.println("Result of false || true is "+ (false || true));
        System.out.println("Result of true || false is "+ (true || false));
        System.out.println("Result of false || false is "+ (false || false));
        // create a variable  called num with type int
        //found out the number is more than 100 or less than 10
        //find out the number within the range between 10 and 60
        // print out the results

      int num = 55 ;
        System.out.println("---num > 100 || num < 10 ----");
        System.out.println( num> 100 || num< 10);
        System.out.println(10< num && num < 60);

        //more than conditions at the same time, 3 conditions
                                 //true || false -->> true
        System.out.println( true || false || false);
                             // true && false -->>false
        System.out.println(true && false && false);
                          // false||false->false || true-->> true
        System.out.println( num==50 || num ==51 || num==55 );
        // check num (x) more than 50 and num (x) is not 52 or num (x) equals to 57
        /*== is checking for quality , != is checking for inequality
                                    //true || false-->> true
        System.out.println(num>50 && num!= 52 || num == 57);
        -check x (num) is more than 50
        -and x is not equal 52
        -or x equal to 57
        */
        System.out.println( false || true && true);














    }

}

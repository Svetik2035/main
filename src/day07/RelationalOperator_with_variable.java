package day07;

public class RelationalOperator_with_variable {

    public static void main(String[] args) {
        /*>, >= , <, <= , == , !=
        Relational operator is used to compare 2 numbers (operators)
        and return true or false
        anything action or expression
        that return true or false result
        can be called a boolean expression
         */
        int myNumber = 10;
        System.out.println(myNumber> 5);
        System.out.println(myNumber< -19);
        System.out.println(myNumber>=5);
        System.out.println(myNumber>= 8);
        System.out.println(myNumber <= 5);
        System.out.println(myNumber>= 8);




        /*== is used to check for equality
         and IT IS VERY DIFFERENT FROM REGULAR =
         difference between == and = same as difference between equal and equality in daily english
         */
        System.out.println(myNumber == 5);

        /* != is used to check for inequality, ! in programming is translates into NOT!
        == and != are questions, checking equality or inequality.
                 */
        System.out.println(myNumber != 10);
        System.out.println(myNumber != 6);

    }
}

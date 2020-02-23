package day06;

public class CompoundOperator {

    public static void main(String[] args) {
        /* assignment Operator =
        will save the result of whatever operation on the right side
        and assign the results to the left side variable

        += ,-= , *= ,/= ,  %= (no space between them)
        it can simplify the operation if you have a same variable
        on both side of the assignment
         */

        int studentOnLine = 263 ;

        //studentOnLine = studentOnLine + 5 ;
        studentOnLine += 5 ;


        System.out.println(studentOnLine);

        //studentOnLine = studentOnLine - 3 ;
        studentOnLine -= 3 ;
        System.out.println(studentOnLine);

        //studentOnLine = studentOnLine * 2 ;
        studentOnLine *= 2 ;
        System.out.println("The student count double " + studentOnLine);


       // studentOnLine = studentOnLine + studentOnLine ; too complicated, do not use it like this.

        studentOnLine = studentOnLine / 3 ;
        System.out.println("The student drop to 1/3 " + studentOnLine);







    }
}

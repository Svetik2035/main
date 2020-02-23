package day11;

public class LogicalOperator_Single {
    public static void main(String[] args) {
        // &&  double ampersand  & single ampersand -->> logical AND operator
        // this is used to check both conditions are true at the same time
        //&& is called short circuit AND
        //-->> it does not check the next  condition as long as the first condition is false
        //-->> just like if you have multiple condition for rocket launching
        //isEngine Running , isCommunicationSystemWorking , isAirEnough
        //isEngine Running && isCommunicationSystemWorking && isAirEnough
        //if


        /*System.out.println(7 > 5 && 1 > 7);
        System.out.println(5 > 5 && 1 > 7);
        System.out.println(1 > 5 && 9 > 7);

        System.out.println(7 > 5 & 1 > 7);
        System.out.println(5 > 5 & 1 > 7);
        System.out.println(1 > 5 & 9 > 7);*/

        //System.out.println(9/0);-->> ERROR!! CANNOT Divide By 0!!!
        // I want to check weather dividing 9/0=3
        //System.out.println(9/0==3);
        //Combine the result of checking 5>10
        // 9/0==3
        System.out.println(5>10 && 9/0==3);
        //&& -does not go further if first statement is false
        System.out.println(5>10 & 9/0==3);
        //& -does check a whole thing even first part of the statement is false
        //

    }
    }


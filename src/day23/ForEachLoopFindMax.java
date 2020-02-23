package day23;

public class ForEachLoopFindMax {
    public static void main(String[] args) {
        /**
         * create a long array of 5 items called salaries
         * put your salary amounts that ok for your offer
         *
         * use for each loop to iterate over them
         *
         *  Optionally:
         *  print only salary more than 100000
         */
        /**
         * I need to pick up an item from this array so I can compare with other items
         * since first one is right there, I just decided to pick it up
         * and make it temporarily the max value
         * I can pick 2-nd or 3-rd instead -->> YES YOU CAN!!!
         */
        /**
         * plain English
         *how do we find a max number:
         * write down the first number as a temporarily as a max number on the paper
         * then, go through each number and compare numbers
         * if some other number is bigger
         * delete that number and replace it withe biggest number
         * keep doing this until you do not have any more number left.
         */


        long [] salaries = new long []{125000l, 115000l, 120000l, 99000l, 110000l};

        long maxSalary = salaries[0];

        for (long eachSalary  : salaries){
            System.out.println("Each Salary = " + eachSalary);
            for (long salary : salaries) { // short cut -->> just type  iter
                if(salary > maxSalary){
                    maxSalary = salary ;

                }

            }
            System.out.println("maxSalary = " + maxSalary);

            }
        long [] salaries2 = new long []{-125000l, -115000l, -120000l,- 99000l,- 110000l};

        long maxSalary2 = 0;// Max never can be a zero!!!!!!
           //YOUCANNOT PICK SOMETHING THAT YOU DO NOT HAVE INSIDE AN ARRAY AS INITIAL VALUE

    }
}

package day23;

public class ForEachLoopPractice {
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
        //I did this

        System.out.println("-----me----");
        long [] salaries = {125000l, 115000l, 120000l, 99000l, 110000l};
        for (int x = 0; x < salaries.length; x++) {
            long eachSalary = salaries[x];
            System.out.println("Each Salary = " + eachSalary);


        }
        System.out.println("----Akbar------");
        //Akbar's version:
        long [] salaries1 = new long []{125000l, 115000l, 120000l, 99000l, 110000l};
        for (long eachSalary  : salaries1){
            System.out.println("Each Salary = " + eachSalary);

        }
        System.out.println("----salaries more than 100000------");
        // we are putting a condition in here to print only salaries more than 100000
                for (long salary : salaries){
                    if( salary > 100000){
                        System.out.println("salary = " + salary);
                    }
                }
                // how can I skip salaries less than or equal to 100000 to use continue
        //look below
/*
        if( salary<= 100000){
            continue;
        }
        System.out.println("salaries1 = " + salaries1);     */

    }
}

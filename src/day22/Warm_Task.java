package day22;

public class Warm_Task {
    public static void main(String[] args) {
        /*Here is the direct links to lead you to correct days
        https://learn.cybertekschool.com/courses/278/modules#3317
        this will lead you to day 21
        https://learn.cybertekschool.com/courses/278/modules#3318
        this will lead you to day 22
        https://learn.cybertekschool.com/courses/278/modules#3319
        this will lead you to day 23
        https://learn.cybertekschool.com/courses/278/modules#3320
        this will lead you to day 24
        and so on
        So write a program to generate the links to
        lead you to the right module of the day from day 21 all the way till day 56 (edited)*/
        String baseURL ="https://learn.cybertekschool.com/courses/278/modules#3317";
        String dayMsg =" this will lead you to day";
       // for (int moduleNumber =3317; moduleNumber <=3317+35 ; moduleNumber ++) {
        //    System.out.println(moduleNumber);
        //}

        //System.out.println(3317 - 21);

        //3297 is first day module ID Because I told You SO
        // get the link fromday 1 till day 22

        for (int day = 21; day <=22 ; day++) {
            System.out.println(dayMsg + day);
            //if day is 1 the number is 3397 according to requirement
            //if day is 2 the number is 3398 according to requirement
          // System.out.println(baseURL + (3317 - 21 + day));
            System.out.println(baseURL + (day + 3296));


        }
    }

}

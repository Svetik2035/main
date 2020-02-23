package day48;

public class HR_Action {
    public static void main(String[] args) {
        HourlyEmployee e1 = new HourlyEmployee("Sveta", 123, 95,2500 );
        System.out.println("e1 = " + e1);

        HourlyEmployee e2 = new HourlyEmployee("Irina", 101, 80,2000 );

        System.out.println("e2 = " + e2);

        FullTimeEmployee e3 = new FullTimeEmployee("Ainura", 103, 10000);
        e3.calculateAnnualSalary();
        System.out.println("e3 = " + e3);

        FullTimeEmployee e4 = new FullTimeEmployee("Dennis", 104, 13000);
        e4.calculateAnnualSalary();
        System.out.println("e4 = " + e4);


        // each and every class we create , it will become a data type (reference type)




    }

}

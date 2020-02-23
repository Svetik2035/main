package day48;

import java.util.Arrays;
import java.util.List;

public class HR_Staff {

    public static void main(String[] args) {

        //Employee is abstract super type
        // HourlyEmployee and FullTimeEmployee is a specific types

        // if we have an Employee data type for e1 variable
        //we
        Employee e1 = new HourlyEmployee("Sveta", 123, 95,2500 );
        e1.calculateAnnualSalary();

        e1 = new FullTimeEmployee("Ainura", 103, 10000);
        e1.calculateAnnualSalary();

        Employee e2 = new HourlyEmployee("Denis", 125, 57,2510 );

        Employee e3 = new FullTimeEmployee("Roksana", 104, 13000);

        // what is the easiest way to store these 3  objects together

        List<Employee> allEmployee = Arrays.asList(e1, e2, e3);

        for (Employee each : allEmployee){
           // System.out.println("each = "+ each);// this statement only printing out
            System.out.println("Name is : " + each.name);
            // if we want to calculate the annual salary
            each.calculateAnnualSalary();
        }


    }
}

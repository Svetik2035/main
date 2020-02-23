package day09;

public class CitizenTypeChecker {
    public static void main(String[] args) {
        // Task 2
        /*Create a class called CitizenTypeChecker with main method
                Create a variable called citizenType as String
                And create a variable with age
                If the age  is more than 65 , assign value of  citizenType to Senior
        If not , assign value of  citizenType to Not-Senior

        Both tasks optionally use Scanner*/
        String citizenType;

        int age = 80;

        if (age > 65) {
            citizenType = "Senior";
        } else {
            citizenType = "Not Citizen";
        }
        System.out.println("The citizen age is " + age + " ,and he is a " + citizenType);
        //you can do whatever you want inside  of each part in curly braces


    }
}


package ReplItHomeWork;

import java.util.Scanner;

public class Exercise_104 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String json = scan.nextLine();

        int index = json.indexOf("firstName");
        String result = json.substring(index + 13, json.indexOf("\"",index+ 14));
        System.out.println("First name: " +  result);
        int index2 = json.indexOf("lastName");
        String result2 = json.substring(index2+12, json.indexOf("\"", index2+14));
        System.out.println("Last name: "+ result2);

    }
}
        /* TASK
In this task, we gonna talk about JSON files. JavaScript Object Notation (JSON)
-  is a language-independent data format. Write a program that will parse JSON file,
 and print out into the console first name and last name as displayed in the example below.
 In this task, JSON file will be provided as a String variable.
Example:
input:{"id": 1934, "firstName": "James", "lastName": "May", "role": "student-team-member"}
output:
First name: James
Last name: May

Hint:  Use substring() method in order to slice this variable,
and indexOf()method in order to identify position of characters.
Snippet from JSON file that describes team in the BookIT application.
{
        "id": 1933,
        "name": "HighTech",
        "members": [
            {
                "id": 1934,
                "firstName": "James",
                "lastName": "May",
                "role": "student-team-member"
            },
            {
                "id": 1935,
                "firstName": "John",
                "lastName": "Dillinger",
                "role": "student-team-member"
            },
            {
                "id": 1936,
                "firstName": "Eloisa",
                "lastName": "MacCauley",
                "role": "student-team-member"
            },
            {
                "id": 1937,
                "firstName": "Bess",
                "lastName": "Lebond",
                "role": "student-team-leader"
            },
            {
                "id": 1938,
                "firstName": "Hunt",
                "lastName": "Durand",
                "role": "student-team-member"
            }
        ]
    },
 String result = json.substring(index+13, json.indexOf("\"",index+13+1));
        System.out.println(result);
        * */











      /*  Scanner scan = new Scanner(System.in);
        String json = scan.nextLine();

        String firstN = json.substring( json.indexOf("firstName")+13 , json.indexOf("\",") );
        System.out.println("First name: "+firstN);
        String lastN = json.substring( json.indexOf("lastName")+12 , json.indexOf("role")-4  );
        System.out.println("Last name: " + lastN);*/



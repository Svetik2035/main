package String_Methods;

public class Task1_string {
    public static void main(String[] args) {
        /*Task 1:
        Given a String with any possible length including 0
        print first 2 characters only if the String has more than 1 character
        if the String is empty print Empty String
        else print the first char twice in same Link
        for example :
        "abcde" --> ab
        ""        --> empty String
        "J"       --> JJ*/

        String name = "j";
        if(name.length()>2){
            System.out.println(name.substring(0,2));
        }else if(name.isEmpty()){
            System.out.println("Empty String");
        }else{
            System.out.print(""+ name.charAt(0)+ name.charAt(0));
        }


    }
}

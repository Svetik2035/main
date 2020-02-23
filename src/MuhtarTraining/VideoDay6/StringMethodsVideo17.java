package MuhtarTraining.VideoDay6;

public class StringMethodsVideo17 {
    public static void main(String[] args) {

    //these two Strings were created by string literals
    //and since, they are identical, only one String instance will be created
    // in the String pool
    String str1 = "Hello Javengers";
    String str2 = "Hello Javengers";
    boolean R1 = str1 == str2; // true
    System.out.println(R1);

 /*
 * this is an interview question:
 * Are these two strings are equal to each other?
 * the answer is: no,
 * because two of these are created in heap memory, by using "new " keyword
 * which means that these two are two separate objects*/
    String str3 = new String("Hello Javengers");
    String str4 = new String("Hello Javengers");
        boolean R2 = str3 == str4; // false
        System.out.println(R2);

    }

}

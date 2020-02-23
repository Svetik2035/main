package String_Methods;

public class StringClass {
    public static void main(String[] args) {
        // these three objects are created and stored in String Pool
        // and they all will have the same memory location
        String str = "Cybertek";
        String A = "Cybertek";
        String B = "Cybertek";

        System.out.println(A==B);//true

        String str2 = new String("Cybertek");
        System.out.println(str==str2);// false, because this object was created outside of String Pool in the heap memory





    }

}

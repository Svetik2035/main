package String_Methods;

public class StringMethods_Practice {
    public static void main(String[] args) {
    //index number  012345678901234567
        String a = "Batch 12 Javangers";
        System.out.println(a.charAt(9));// this is just prints one character one time, but string stays the same

        char ch1 = a.charAt(14);// extracts a specific character of the string and returns a specific char value
        System.out.println(ch1);//printing the char value==> g, which has index 14 in my String a;

        int length = a.length();
        System.out.println(length);//it gives number count, and it counts from 1
        //if I need to find number index, I have to subtract 1
        int HighestIndexNum = a.length()-1;//index
        System.out.println(HighestIndexNum);

        String b = "Cybertek";
        b.concat("Batch 12 Javangers");

        System.out.println(b);

        // we can do it in two methods:
        // 1. either make a brand new String c and concat it with be

        String c = b.concat(" Batch 12 Javangers");//
        System.out.println(c);
        //2. re can reassign the value to String b
        b = b.concat(" Batch 12 Javangers");
        System.out.println(b);

        String d = "book";
        System.out.println(d.toUpperCase());// it will only print once=> BOOK
        System.out.println(d);// it will print an original value=> book

        //in order to change an original value of the String d we have to reassign a new value
        d = d.toUpperCase();
        System.out.println(d);//BOOK
        System.out.println(d);//BOOK

        String e = "JAVA IS FUN";
        e.toLowerCase();
        System.out.println(e);//JAVA IS FUN
        e =e.toLowerCase();
        System.out.println(e);




    }
}

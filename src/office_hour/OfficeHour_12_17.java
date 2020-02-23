package office_hour;

public class OfficeHour_12_17 {
    public static void main(String[] args) {
       // String method, nested loop

      //data type: primitive   and non-primitive

        /* primitive: byte, short, int ...
        non-primitive : Scanner String Array
         */
        int number = 6;
       // String word = "java";
        String word = "java! ,+";
        System.out.println(word); // java

        System.out.println("word");//word

        System.out.println(number);//6

        System.out.println(number+6);//6+6=12 this will print 12

        // in order to see how many chars we have in variable
        System.out.println("there are total " + word.length() + " chars in word");

        System.out.println("I have 6" + 7);//I have 67

        System.out.println("I have 9" + 1 + 2);//I have 912

        System.out.println("I have 8"+ (1+4));
        // I have 8 + (1+4) = 5(it will be math calculated in parenthesis and it will print=>I have 85;
        System.out.println((2+3) + (3+5));// 13
        //                    5  +    8  =13
          //           01234567890123456789
        String book = "learn java in 1 day";

        System.out.println("first j's index "+ book.indexOf("j"));// 6 ; which equals to 6 index position in this sentence

        System.out.println("last j's index "+ book.lastIndexOf("j"));

        System.out.println(book.length());// it will print number of characters in the String sentence

        // I want only one char -->>l
        System.out.println(book.charAt(0));

        System.out.println(" I am looking for a space " + book.charAt(5));// 5-th index is a space,
        // and  it is here, but we cannot see : _ I am looking for a space

        //we can use a subString  method to get one or more chars
        String student = "Rabia";
        System.out.println(student.length());//5==>> int
        int i = 9;
        int lengthOfStudent = student.length();//5

        // int lengthOfStudent = 5;

        System.out.println(student.substring(2));//bia

        System.out.println(student.substring(1,2));//a

        System.out.println(student.substring(0,1));//R

        System.out.println(student.substring(4));// last a

        System.out.println(student.substring(4,5));//last a

        System.out.println(student.toUpperCase());//RABIA

        System.out.println(student.toLowerCase());// rabia

        String lowerStudent = student.toLowerCase();
        System.out.println(lowerStudent);//rabia

        String batch = "Online";

        //toUpperCase + length

        System.out.println(batch.toUpperCase().length());//ONLINE

        System.out.println("Asiya".toUpperCase().toLowerCase().length());//does not print, find out why










    }
}

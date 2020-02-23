package day20;

public class Get2SiblingChar {
    public static void main(String[] args) {

        // given a String with even number character count
      // print 2 characters in one line as below example
        //
     // for example  :  Ayra
     /*
       Ay (0,2)
       yr (1,3)
       ra (2,4)
     */
       String name ="Ayra";
       int lastCharIndex = name.length()-1;


        /*System.out.println( name.substring(0,2) );
        System.out.println( name.substring(1,3) );
        System.out.println( name.substring(2,4) );*/

        for (int i = 0; i<= lastCharIndex-1; i++) {

            System.out.println(name.substring(i, i+2) );//i+2 ->gives me 2 characters
        }
                       //  0123
        // for example  :  Ayra
     /*                    1234
       Ayr (0,3)
       yra (1,4)
       System.out.println( name.substring(0,3) );
       System.out.println( name.substring(1,4) );

     */
        System.out.println("Getting 3 characters ");
        for (int i = 0; i<= lastCharIndex-2; i++) {


            System.out.println( name.substring(i, i+3) ); //i+3 ->gives me 3 characters
        }




    }

}

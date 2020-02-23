package day17;

public class namePrinter_WhileLoop {
    public static void main(String[] args) {
        // if you have complain in life : call 1-800-Alexander
        String name = "Svetlana";
        //get each and every character and printing them out vertically
        int x = 0;
        while(x < name.length() ){//( x<= name.length()-1)
            System.out.print("index" + x + " : ");
            System.out.println( name.charAt( x ));
            ++x ;
        }
      /*in order to print each character of a string
      we need to start getting character
     from index 0 til last index (name.length()-1 );
      */


    }
}

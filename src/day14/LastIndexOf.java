package day14;

public class LastIndexOf {
    public static void main(String[] args) {
     // lastIndexOf -> 012345678901
        String name = "Game of Java" ;//length is 12, but last corrector index is 11

        ////find out the last location of the letter shows up
        System.out.println("find out the last location of the letter shows up");
        System.out.println( name.lastIndexOf("a"));

        //find out the last location of the character space shows up
        System.out.println("find out the last location of character space shows up");
        System.out.println( name.lastIndexOf(" "));
        //find out the last location of the letter Ga shows up
        System.out.println("find out the last location of the letter Ga shows up");
        System.out.println( name.lastIndexOf(" Ga"));
        //find out the last location of the letter Kawa shows up
        System.out.println("find out the last location of the letter Kawa shows up");
        System.out.println( name.lastIndexOf(" Kawa"));

        //if I DON'T USE contains methd, what whould be my condition to check
        //weather we have Kawa in this String, either indexOf or lastIndexOf
    }
}

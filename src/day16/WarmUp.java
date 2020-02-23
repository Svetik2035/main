package day16;

public class WarmUp {
    public static void main(String[] args) {
        /*WAKE UP Task 1 :
        Given a word with 4 characters
        stored in a String variable word1
        create a String variable called word2
        store the reversed word1 into word 2
        and print out
        FOR EXAMPLE :
        word1 ==> Java    -->> word2 avaJ
        -- optionally ask this word from scanner*/
        String word1 = "Java";
        String word2 ="";
        //word2 =  "" + word1.charAt(3) + word1.charAt(2) + word1.charAt(1) + word1.charAt(0) ;
       // word2  = word2 +  word1.charAt(3) + word1.charAt(2) + word1.charAt(1) + word1.charAt(0) ;
       // word2  +=  word1.charAt(3) + word1.charAt(2) + word1.charAt(1) + word1.charAt(0) ;


        word2 = ""+ word1.charAt(3) + word1.charAt(2) + word1.charAt(1) + word1.charAt(0);

        System.out.println("word2 = " + word2);
        //I wont to add at the end of it
        String msg = "Hello ";
        msg =msg + "World !";
        //or you can write msg+= "World !";
        System.out.println("msg = "+ msg);


//In order, to reverse the word, you have to take last corrector,
        // and put at the place of the first corrector
        //start getting from last location till first location then save it


    }

}

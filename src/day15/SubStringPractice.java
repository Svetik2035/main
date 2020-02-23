package day15;

public class SubStringPractice {
    public static void main(String[] args) {
        //getting the part of theString out of another String
        //             0123456789012345--Index
        String movie ="Lord Of The Ring";
        //I want to get the word <of> from this the name movie
        // we need to remove word <Of> and we need to put
        // substring will return part of another string
        //starting from beginning index which is included ->5 in our example
        //and ending index is not included in our example -> 7
        String wordOf = movie.substring(5,7);
        System.out.println("wordOf = " + wordOf);

        String wordThe = movie.substring(8,11);
        System.out.println("wordThe = " + wordThe);

        //get from a second word till last word ! Right after first words second words starts, where it ends at
        //                       0123456789012345--Index
        //        String movie ="Lord Of The Ring";
        // find out first space index, second word starts right after first space
        //so that is our starting point
        //my ending point is one more than last index.

        int startingPoint = movie.indexOf(" ")+ 1;
        int endingPoint = movie.length();
        System.out.println("second word till last :" + movie.substring(startingPoint, endingPoint));

        //assume that we already know the location of starting point of second word
        // and the ending of the sentence
        String secondWordTilLast =movie.substring(5,16);
        System.out.println("secondWordTilLast = " + secondWordTilLast);

        String wordLordOf =movie.substring(0,7);
        System.out.println("wordLordOf = "+ wordLordOf);

        //if you want to start from somewhere and just get the rest of the String
        //above method works; however, there is even better method

        String secondToLast = movie.substring(5);

        // with with in mind: Task
        //                       0123456789012345--Index
        //        String movie ="Lord Of The Ring";
        //reverse Lord Of The Ring -->> Ring Of The Lord
        //ring(12,16),of the(4,12) -space included-->> this is not change, lord(0,5)
        String wordRing =movie.substring(12,16);//or just (12);
        String wordOfThe =movie.substring(4,12);
        String wordLord = movie.substring(0,4);
        System.out.println(wordRing + wordOfThe + wordLord);

        //TURN-->> Lord of The Ring -->> Ring Of The Java Lord
        System.out.println(wordRing + wordOfThe +"Java "+ wordLord);






    }
}

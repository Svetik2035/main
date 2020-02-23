package day20;

public class findDogInASentence {
    public static void main(String[] args) {
        //given a sentence, find out the location of the dog
        // our approach is
        // going through the sentence 3 characters at the time
        //then three characters happened to be a dog , we will print out the index

        /**0123456789012345678901234567890123456789012345
         * I like Dog , Dogs are cute , dogs are friendly
         * I l
         *
         */
        String msg ="I like Dog , Dogs are cute , dogs are friendly" ;
        int lastCharacterIndex = msg.length()-1 ;

        for (int i = 0; i <= lastCharacterIndex; i++) {

            String current3Chars = msg.substring (i, i+3) ;
            //System.out.println(i + " : " + current3Chars);
            if(current3Chars.equals("Dog") ){
                System.out.println("Bingo !!! At " + i);
            }


        }
    }
}

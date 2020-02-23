package day25;

public class FindTheLongestWornInTheSentence {
    public static void main(String[] args) {
        // find repl about it !!!!!!!
        String sentence = "We all love Java Coding intensively all the time";
        String [] allWords = sentence.split(" ");

        String longestWord =  "";
        int maxCharCount = 0 ;

        //first create a string variable longestWord to store my result
        //also, create maxChar Count  variable to store my longest char count
        //I want to go through each and every word in String array
        //and check weather the length of current  word is more than longestWord
        //I want to go through each and every character and each and every word

        for (String currentWord : allWords) {
            if(currentWord.length() > longestWord.length() ){
                longestWord = currentWord;
            }
        }
        System.out.println(" longestWord = " +  longestWord);
    }
}

package day63;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {
        String str = "Finding Words Frequency Sounds Fun Because Fun Comes in When you count Words" +
                " But How do I count the Words with what I already know previously " +
                "Do it and find out Words Words Words";

        String[] allWords = str.split(" ");
        System.out.println("allWords.length = " + allWords.length);
        Map<String, Integer> wordFreMap = new HashMap<>();
        for(String currentWord : allWords){
            if(wordFreMap.containsKey(currentWord) == false){
                wordFreMap.put(currentWord,1);
        }else{
                int newCount =wordFreMap.get(currentWord) + 1;
                wordFreMap.replace(currentWord, newCount);
            }
    }
        System.out.println("wordFreMap = " +wordFreMap);
    }
}

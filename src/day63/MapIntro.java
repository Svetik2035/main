package day63;

import java.util.HashMap;
import java.util.Map;

public class MapIntro {
    public static void main(String[] args) {

        //Compare to list, Set which stores a single element per item
        //map stores key-value pair per item
        // That  is why we need a data type inside <>
        //one for the key one for the value
        //map does not stores primitives, only Objects!!!!

        Map<String,String> nameAndStatePair = new HashMap<>();

        Map<Integer,String> groupNumLeaderNamePair = new HashMap<>();

        Map<String,Double> groceryNameAndPricePair = new HashMap<>();

        Map<String,Boolean> voterAndEligibilityPair = new HashMap<>();

        Map<String,Integer> gameNameAndScoreMap = new HashMap<>();

        Map<String,Character> QuestionNumAndCorrectAnswerPair = new HashMap<>();

    }
}

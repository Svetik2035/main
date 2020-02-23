package Day26;

import java.util.Arrays;

public class ToCharArrayWithArraysClassMethod {
    public static void main(String[] args) {
        //2 additional String methods related to array
        //toCharArray() , another is split (bySomething)
        String survey = "Complete b15 online 1 Month Survey";
        char[] surveyChars = survey.toCharArray();
        System.out.println("Before surveyChars = " + Arrays.toString(surveyChars));

        Arrays.sort(surveyChars);

        System.out.println("After surveyChars = " + Arrays.toString(surveyChars));
    }
}

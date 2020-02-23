package Day26;

public class SplitPractice {
    public static void main(String[] args) {
        //2 additional String methods related to array
        //toCharArray() , another is split (bySomething)
        String survey = "Complete b15 online 1 Month Survey";
        char[] surveyChars = survey.toCharArray();
        //how do I determine to use char for for each?
        //-because each item in char array is the char
        for (char each : surveyChars) {
            System.out.println("each char is = " + each);

        }
        //just for fun let's do a while loop
        int x = 0;
        while (x < surveyChars.length) ;
        System.out.println("each char is = " + surveyChars[x]);
        x++;

        //or use for loop
        for (int i = 0; i < surveyChars.length; i++) {
            System.out.println("each char is = " + surveyChars[i]);
        }
        // or do while loop
        int y = 0;
        do {
            System.out.println("each char is = " + surveyChars[y]);
        } while (y < surveyChars.length);



    }
}

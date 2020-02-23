package ReplItHomeWork;

public class Exercise_180 {
    public static void main(String[] args) {
        System.out.println(coverString("java methods", "me") ) ; //java [me]thods
    }

    public static String coverString(String main, String coverME) {
        String result= "";
        if(main.contains(coverME)){
          result= main.replace(coverME, "["+ coverME +"]");

    }
        return result;
    }
        /*int l = coverME.length();
        String word = "";
        for(int i =0; i< main.length()-l; i++){//main.length()-l - we need to put this at
            // the end to do not get over the last one
            if(main.substring(i, i+l).equals(coverME)){
             word= main.replace(coverME, "["+ coverME +"]");


            }
        }
        return word;
    }*/


  /*
Instructions from your teacher:
coverString method will take 2 string parameters from the caller.

Your job is to write an important code that will :

- to search and find each appearance of coverME within main
- then surround it with [coverMe] (square brackets)
- if you cannot find the coverME within main after tirelessly looping then just return whole main itself covered [main].
- keep in mind that coverME value can be of any length.*/



}

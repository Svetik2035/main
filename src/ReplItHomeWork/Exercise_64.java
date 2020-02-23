package ReplItHomeWork;
public class Exercise_64 {
    public static void main(String[] args) {


   /* my logic: 1 of many ways to solve this problem
   if single character -->>print this character 3 times
   is 2 character -->> print those two characters twice
   if odd number of characters and 3 or more characters
   -->> get the middle one : lengthOf YourWord/2
   -->> 012  3/2 = 1  01234 5/2=2
        LOL           TODAY
  if even number of characters and 4 or more characters,
  --> print middle 2
      0123 4/2=2             012345   6/2=3
      word 2-1, 2-->>        KAMRAN   3-1, 3-->>MR
    */
        String word = "abc";
        int charCount = word.length();
        if (charCount == 1){
            System.out.println(word+word+word);
        }else if(charCount == 2){
            System.out.println(word+word);
        }else if(charCount > 2){
            //if the word character count is more than 2 then I worry about it is even or odd
           if(charCount%2==1) {
               int indexOfMidCharacter =charCount/2;

               System.out.println( word.charAt (charCount/2) );
           }else{
               int indexOfFirstHalf = charCount/2 - 1;
               int indexOfSecondHalf = charCount/2 ;
               System.out.println( word.charAt(indexOfFirstHalf) + " " + word.charAt(indexOfSecondHalf));
           }
        }

        //Instructions from your teacher:
        //Write a program that will print out last letter of the word (string).

    /*You have a word, do the following:

            1. When word has odd number of characters and:
            - 3 or more characters, print middle letter
    oak ==> a
    javav ==> v
             - Single character, print that character 3 times
      # ==> ###
    q ==> qqq

2. When word has even number of characters and:
            - 4 or more characters, print middle 2
    java ==> av
    apples ==> pl
     #$%^&* ==> %^
            - 2 characters, print those 2 characters twice
    @@ ==>@@@@
            $$ ==>$$$$
    hi ==> hihi*/


    }
}
package day17;

public class Warm_NameCorrector {
    public static void main(String[] args) {
        //WAKE UP TASK 1 :
        //create a class called WakeUp_NameCorrector with main
        //Create a String variable to store your name in any case combination
        //for example  jon jOn jON  any of them :
        //Create a variable called name2
        //make your first letter uppercase then rest lowercase
        //jon  ---> Jon    arya -->> Arya
        //Optionally ask your name from Scanner
        //Optionally ask your full name
        //-->> then make your full name first letter uppercase the rest lowercase
        //             01234567
        String name = "kHumAyRa";
        //     add an empty string
        /*1 way:
        String nameFixed = (name.charAt(0) + "").toUpperCase();
               nameFixed = nameFixed + name.substring(1).toLowerCase();
                                     // first index*/
        String nameFixed = name.toUpperCase().substring(0,1);
        name+= name.substring(1).toLowerCase();
        System.out.println("nameFixed = " + nameFixed);
      /*1 way: get the first character -->> make it uppercase
      get the rest of the characters starting from 2-nd character
      then make it lowercase
      eventually concatenate them
      2 way: make whole name uppercase then get the 1-st character
      get the rest of the characters starting from second  character
      then make it lowercase
      eventually concatenate them

       */
    }
}




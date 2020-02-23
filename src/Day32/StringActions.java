package Day32;

public class StringActions {
    public static void main(String[] args) {
                    /*Create below static void methods :
            and call them in main method to test.
            reversePrintMyOwnName
            * create a method that has no parameter
                and print your name in reversed order
            reversePrintAnyName*/
        String name ="Svetlana";
      //  printMyNameReversed();


    }
    public static void printStringWithDashInBetween(String name){


     //print each and every character of a String with dash in betwen
    //excluding the last dash--> S-v-e-t-l-a-n-a
    //logic : keep concatenating- after each character
    //when it comes to the last character, do not add a dash

        for (int i = 0; i <name.length() ; i++) {
        System.out.print(name.charAt(i));
        if(i != name.length()-1) {//print dash if I am not at the last character
            System.out.print("-");

    }
  //  public static void printMyNameReversed(){
          for (int x = name.length()-1; x >=0 ; x--) {
              //starts from las character and print your name in the reversed order towards first character
              System.out.print(name.charAt(x));
              //or if (i != 0) {
              //    System.out.print(myName.charAt(i) + "-");
              //} else {
              //    System.out.print(myName.charAt(i));
              //}
          }

     //   or System.out.println(name.charAt(7) + " "+name.charAt(6) + " "+name.charAt(5)
              //  + " "+name.charAt(4) + " "+name.charAt(3) + " "+name.charAt(2) + " "+name.charAt(1) + " "
         //       + name.charAt(0));
        }
           /* create a method that has 1 String parameter called name
                and print that name in reversed order
            printLastCharacterOfName*/
   // public static void (){

            /* create a method that has 1 String parameter called name
                and print last character of that name
            printFullNameInformation
            * create a method that has 2 String parameter called firstName,lastName
                and print "Your first name is firstName , Your last Name is lastName
                    print " your full name lenth is lengthOfTheFullName"
            compareNameCharacterCount
            * create a method that has 2 String parameter called name1,name2
                if name 1 has more characters
                     print " name 1 is longer "
                if name 2 has more characters
                     print " name 2 is longer "
                if name 2 has same character count
                     print " name 1 and name 2 same character count "
            printAtoZ
            * create a method that has no parameter
                and print A-Z in one line
            printZtoA
            * create a method that has no parameter
                and print Z-A in one line
            printAlphabetInRange
            * create a method that have 2 char as parameters: beginning, ending
            if beginning character is before ending character
                for example beginning A , ending D  -->> ABCD
            if beginning character is after ending character
                for example beginning D , ending A  -->> DCBA*/
        //reversePrintMyOwnName();

        //String name = "Akbar";
        printStringWithDashInBetween("Hasan");
        printStringWithDashInBetween("Arya");
        printStringWithDashInBetween("Tolkun");
        printStringWithDashInBetween("Lisa");
        printStringWithDashInBetween("Gulbara");

    }
    // printStringWithDashInBetween
    // it has one String parameter called name
    // it will do following in method body
    // print each and every character of a String with dash in between
    // excluding the last one Akbar -->> A-k-b-a-r
    // logic : keep concatenating - after each character
    // when it comes to last character don't add it

    /*public static void printStringWithDashInBetween(String name) {
        //String name = "Tokun" ;
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
            // if I am not at last index then I print -
            if (i != name.length() - 1) {
                System.out.print("-");
            }
        }
        System.out.println();

    }*/


    /*
    * reversePrintMyOwnName
    * create a method that has no parameter
	    and print your name in reversed order
    * */
    public static void reversePrintMyOwnName() {
        //             01234
        String name = "Akbar";
        // start from last character and print toward first character
        for (int i = name.length() - 1; i >= 0; i--) {

            System.out.print(name.charAt(i));
        }
        System.out.println();

    }


}





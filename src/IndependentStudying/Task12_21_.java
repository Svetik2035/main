package IndependentStudying;

public class Task12_21_ {
    public static void main(String[] args) {
                            /*Create below static void methods :
                            and call them in main method to test.
                            reversePrintMyOwnName
                                    * create a method that has no parameter
                            and print your name in reversed order
                                    reversePrintAnyName*/
                            reversePrintMyOwnName();
                 printLastCharacterOfName("computer");
                 printFullNameInformation("Svetlana", "Gorokhova");
                compareNameCharacterCount("Svetlana", "Denis");
                compareNameCharacterCount("David", "Denis" );
                compareNameCharacterCount("Oleg","Svetlana");

    }
     public static void   reversePrintMyOwnName(){
         String name = "Svetlana";
        for (int i = name.length()-1; i >=0 ; i--) {
        System.out.print(name.charAt(i));

         }
         System.out.println();

        }
        public static void printLastCharacterOfName (String name){
        /* * create a method that has 1 String parameter called name
          and print that name in reversed order
           printLastCharacterOfName*/
            System.out.println(name.charAt(name.length()-1));

        }
                   /* * create a method that has 1 String parameter called name
                            and print that name in reversed order
                                    printLastCharacterOfName
                    * create a method that has 2 String parameter called firstName,lastName
                            and print "Your first name is firstName , Your last Name is lastName
                            print " your full name length is lengthOfTheFullName"*/
         public static void   printFullNameInformation(String firstName, String lastName){
             System.out.println("Your first name is firstName " + firstName);
             System.out.println("Your last name is lastName " + lastName);
             int lengthOfTheFullName = firstName.length() + lastName.length();
             System.out.println(lengthOfTheFullName);


         }
         public static void compareNameCharacterCount(String name1 , String name2){
              /*  compareNameCharacterCount
                                    * create a method that has 2 String parameter called name1,name2
                            if name 1 has more characters
                            print " name 1 is longer "
                            if name 2 has more characters
                            print " name 2 is longer "
                            if name 2 has same character count
                            print " name 1 and name 2 same character count "*/
              if(name1.length()> name2.length()){
                  System.out.println(" name 1 is longer ");
              if(name2.length()> name1.length()){
                  System.out.println(" name 2 is longer ");
              }else if (name1.length()== name2.length()){
                  System.out.println(" name 1 and name 2 same character count ");
              }
              }
         }




                           /* printAtoZ
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
                        }


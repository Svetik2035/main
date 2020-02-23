package day19;

        public class CharAndForLOOP {
            public static void main(String[] args) {
                //each character has it's corresponding ASCII value\
                //from ASCII table
               // int x = 'A' ;
               // System.out.println(x);

                char myChar = 'A' ;// can be char myChar = 65; and it will give the same results

                System.out.println(myChar);
                //'A' + 1 -->> 65+ 1= 66 -->>'B' (myChar data type is char)
                System.out.println( ++myChar );
                //'B' + 1 -->> 66+ 1= 67 -->>'C' (myChar data type is char)
                System.out.println( ++myChar );
                //'C' + 1 -->> 67+ 1= 68 -->>'D' (myChar data type is char)
                System.out.println( ++myChar );
                //'D' + 1 -->> 68+ 1= 69 -->>'E' (myChar data type is char)
                System.out.println( ++myChar );

                System.out.println('A' >'B'); //65>66
                System.out.println('Z'> 'B');// 90>66

                for( char iChar = 'A' ; iChar <= 'Z' ; iChar++) {
                    System.out.println(iChar + " ");

                }
                System.out.println();
                for (char kChar  = 'Z'; kChar>= 'A' ; kChar --) {
                    System.out.println(kChar + " ");

                }
                //  HOMEWORK
                // CREATE AN INTERACTIVE PROGRAM TO ASK USER
                // STARTING CHARACTER AND ENDING CHARACTER
                // THEN PRINT EVERYTHING IN BETWEEN
                // IT COULD BE STARTING CHARACTER IS AFTER ENDING CHARACTER
                // FOR EXAMPLE USER CAN ENTER  Z A  , or A K
                // Can we ask user character ? NO!!!!
                // Ask user for String and pick first character by charAt(0)

            }

}

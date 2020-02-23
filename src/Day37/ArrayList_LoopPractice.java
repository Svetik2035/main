package Day37;


import java.util.ArrayList;

public class ArrayList_LoopPractice {
    public static void main(String[] args) {
        /**
         * find longest name in List of String that contains 6 names
         */
             
        ArrayList<String> nameLst = new ArrayList <String>();
        nameLst.add("Svetlana");
        nameLst.add("Tatiana");
        nameLst.add("Marina");
        nameLst.add("Christina");
        nameLst.add("Alexandra");
        nameLst.add("Yevgeniya");

        System.out.println("nameLst = " + nameLst);

        String longestName ="";

        for (int x = 0; x <nameLst.size() ; x++) {
             String currentName =nameLst.get(x);

             if(currentName.length() > longestName. length()){
                 longestName = currentName;
             }

        }

        //System.out.println("longestName = " +longestName);

        for (int i = 0; i < nameLst.size() ; i++) {
           if( nameLst.get(i).length() == longestName.length()){
               System.out.println("Longest Words = " + nameLst.get(i));
           }

        }
        
        /*ArrayList<String> nameLst =new ArrayList<String>();
        nameLst.add("Qalbinur");
        nameLst.add("Ruzi");
        nameLst.add("Sabahiddin");
        nameLst.add("Guzelnur");
        nameLst.add("Guzelnurin");
        nameLst.add("Muyesser");
        nameLst.add("Mustafa");
        nameLst.add("Ayjerenjan");
        System.out.println("nameLst = " + nameLst);

        // find a longest name
        //assume the first one is the longest name and compare with the rest of them
        String longestName = " " ;
        for (int x = 0; x <nameLst.size() ; x++) {
            String currentName = nameLst.get(x) ;
            if( currentName.length() >= longestName.length()){//add "=" in condition, if
                // I have two the same longest name length word, and it will be replaced with last one
                longestName =currentName ;

                for (int i = 0; i <nameLst.size() ; i++) {

                    if(nameLst.get(i).length()== longestName.length()){

                    }

                }
                System.out.println("Longest words = " +longestName);

                System.out.println("----------------------");
            //  for(  currentName : nameLst) {
                    System.out.println("currentName = " + currentName);

                }
            }*/
        }





    }


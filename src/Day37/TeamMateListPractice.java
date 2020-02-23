package Day37;

import java.util.ArrayList;
import java.util.List;

public class TeamMateListPractice {
    public static void main(String[] args) {
        /**Warm up:
         Create Arraylist of String and store
         teamMates
         print one by one
         print reverse
         print first last
         print 2 at a time
         concat everyone in one string separated by -
                  */
        List<String> teamMates =new ArrayList<>();

        teamMates.add("Nodira");
        teamMates.add("Nursultan");
        teamMates.add("Arzu");
        teamMates.add("Gulnar");
        teamMates.add("Kahren");
        teamMates.add("Sultan");
        teamMates.add("Tatsiana");
        teamMates.add("Andrea");
        teamMates.add("Hasibe");
        teamMates.add("Svetlana");
        teamMates.add("Timur");
        teamMates.add("Beibit");
        teamMates.add("Rabia");
        teamMates.add("Ghoya");
        teamMates.add("Layle");

        System.out.println("teamMates = " + teamMates);

        // first item
        System.out.println("First Item = " + teamMates.get(0));

        //last item-->> using last index--> size-1
        int LastItemIndex = teamMates.size()-1;
        System.out.println("Last Item = " + LastItemIndex);

        //print one by one
        System.out.println("\n All Items : ");
        for (int x = 0; x <teamMates.size() ; x++) {
            System.out.println("\tItem " + (x+1) +" = " + teamMates.get(x));

        }
        System.out.println("\nAll Items in reverse order : ");
        for (int x =LastItemIndex; x >=0 ; x--) {
            System.out.println("\tItem " + (x+1) + " = " +teamMates.get(x));


        }
        System.out.println("\nPrint 2 items at a time : ");
        //Print 2 items at the time
        // for example : 1-2, 2-3, 3-4, 4-5(printing second item two times)

         for(int x = 0 ; x<=teamMates.size()-2; x++){
             //x<=teamMates.size()-2 ==> it means print two items at the time
             System.out.println("\t" + teamMates.get(x) +"---"+ teamMates.get(x+1));

         }
        //Print 2 items at the time
        // for example : 1-2, 3-4, 5-6, 7-8(printing second item two times)
        System.out.println("\nPrint Two items without repeating:  ");
        for(int x = 0 ; x<=teamMates.size()-2; x+=2) {
            //x<=teamMates.size()-2 ==> it means print two items at the time
            System.out.println("\t" + teamMates.get(x) + "---" + teamMates.get(x + 1));
        }
        //Challenge : Pair them up by 3
        // concat everyone in one String separated by dash "-"
        String result = "";
        for (int i = 0; i <teamMates.size() ; i++) {
            result =result + teamMates.get(i) + "-";

        }
        System.out.println("result = " + result);
        //TODO : Remove the last Dash
        String lstToString =teamMates.toString();
        System.out.println("lstToString after replacing = \n" + lstToString.replace("," , "-"));

        }

}

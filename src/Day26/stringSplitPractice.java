package Day26;

import java.util.Arrays;

public class stringSplitPractice {
    public static void main(String[] args) {
        String students = "Abbos, Zulyr, Zhibek, Hasan, Muge, Orphan, Susan" ;
        
        students =students.replace(" ","");
        System.out.println("students = " + students);

        String [] namesArrays =students.split(",");
        System.out.println(Arrays.toString(namesArrays));

        System.out.println("length of nameArrays is " + namesArrays.length);

        int studentCount =namesArrays.length;
        for (int x = 0; x <studentCount ; x++) {
            String name = namesArrays[x];
            System.out.println("Spelling " + name + " : \t");
            for (int i = 0; i <name.length(); i++) {
                System.out.print(name.charAt(i) + "-");

            }
            System.out.println();


        }
       /* System.out.println("students.replace = " + students.replace(" ", "" ));//get rid of space
        String [] namesArrays1 = students.split( " ");

                //{"Abbos", "Zulyr", "Zhibek", "Hasan", "Muge", "Orphan", "Susan" };
        System.out.println(Arrays.toString((namesArrays1)));
        System.out.println("namesArrays1 is = " + namesArrays1.length);
        // first, get all the names into string Array called namesArray

        //Spell the name of each person in this format
        //A-b-b-o-s-......
        //Z-u-l-y-r-......
        String name = " Abbos"; //namesArrays[0];
        for (int i = 0; i <name.length() ; i++) {
            System.out.print(name.charAt(i) + "-");
        }

        String[] namesArrays = new String[0];
        String name1 = namesArrays[1]; //namesArrays[0];
        for (int i = 0; i <name1.length() ; i++) {
            System.out.print(name.charAt(i) + "-");
        }

        //Optionally, count a from each name I print

        String students1 = "Abbos, Zulyr, Zhibek, Hasan, Muge, Orphan, Susan" ;
        System.out.println("students.replace = " + students.replace(" ", "" ));//get rid of space
        String [] namesArrays2 = students.split( ",");*/


    }
}

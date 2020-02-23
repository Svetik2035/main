package Day26;

import java.util.Arrays;

public class NewCheck1 {
    public static void main(String[] args) {
        String students = "Abbos, Zulyr, Zhibek, Hasan, Muge, Orphan, Susan" ;
        String [] namesArrays =students.split(",");
        System.out.println(Arrays.toString(namesArrays));
        int studentCount =namesArrays.length;
        for (int x = 0; x <studentCount ; x++) {
            String name = namesArrays[x];
            System.out.println("Spelling " + name + " : \t");
            for (int i = 0; i <name.length(); i++) {
                System.out.print(name.charAt(i) + "-");

            }
            System.out.println();
    }}}


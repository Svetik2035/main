package day62;

import day61.Job;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetIntro {
    public static void main(String[] args) {

        SortedSet<Job> sortJob = new TreeSet<>();
        sortJob.add(new Job("FL",120000,"AT&T"));
        sortJob.add(new Job("LA",110000,"BBC"));
        sortJob.add(new Job("NY",140000,"USPTO"));
        sortJob.add(new Job("CA",150000,"Apple"));
        sortJob.add(new Job("WA",145000,"Microsoft"));

        for(Job each: sortJob){
            System.out.println("each = " + each);
        }





    }
}

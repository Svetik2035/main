package day64;

import java.util.*;

public class MapPractice {
    public static void main(String[] args) {

        // What if we want to have multiple value for one key ??
        // for example groupCode (bugHunter) -- group member names (abc, efg , htj , knl)
        // String         List<String>
        // key data type is String , value data type is List<String>
        Map<String, List<String> > groupMap = new HashMap<>();

        groupMap.put("PowerOf4" , Arrays.asList("Furkan","Daria","Serife","Muge")  );
        groupMap.put("Achievers" , Arrays.asList("Maiia", "Anastasia", "Zaki", "Toyly", "Like")  );
        groupMap.put("BugHunter" , Arrays.asList("Ayse","Rabiyam","Gulzina")  );
        groupMap.put("BugBusters", Arrays.asList("Rukhshona","Fariza","Seyma","Sumeyyra","Huvayda"));

        //System.out.println("groupMap ="+groupMap) ;

        groupMap.forEach( (groupCode,allMembers) -> System.out.println("groupCode = " + groupCode +"\n\t members : "+ allMembers ) );
        // find a member in certain group and certain index of this member
        System.out.println(groupMap.get("Achievers").get(3));

        //Check weather Map has Gulzina or not in BugHunter?
        System.out.println(groupMap.get("BugHunter").contains("Gulzina"));
        groupMap.put("Justice League", new ArrayList<>(Arrays.asList("Superman", "Batman", "Wonderwoman")));
        groupMap.get("Justice League").add("Flash");
        System.out.println("groupMap.get(\"Jastice League \")= " +groupMap.get("Justice League"));


    }


}


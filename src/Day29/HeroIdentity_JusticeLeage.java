package Day29;

public class HeroIdentity_JusticeLeage {
    public static void main(String[] args) {
       String [] allHeroes = {"Superman-Clark Kent",
               "Batman-Bruce Wayne",
               "Wonder Woman-Princess Diana",
               "Aquaman-Arthur Orin Curry",
               "Wonder Woman-Princess Diana",
               "Cyborg-Victor Stone",
               "The Flash-Barry Allen ",
               "Green Lantern-Hal Jordan",
               "Green Arrow-Oliver Queen",
               "Atom-Ray Palmer",
               "Hawkman-Carter Hall",
               "Hawkgirl-Shiera Hall",
               "Zantana-Zantana Zatara",
               "Martian Manhunter-John Jones"};
       for( String eachHero : allHeroes) {
           //System.out.println("eachHero = " + eachHero);

           String hero1 = eachHero;


           String[] heroSplit = hero1.split("-");
           String heroCode = heroSplit[0];
           String fullName = heroSplit[1];
           // how to generate the star!!! Interview question:
           int nameCharCount = fullName.length();
           String stars = "";
           for (int i = 0; i < nameCharCount; i++) {

               stars = stars + "*";//stars +="*";

           }

           System.out.println(fullName);
           System.out.println(stars);

           String heroX = heroCode + "-" + stars;
           System.out.println("hero1 = " + hero1);//hero1 = Superman-Clark J Kent

           System.out.println("heroX = " + heroX);//heroX = Superman-************
       }
    }

}

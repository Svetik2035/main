package Day29;

public class HeroIdentity {
    public static void main(String[] args) {
        String hero1 = "Superman-Clark J Kent";// "- " this is a delimiter (divider)
        // to convert String into Array



        // hide this hero identity
        //String heroX = "Superman-************";

        //given a String with hero code and name separated by -
        //turn this String into hero code and * with the same length as hero name

        //Plain English logic:

        //Split it by - to get the code and full name
        // get the length of full name
        // generate stars (*******...)with the same length as full name character count
        //concatenate heroCode with dash and stars and save it

        //or

        //one star is generated, replace full name with Stars
        String [] heroSplit = hero1.split("-");
        String  heroCode =heroSplit[0];//word Supermen
        String fullName = heroSplit [1];// full name
        // how to generate the star!!! Interview question:
        int nameCharCount = fullName.length();//create a variable to calculate the quantity of characters
        String stars = "";
        for (int i = 0; i <nameCharCount ; i++) {

            stars= stars + "*";//stars +="*";// to print them in one line

        }

        System.out.println(fullName);
        System.out.println(stars);

        String heroX = heroCode+"-"+ stars;
        System.out.println("hero1 = " + hero1);//hero1 = Superman-Clark J Kent

        System.out.println("heroX = " + heroX);//heroX = Superman-************

    }
}

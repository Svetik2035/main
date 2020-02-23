package office_hour;

public class OfficeHour_12_18 {
    public static void main(String[] args) {


        String employee = "Philipa Salthouse [ElectricalEngineer] psalthouse0@g.com ";
        //print job title from this String : Electrical Engineer

        //LOGIC: title is in between [ and ] so we need to find of [ and ]
        //and use substring(right after index of [ , index of]  )
        int startingIndex = employee.indexOf("[") + 1 ;
        int endingIndex =employee.indexOf("]");
         String title = employee. substring(startingIndex,endingIndex);
        System.out.println("title = " + title);//printed: title = ElectricalEngineer
////TASK 1. Print all job titles - hint ( substring, indexOf)
////TASK 2: Print all FirstName-lastName jobTitle
//       for example :
//        Philipa-Salthouse Electrical Engineer
//        Ulrika-Goolding Nuclear Power Engineer

        /**
         * Print  all firstName-lastName jobTitle
         * for example:
         * Philipa Salthouse ElectricalEngineer
         * Ulrika-Goolding Nuclear Power Engineer
         *
         * Logic1: get first name (first word in this sentence)
         *         get second name (second word in this sentence)
         *         than concatenate with the title
         *   this will break if we have a name more than two words
         *
         * Logic 2: get the full name directly using subString
         * replace all the space in full name with dash "-"
         * then  concatenate with the title
         *
         */
        String fullName = employee.substring(0, employee.indexOf("[")-1);
        System.out.println("full name = " + fullName);//printed: full name = Philipa Salthouse
        
        String fullNameWithDash = fullName.replace(" ", "-");
        System.out.println("fullNameWithDash = " + fullNameWithDash);//printed:fullNameWithDash = Philipa-Salthouse


        System.out.println(fullNameWithDash + " " + title);//Philipa-Salthouse ElectricalEngineer

        //TASK 3. Look for those 2 people in the array and assert below data
        /*
        Tracy Bartle should be Geological Engineer
        Skipper Abrahamsson should be Financial Advisor
        if true{
            Print "PASS: Verification successful. Tracy Bartle's job is Geological Engineer
        }else{
            Print "FAIL: Verification error:  Tracy Bartle's job is NOT Geological Engineer*/

        if(title.equals("ElectricalEngeneer")){
            System.out.println("PASS:Verification successful");
        }else{
            System.out.println("FAIL: Verification fail : +title");

            //Task 4:  //Print Initials -> Job Title for everyone
        /*
        PS -> Electrical Engineer
         */
          //logic : get the first word and the last word of your full name
            // and get the first characters of both
            //a full name might contain more than 2 words, but  we only want 2 characters for initials
            //Bruce D Wayne -->> BW
            // we have to find last index of space to find a 1 character of the last name
            // get first character using charAt(0),
            // get last name first character using charAt (lastIndexOfSpace + 1)

            System.out.println( fullName.charAt(0)+""
                               + fullName.charAt( fullName.lastIndexOf(" ")+ 1)
                               + "->" + title  );






        }

    }
}

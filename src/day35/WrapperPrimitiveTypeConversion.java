package day35;

public class WrapperPrimitiveTypeConversion {
    public static void main(String[] args) {
        // Use this number IPR2012-00001 and store the year into a int variable
// This case number always start with 3 character either IPR , PGR , CBM , DER
// followed by year , followed by dash and 5 digit number
        String caseNumber = "IPR2012-00001" ;
        int year ; //-- get 2012 out of it

        String strYear = caseNumber.substring(3,7);//to print only  "2012" out of String

        year = Integer.parseInt(strYear);
        System.out.println("strYear = " + strYear);

        System.out.println(getYearOfCaseNumber("IPR2012-00001" ));
        System.out.println(getYearOfCaseNumber("CBN2009-00123" ));
        System.out.println(getYearOfCaseNumber("GSM2001-12001" ));
    }
    public static int getYearOfCaseNumber(String caseNumber) {
      /*  int year ; //-- get 2012 out of it
        String strYear = caseNumber.substring(3,7);//to remove 2012 out of String
        year = Integer.parseInt(strYear);
        return year ;
        DO IT LIKE THIS OR IN ONE SHOT:
        */
      return Integer.parseInt(caseNumber.substring(3,7));

    }
}

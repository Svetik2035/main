package day35;

public class StringToIntegerParsing {
    public static void main(String[] args) {
        String strNum ="100";
        int num = Integer.parseInt(strNum);
        System.out.println("num = " + num);
        
        String empID = "FB-457" ;
        //to do three lines in one shot
        // int id = Integer.parseInt(empID.split("-")[1]);
        String [] empIDsplit = empID.split("-");
        String idStr         = empIDsplit[1];   
        int id               = Integer.parseInt(idStr);

        System.out.println("id = " + id);

      String num1Str = " 100";
      String num2Str = "600";

      // we need to get String converted to int and get a result of 700
        //in order to perform arithmetic operation

        // create two ints to make an arithmetic operation:
        int num1 = Integer.parseInt(num1Str);
        int num2 = Integer.parseInt(num2Str);
       System.out.println();


}
}

package Office_hour_01_16_2020;

public class UserInfo {
    private String userName,
                   password,
                   ssn;

   public String getUserName(){
       return userName;

   }
   public void setUserName(String newName){
       this.userName = newName ;
   }
   public String getSSN(){
       return ssn;
   }
   public void setSSN(String ssn){
       this.ssn = ssn;
   }


}

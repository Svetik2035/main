package ReplItHomeWork;

public class Exercise_176 {
    public static void main(String[] args) {

    }
    public boolean simpleRoomBook(boolean isAvailable, int month, int day , int year) {
     if(!isAvailable || year!=2018 && (month ==7 && day<=8)){
         return false;
     }else{
         return true;
     }
    }
}

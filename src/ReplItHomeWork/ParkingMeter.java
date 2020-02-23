package ReplItHomeWork;

public class ParkingMeter {

    int timeLeft = 0;
    int maxTime;

    public ParkingMeter( int maxTime){
        this.maxTime = maxTime;
    }
    public boolean add(int x){
        boolean result = true;
        if(x==25 && timeLeft<= maxTime){
           timeLeft = timeLeft + 30;
            result = true;
        }else{
            timeLeft=timeLeft;
            result = false;
        }
        return result;
    }
     public void tick(){
     if(timeLeft>0)
       timeLeft--;
      }
      public boolean isExpired(){
        return timeLeft == 0;
      }
    }





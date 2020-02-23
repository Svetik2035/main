package ReplItHomeWork;

public class TV {
   private int channel = 1;
   private int volumeLevel = 1;
   private boolean on = false;
   private String brand = "undefined";

    public TV() {
        System.out.println("Creating TV object using no Args- constructor");
    }

    public TV(String brand) {
        this.brand = brand;
        System.out.println("Creating TV object using 1 arg - constructor");
    }
    //Generate getters/setters

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        if (on && volumeLevel >= 1 && volumeLevel <= 7) {
            this.volumeLevel = volumeLevel;
        } else {
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if(on && channel>=1 && channel<=120) {
        this.channel = channel;
     }else{
        System.out.println("ERROR: TV is either OFF or invalid Channel");

        }
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void channelUp(){
         channel=channel+1;

    }
    public void channelDown(){
         channel=channel-1;

    }
    public void volumeUp(){
       volumeLevel += 1;


    }
    public void volumeDown(){
        volumeLevel -= 1;

    }
     public boolean isOn(){
            return on;
        }

            public void turnOn(){
                if(on){
                    System.out.println("TV is already ON");
                }else{
                    on=true;
                }
            }
            public void turnOff() {
                if (on == false) {
                    System.out.println("TV is already OFF");
                } else {
                    on = false;
                }
            }
    }



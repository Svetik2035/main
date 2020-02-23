package DAY44.sub;

import DAY44.SlackUser;

public class SlackAdminUser extends SlackUser {
    int adminID;
    public SlackAdminUser(String name, String status, int  adminID){
        this.name = name;
        this.status = status;
        this.adminID = adminID;

    }

    public static void main(String[] args) {

        SlackAdminUser user1 = new SlackAdminUser("Akbar", "Release the horses", 101);
        //inherited methods that we are calling:
        user1.sendMessage();
        user1.callSomeone();
        user1.addEmoji();
        // our own methods are calling:
        user1.sendAtChannelMessage();
        user1.deleteMessage();
        user1.addChannel();
    }

    public String toString() {
        return "SlackAdminUser{" +
                "adminID=" + adminID +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                "} ";
    }
    public void sendAtChannelMessage(){
        System.out.println(name + " sending channel message");
    }
    public void deleteMessage(){
        System.out.println(name + " deleting slack messages");
    }
    public void addChannel(){
        System.out.println( name + " adding new channels");
    }




    }

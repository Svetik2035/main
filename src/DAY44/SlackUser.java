package DAY44;

public class SlackUser {
    protected String name;
    protected String status;

    public void sendMessage(){
        System.out.println("send a message = " + name);

    }
    public void callSomeone(){
        System.out.println("call someone = "+ name);

    }
    public void addEmoji(){
        System.out.println(name + " add Emoji");

    }
}

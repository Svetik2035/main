package Office_hour_01_16_2020;

public class TestUser {
    int a;
    public static void main(String[] args) {
        TestUser t = new TestUser();
        System.out.println(t.a);
        UserInfo Alisa = new UserInfo();


        // System.out.println(Alisa.userName);
        Alisa.setUserName("Alisa");
        System.out.println(Alisa.getUserName());

        Alisa.setSSN("123456");
        System.out.println(Alisa.getSSN());

        UserInfo Kamran = new UserInfo();
        Kamran.setUserName("Kamran");
        Kamran.setSSN("654321");


    }
}

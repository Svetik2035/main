package DAY44;

public class CyberHouse {

    // we can change default value of the fields
    // by assigning value directly in the template class
    private static  String neighbourhoodName = "Cybertek Ave";
    String design ;
    int houseNum ;

    // constructor can access anything
    public CyberHouse(String design, int houseNum){
        this.design = design ;
        this.houseNum = houseNum;
    }




   /* int houseNum;
    String design;

    static  String  neighbourhoodName = "Cybertek Ave";

    public CyberHouse(String design, int houseNum) {
        this.design = design;
        this.houseNum = houseNum;

    }
    public void showAllInfo(){
        System.out.println(" house: "+ this.houseNum+
                ", design: "+ this.design +
                ", neighbourhoodName "+ neighbourhoodName);
    }
    public static void showNeighbourhoodName(){
        System.out.println("neighbourhoodName = " + neighbourhoodName);
       // System.out.println("houseNum = " + houseNum);
    }
    /*CyberHouse
    instance fields : houseNum, design
    static field : neighbourhoodName
    add 2 args constructor
    to set the houseNum, design
    instance method
    void showAllInfo()
    just print the houseNum, design neighbourhoodName in one line
    static void method showNeighborhood
    print the neighbourhoodName only
    // try to access houseNum, design and see what happen*/

}

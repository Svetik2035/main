package ReplItHomeWork;

public class Carpet {
    public double width, length, unitPrice, totalPrice;
    public boolean isPersian;

    public Carpet(){
        width = 300;
        length = 300;
        unitPrice = 0;
        totalPrice = 200;
        isPersian = false;

    }
    public Carpet(double width, double length, double unitPrice, boolean isPersian ){
        this.width = width;
        this.length = length;
        this. unitPrice = unitPrice;
        this.isPersian = isPersian;
        if(isPersian){
            totalPrice = ((width + length)*unitPrice) + 200;
        }else{
            totalPrice = (width + length)*unitPrice;
        }
    }



}

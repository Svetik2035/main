package ReplItHomeWork;
import java.util.Scanner;

public class Exercise_30_2 {
    public static void main(String[] args) {
        String item1, item2, item3, report;
        double price1, price2, price3, totalPrice;
        int count1, count2, count3;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Item1, count and its price:");
        item1=scan.next();
        count1=scan.nextInt();
        price1=scan.nextDouble();
        System.out.println("Enter Item2, count and its price:");
        item2=scan.next();
        count2=scan.nextInt();
        price2=scan.nextDouble();
        System.out.println("Enter Item3, count and its price:");
        item3=scan.next();
        count3=scan.nextInt();
        price3=scan.nextDouble();
        double totalPrice1=price1*count1;
        double totalPrice2=price2*count2;
        double totalPrice3=price3*count3;
        totalPrice=(price1*count1)+(price2*count2)+(price3*count3);
        if (count1==0 && count2>0 && count3>0){
            report="Item2: "+item2+" Price: "+count2*price2+", Item3: " +item3+ " Price: "+ count3*price3;
        }else if (count2==0 && count1>0 && count3>0){
            report="Item1: "+item1+" Price: "+count1*price1+", Item3: " +item3+ " Price: "+ count3*price3;
        }else if (count3==0 && count2>0 && count1>0){
            report="Item1: "+item1+" Price: "+count1*price1+", Item2: " +item2+ " Price: "+ count2*price2;
        }else if (count1==0 && count2==0 && count3>0){
            report="Item3: "+item3+" Price: "+count3*price3;
        }else if (count1==0 && count3==0 && count2>0){
            report="Item2: "+item2+" Price: "+count2*price2;
        }else if (count1>0 && count3==0 && count2==0){
            report="Item1: "+item1+" Price: "+count1*price1;
        }else{
            report="Item2: "+item2+" Price: "+count2*price2+", Item3: " +item3+ " Price: "+ count3*price3
                    +", Item1: "+item1+" Price: "+count1*price1;
        }
        System.out.println(report);
        System.out.println("Total price: "+totalPrice);
    }
}


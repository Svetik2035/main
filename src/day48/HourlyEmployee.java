package day48;

public class HourlyEmployee extends Employee {
    double hourlyWage;
    int numberOfHours;//annual hours worked

    public HourlyEmployee( String name, int id, double hourlyWage,int numberOfHours){
        super(name, id);
        this.hourlyWage= hourlyWage;
        this.numberOfHours = numberOfHours;
    }

    public HourlyEmployee(double hourlyWage,int numberOfHours ){
        this.hourlyWage = hourlyWage;
        this.numberOfHours = numberOfHours;
    }
    @Override
    public void calculateAnnualSalary(){
        System.out.println("Hourly Employee earns yearly : "+ (numberOfHours * numberOfHours));
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyWage=" + hourlyWage +
                ", numberOfHours=" + numberOfHours +
                ", name='" + name + '\'' +
                ", id=" + id + " ,yearly salary= "+ (hourlyWage* numberOfHours)
                 + "} " ;
    }
}


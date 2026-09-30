package oops;

public class Employeee {
    public static void main(String[] args){
        DemoEmployeee d1 = new Managerr("Sanket", 60000);
        DemoEmployeee d2 = new Developerr("Rohan",65000);
        d1.calculateBonus();
        d2.calculateBonus();
    }
}
class DemoEmployeee{
    protected String name;
    protected  double salary;

    DemoEmployeee(String name,double salary){
        this.name = name;
        this.salary = salary;
    }
    void calculateBonus(){
       double bonus = 0.10* salary;
        System.out.println("Bonus = "+bonus);
    }
}
class Managerr extends DemoEmployeee{

    Managerr(String name,double salary){
        super(name,salary);
    }
    void calculateBonus(){
        double bonus = 0.20* salary;
        System.out.println("Bonus = "+bonus);
    }
}
class Developerr extends DemoEmployeee{

    Developerr(String name, double salary){
       super(name,salary);
    }
    void calculateBonus(){
        double bonus = 0.15* salary;
        System.out.println("Bonus = "+bonus);
    }
}

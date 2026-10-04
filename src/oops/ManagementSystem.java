package oops;

public class ManagementSystem {
    public static void main(String[] args){
        Employye[] Employee = {
                new Manageer("Sanket",12000),
                new Developeer("Rohan",15000)
        };

        for (Employye e : Employee){
            e.dispalyInfo();
            double bonus = e.calculateBonus();
            System.out.println("Bonus = "+bonus);
            double totalSalary = e.salary + bonus;
            System.out.println("Total Salary = "+totalSalary);
        }

    }
}
abstract class Employye{
protected String name;
protected double salary;

Employye(String name, double salary){
    this.name = name;
    this. salary = salary;
}
   void dispalyInfo(){
       System.out.println("Name = "+name);
       System.out.println("Salary = "+salary);
   }
   abstract double calculateBonus();
}
class Manageer extends Employye{
    Manageer(String name, double salary){
        super(name,salary);
    }

    @Override
    double calculateBonus() {
        return salary * 0.20;
    }
}
class Developeer extends Employye{
    Developeer(String name, double salary){
        super(name,salary);
    }

    @Override
    double calculateBonus() {
        return salary * 0.15;
    }
}
package oops;

public class DemoEmployee {
    public static void main(String[] args){
        FirstEmployee e1 = new FirstEmployee("Sanket",2104,50000);
        FirstEmployee e2 = new FirstEmployee("Rohan",2105,60000);
        e1.displayInfo();
        e2.displayInfo();
        System.out.println(e1.getSalary());
        e1.increasesSalay(10);
        e2.increasesSalay(-5);

        System.out.println(e1.getSalary());
        System.out.println(e2.getSalary());
    }
}
class FirstEmployee{
    private String name;
    private int employeeId;
    private double salary;

    FirstEmployee(String name,int employeeId, double salary){
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;

    }
    void displayInfo(){
        System.out.println("Name = "+name);
        System.out.println("Employee ID = "+employeeId);
        System.out.println("Salary = "+salary);
    }
    public double getSalary(){
        return salary;
    }
    public void increasesSalay(double percentage){
        if (percentage>0) {
            double increase = (salary * percentage) / 100;
            salary = increase + salary;
        }
    }
}

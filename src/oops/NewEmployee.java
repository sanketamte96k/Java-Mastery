package oops;

public class NewEmployee {
    public static void main(String[] args){
        DemoNewEmployee d1 = new DemoNewEmployee("Sanket",50000);
        Manager m1 = new Manager("Rohan",40000,"IT");
        d1.displayInfo();
        m1.displayManagerInfo();

    }
}
class DemoNewEmployee{
    private String name;
    private double salary;

    DemoNewEmployee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    void displayInfo(){
        System.out.println("Name = "+name);
        System.out.println("Salary = "+salary);
    }
}
class Manager extends DemoNewEmployee{
    private String department;

    Manager(String name, double salary,String department){
        super(name,salary);
        this.department = department;
    }
    void displayManagerInfo(){
        super.displayInfo();
        System.out.println("Department = "+department);
    }
}

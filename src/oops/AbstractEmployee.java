package oops;

public class AbstractEmployee {
    public static void main(String [] args){
        Developer d1 = new Developer("Sanket");
        d1.work();
        d1.showName();
    }
}
abstract class Employee{
    String Name;

    Employee(String Name){
        this.Name = Name;
        System.out.println("Employee Constructor Called");
    }
    void showName(){
        System.out.println("Employee Name =  "+Name);
    }
    abstract void work();
}
class Developer extends Employee{
    Developer (String name){
        super(name);
        System.out.println("Developer Construct Called");
    }
    void work(){
        System.out.println("Developer is writing code");
    }

}

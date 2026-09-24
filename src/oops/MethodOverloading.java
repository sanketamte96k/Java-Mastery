package oops;

public class MethodOverloading {
    public static void main(String[] args){
        Add a1 = new Add();
        a1.add(12,24);
        a1.add("Sanket","Amte");
        a1.displauInfo(21,"Sanket");
        a1.displayInfo("Sanket",21);
    }
}
class Add{
    void add(double a, double b){
        System.out.println("Sum = "+(a + b));
    }
    void add(String a , String b){
        System.out.println(a +" "+b);
    }
    void displayInfo(String a, int b){
        System.out.println("Name = "+ a +" Age = "+b);
    }
    void displauInfo(int a, String b){
        System.out.println("Age = "+a+" Name = "+b);
    }
}

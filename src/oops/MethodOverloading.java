package oops;

public class MethodOverloading {
    public static void main(String[] args){
        Add a1 = new Add();
        a1.add(3,2);
        a1.add(2,4,6);
    }
}
class Add{
    void add(int a, int b){
        System.out.println("Sum = "+(a + b));
    }
    void add(int a, int b, int c){
        System.out.println("Sum = "+(a + b + c));
    }
}

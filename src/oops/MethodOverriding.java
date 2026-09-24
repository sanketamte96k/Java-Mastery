package oops;

public class MethodOverriding {
    public static void main(String[] args){
       Mobile d1 = new Mobile();
       d1.Open();
        Mobile m1 = new SmartPhone();
        m1.Open();
    }
}
class Mobile{
    void Open(){
        System.out.println("Mobile is open");
    }
}
class SmartPhone extends Mobile{
    @Override
    void Open(){
        System.out.println("SmartPhone is also Open");
    }
}
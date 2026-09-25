package oops;

public class AbstractionBasic {
    public static void main (String[] args){
        PaymentMethod p1 = new UPIPayment();
        PaymentMethod p2 = new CreditCard();
        p1.pay();
        p1.pay();

    }
}
abstract class PaymentMethod {
    abstract void pay();
}
class UPIPayment extends PaymentMethod{
    void pay(){
        System.out.println("Make Payment through UPI");
    }
}
class CreditCard extends PaymentMethod{
    void pay(){
        System.out.println("Make Payment through Credit Card");
    }
}
package oops;

public class AbstractionBasic {
    public static void main (String[] args){
        UPI u1 = new UPI();
        CreditCard c1 = new CreditCard();
        u1.pay();
        c1.pay();

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
        System.out.println("Make Payment through through Credit Card");
    }
}
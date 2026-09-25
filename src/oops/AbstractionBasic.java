package oops;

public class AbstractionBasic {
    public static void main (String[] args){
        PaymentMethod p1 = new UPIPayment();
        PaymentMethod p2 = new CreditCard();
        p1.pay();
        p2.ShowMessage();
        p1.pay();

    }
}
abstract class PaymentMethod {
    abstract void pay();

    void ShowMessage(){
        System.out.println("Payment Processing.......");
    }
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
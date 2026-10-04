package oops;

public class PaymentSystem {
    public static void main(String[] args){
        Paymentt[] payments = new Paymentt[3];
        payments[0] = new CreditCardPayment(300);
        payments[1] = new UPIPaymentt(200);
        payments[2] = new CashPaymentt(100);

        for (Paymentt p  : payments){
            p.displayAmount();
            p.processPayment();
        }

    }
}
abstract class Paymentt{
    protected double amount;

    Paymentt(double amount){
        this.amount = amount;
    }
    abstract void processPayment();
    void displayAmount(){
        System.out.println("Amount = "+amount);
    }
}
class CreditCardPayment extends Paymentt{
    CreditCardPayment(double amount){
        super(amount);
    }
    void processPayment(){
        System.out.println("Processing Creadit Card Payment");
        System.out.println("Payment done");
    }
}
class UPIPaymentt extends Paymentt{
    UPIPaymentt(double amount) {
        super(amount);
    }
        void processPayment(){
            System.out.println("Processing UPI Payment");
            System.out.println("Payment Done through UPI");
    }
}
class CashPaymentt extends Paymentt{
    CashPaymentt(double amount){
        super(amount);
    }

    @Override
    void processPayment() {
        System.out.println("Processing Payment through Cash");
        System.out.println("Payment done through Cash");
    }
}
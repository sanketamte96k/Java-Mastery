package oops;

public class PolymorphismBasic {
    public static void main(String[] args){
        Payment p1 = new UPI();   // upcasting
        Payment p2 = new Card();
        Payment p3 = new Payment();
        p1.pay();
        p2.pay();
        p3.pay();
        if (p1 instanceof UPI) {
            UPI u1 = (UPI) p1;  //--downcasting--
            u1.scanQR();
        }

    }
}
class Payment{
    void pay(){
        System.out.println("Make Payment");
    }
}
class UPI extends Payment{
    @Override
    void pay(){
        System.out.println("Make Payment through UPI");
    }
    void scanQR(){
        System.out.println("Make Payment through QR Scanner");
    }
}
class Card extends Payment{
    @Override
    void pay(){
        System.out.println("Make Payment through Card");
    }
}

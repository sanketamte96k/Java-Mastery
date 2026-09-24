package oops;

public class InheritanceBasic {
    public static void main(String args []){
        car c1 = new car();
        c1.brand = "BMW";
        c1.colour = "Black";

        c1.start();
        c1.carColour();
    }
}
class vehicle{
    String brand;

    void start(){
        System.out.println("Vehicle gets Start");
    }
}
class car extends vehicle{
    String colour;

    void carColour(){
        System.out.println("Colour = "+colour);
    }
}

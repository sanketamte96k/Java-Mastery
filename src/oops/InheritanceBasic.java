package oops;

public class InheritanceBasic {
    public static void main(String args []){
        Car c1 = new Car();
        Bike b1 = new Bike();
        SportBike s1 = new SportBike();
        c1.brand = "BMW";
        c1.colour = "Black";
        b1.brand = "Yamaha";
        s1.brand = "Farari";

        c1.start();
        c1.carColour();
        b1.bikeStand();
        b1.start();
        s1.Turbo();
        s1.start();
    }
}
class Vehicle{
    String brand;

    void start(){
        System.out.println("Vehicle gets Start");
    }
}
class Car extends Vehicle{
    String colour;

    void carColour(){
        System.out.println("Colour = "+colour);
    }
}
class Bike extends Vehicle{
    void bikeStand(){
        System.out.println("Bike Stand Open");
    }
}
class SportBike extends Bike{
    void Turbo(){
        System.out.println("Turbo mode ON");
    }
}

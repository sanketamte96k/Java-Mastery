package oops;

public class CarSystem{
    public static void main(String[] args){
        DemoCar d1 = new DemoCar("Toyota","Fortuner");
        d1.accelerated(50);
        d1.brake(20);
        d1.accelerated(80);
        d1.stop();
        d1.displayInfo();


    }
}
class DemoCar{
    private String brand;
    private String model;
    private int speed;
    private boolean isEngineOn;

   DemoCar(String brand,String model ){
        this.brand = brand;
        this.model = model;
        this.speed = 0;
        this.isEngineOn =false;
    }
    void start(){
       if (isEngineOn == false){
           isEngineOn = true;
           System.out.println("Car Starting......");
       }
       else {
           System.out.println("Engine is already running");
       }
    }
    void stop(){
       if (speed ==0){
           isEngineOn = false;
           System.out.println("Engine stopped");
       }
       else {
           System.out.println("Can not stop Engine While running");
       }
    }
    void accelerated(int amount){
       if (isEngineOn == false){
           System.out.println("Start the Engine first");
       }
       else if (amount <= 0 ){
           System.out.println("Please enter valid amount");
       }
       else {
           speed = speed + amount;
           System.out.println("Speed = "+speed);
       }
    }
    void brake(int amount){
       if (amount <= 0){
           System.out.println("Please Enter a valid Amount");
       }
       else if(amount>speed){
           speed = 0;
           System.out.println("Speed = "+speed);
       }
       else {
           speed = speed - amount;
           System.out.println("Speed = "+speed);
       }
    }
    void displayInfo(){
        System.out.println("Car = "+brand);
        System.out.println("Model = "+model);
        System.out.println("Speed = "+speed);
        System.out.println("Engine On = "+isEngineOn);
    }
}
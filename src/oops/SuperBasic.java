package oops;

public class SuperBasic {
    public static void main(String args []){
        SuperCar s1 = new SuperCar();
        s1.showBrand();
        s1.start();

    }
}
class SuperVehicle{
    String brand = "BMW";
    void start(){
        System.out.println("Vehicle gets Started");
    }

}
class SuperCar extends SuperVehicle{
    String brand = "Audi";
    void showBrand(){
        System.out.println(brand);
        System.out.println(super.brand);
    }
    void start(){
        System.out.println("Car gets Started");
        super.start();
    }
}
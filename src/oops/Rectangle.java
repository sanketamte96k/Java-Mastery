package oops;

public class Rectangle {
    public static void main(String[] args){
        DemoRectangle d1 = new DemoRectangle();
        DemoRectangle d2 = new DemoRectangle(3,2);
        d1.displayInfo();
        d2.displayInfo();
        d2.calculateArea();
        d2.calculatePeriMeter();

    }
}
class DemoRectangle{
    private double length;
    private double width;

    void displayInfo(){
        System.out.println("Length = "+length);
        System.out.println("Width = "+width);
    }

    DemoRectangle(){
        length = 1;
        width = 1;
    }

    DemoRectangle(double length, double width){
        if (length > 0 && width > 0) {
            this.length = length;
            this.width = width;
        }else {
            System.out.println("Invalid Dimension");
            this.length = 1;
            this.width = 1;
        }
    }
    void calculateArea(){
        double Area = (length * width);
        System.out.println("Area = "+Area);
    }
    void calculatePeriMeter(){
        double Perimeter = 2 * (length + width);
        System.out.println("PeriMeter = "+Perimeter);
    }
}
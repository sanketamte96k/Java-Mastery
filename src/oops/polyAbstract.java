package oops;

public class polyAbstract {
    public static void main(String[] args){
        shape [] shapes ={
                new circle(3),
                new circle(5),
                new Rectanglee(2,3),
                new Rectanglee(3,5)
        };
        double totle = 0;
        for (shape s : shapes){
            double area = s.calculateArea();
            totle = totle + area;
            System.out.println("Totle Area = "+totle);
        }
    }
}
abstract class shape{
    abstract double calculateArea();
}
class circle extends shape{
    double radius;
    circle(double radius){
        this.radius = radius;
    }
    double calculateArea() {
    double Radius = 3.14 *( radius * radius);
        System.out.println("Area of Circle = "+Radius);
        return Radius;
    }
}
class Rectanglee extends shape{
    double length;
    double width;

    Rectanglee(double length, double width){
        this.length = length;
        this.width = width;
    }
    double calculateArea(){
        double Area = (length* width);
        System.out.println("Area of Rectangle = "+Area);
        return Area;
    }
}
package oops;

public class FinalExample {
    public static void main(String[] args){
        Speed s1 = new Speed();
        System.out.println("Maximum Speed = "+s1.speed);
        s1.run();

    }
}
class Speed{
    final int speed = 120;

    void run(){
        System.out.println("Car is running");
    }
}

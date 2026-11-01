package generics;

public class BoundedExample {
    public static< T extends Number> Double num(T num){
        return num.doubleValue() * num.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println(num(2));
        System.out.println(2.5);
    }
}

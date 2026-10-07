package exceptionhandling;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Start Program Execution ");

        int a = 20;
        int b = 0;

        try {
            int result = a / b;
            System.out.println(result);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        System.out.println("Program completed successfully");
    }
}
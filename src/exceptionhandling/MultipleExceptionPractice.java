package exceptionhandling;

public class MultipleExceptionPractice {
    public static void main(String[] args){
        int[] numbers = {10,20,30,40};
        int a = 10;
        int b = 0;
        System.out.println("Start Program Execution");
        try{
            int result = a / b;
            System.out.println("Result = "+result);
        }
        catch (ArithmeticException e){
            System.out.println("Can not divided by zero");
        }
        try{
            System.out.println(numbers[5]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index");
        }
        finally {
            System.out.println("Program End");
        }
    }
}

package exceptionhandling;

public class ArrayExceptionPractice {
    public static void main(String[] args){
        int[] numbers = {10,20,30,40,50};

        System.out.println("Program Execution Started ");
        try{
            System.out.println(numbers[7]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Array Index");
        }
        System.out.println("Program Completed Successfully");
    }
}

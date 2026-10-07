package exceptionhandling;

public class ThrowPractice {
    public static void main(String[] args){
        int age = 15;

        try {
            if (age < 18) {
                throw new ArithmeticException("Invalid Age");
            }
        }
        catch (ArithmeticException e){
            System.out.println("Your Age is Invalid");
        }
        finally {
            System.out.println("Program Execution Done");
        }
    }
}

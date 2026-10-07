package exceptionhandling;

class InvalidAgeExceptionn extends Exception{
    InvalidAgeExceptionn(String message){
        super(message);
    }
}

public class AgeValidationPractice {
    static void checkAge(int age) throws InvalidAgeExceptionn{
        if (age <18){
            throw new InvalidAgeExceptionn("Invalid Age");
        }
        System.out.println("You are Eligible");
    }
    public static void main(String[] args){
        try{
            checkAge(20);
        }
        catch (InvalidAgeExceptionn e){
            System.out.println("Yoy are not Eligible");
        }
        finally {
            System.out.println("Program Execution Done");
        }
        System.out.println();

        try{
            checkAge(15);
        }
        catch (InvalidAgeExceptionn e){
            System.out.println("Yoy are not Eligible");
        }
        finally {
            System.out.println("Program Execution Done");
        }
    }
}

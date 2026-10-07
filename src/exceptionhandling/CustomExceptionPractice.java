package exceptionhandling;

public class CustomExceptionPractice {
    public static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
        System.out.println("You are eligible");
    }
    public static void main(String[] args) {
        try {
            checkAge(15);
        }
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {
        super(message);
    }
}
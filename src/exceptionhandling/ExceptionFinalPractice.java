package exceptionhandling;

class InsufficientBalanceExceptionn extends Exception {
    public InsufficientBalanceExceptionn(String message) {
        super(message);
    }
}

public class ExceptionFinalPractice {

    static void withdraw(double balance, double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance");
        }
        System.out.println("Withdrawal successful");
        System.out.println("Remaining balance = " + (balance - amount));
    }

    public static void main(String[] args) {

        try {
            withdraw(5000, 2000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Transaction completed");
        }

        System.out.println();

        try {
            withdraw(5000, 7000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Transaction completed");
        }
    }
}
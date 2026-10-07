package exceptionhandling;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

public class BankExceptionPractice {

    static void checkBalance(double balance, double withdrawAmount)
            throws InsufficientBalanceException {
        if (withdrawAmount > balance) {
            throw new InsufficientBalanceException("Insufficient balance");
        }
        System.out.println("Withdrawal successful");
    }

    public static void main(String[] args) {
        try {
            checkBalance(5000, 7000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
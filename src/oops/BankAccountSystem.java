package oops;

public class BankAccountSystem {

    public static void main(String[] args) {

        Accountt a1 = new Accountt("Rahul", 10000);

        SavingAccount a2 = new SavingAccount("Sanket", 20000, 5);

        CurrentAccount a3 = new CurrentAccount("Rohan", 15000, 5000);

        System.out.println("Normal Account");
        a1.displayInfo();
        a1.deposite(2000);
        a1.withdraw(3000);

        System.out.println();

        System.out.println("Saving Account");
        a2.displayInfo();
        a2.addInterest();
        a2.displayInfo();

        System.out.println();

        System.out.println("Current Account");
        a3.displayInfo();
        a3.withdraw(18000);
        a3.displayInfo();
        a3.withdraw(3000);
    }
}
class Accountt {

    private String accountHolder;
    private double balance;

    Accountt(String accountHolder, double balance) {

        this.accountHolder = accountHolder;

        if (balance < 0) {
            System.out.println("Invalid Bank Balance");
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    void deposite(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid Amount, Cannot deposit");
        } else {
            balance = balance + amount;
            System.out.println("New Balance = " + balance);
        }
    }

    void withdraw(double amount) {

        if (amount <= 0 || amount > balance) {
            System.out.println("Insufficient Balance or Invalid Amount");
        } else {
            balance = balance - amount;
            System.out.println("Remaining Balance = " + balance);
        }
    }

    double getBalance() {
        return balance;
    }

    void displayInfo() {
        System.out.println("Name = " + accountHolder);
        System.out.println("Balance = " + balance);
    }
}


class SavingAccount extends Accountt {

    private double interestRate;

    SavingAccount(String name, double balance, double interestRate) {

        super(name, balance);

        this.interestRate = interestRate;
    }

    void addInterest() {

        double interest = getBalance() * interestRate / 100;

        System.out.println("Interest = " + interest);
        deposite(interest);
    }
}


class CurrentAccount extends Accountt {

    private double overdraftLimit;

    CurrentAccount(String holderName, double balance, double overdraftLimit) {

        super(holderName, balance);

        this.overdraftLimit = overdraftLimit;
    }

    @Override
    void withdraw(double amount) {

        if (amount <= 0) {

            System.out.println("Invalid Amount");

        } else if (amount <= getBalance() + overdraftLimit) {
            if (amount <= getBalance()) {

                super.withdraw(amount);

            } else {

                double remaining = amount - getBalance();
                super.withdraw(getBalance());

                System.out.println("Overdraft Used = " + remaining);
            }

        } else {

            System.out.println("Withdrawal exceeds overdraft limit");
        }
    }
}
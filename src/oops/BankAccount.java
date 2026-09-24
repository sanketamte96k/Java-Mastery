package oops;

public class BankAccount {
    public static void main(String[] args){
        Account b1 = new Account("Sanket",768,500);
        Account b2 = new Account("Rohan",657,600);

        b1.deposit(600);
        b1.withdraw(100);
        b1.setBalance(5000);
        b1.displayBalance();
    }
}
class Account{
    static String bankName = "HDFC Bank";
    private String accountHolder;
    private int accountNumber;
    private double balance;

    // use constructor
    Account(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

        public void deposit (double amount) {
           if (amount > 0){
               balance = balance + amount;
           }
        }
        public void withdraw (double amount) {
            if (amount > 0 && amount <= balance){
                balance = balance - amount;
            }
        }
        void displayBalance () {
            System.out.println("Balance = " + balance);
        }
        static void showBankName(){
            System.out.println(Account.bankName);
        }
        public double getBalance(){
        return balance;
        }
        public void setBalance(double balance){
        if (balance >=0){
            this.balance = balance;
        }
        else {
            System.out.println("Invalid Balance");
        }
        }
    }
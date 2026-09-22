package oops;

public class BankAccount {
    public static void main(String[] args){
        Account b1 = new Account();
        Account b2 = new Account();
        b1.accountHolder = "Sanket";
        b2.accountHolder = "Sachin";
        b1.accountNumber = 746;
        b2.accountNumber = 846;
        b1.balance = 400;
        b2.balance = 800;

        b1.displayBalance();
        b2.displayBalance();

    }
}
class Account{
    String accountHolder;
    int accountNumber;
    double balance;

    void deposit(){
        System.out.println("Money Added");
    }
    void withdraw(){
        System.out.println("Money Withdraw done");
    }
    void displayBalance(){
        System.out.println("Balance = "+balance);
    }
}
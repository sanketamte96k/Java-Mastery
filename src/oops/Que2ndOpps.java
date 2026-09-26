package oops;

public class Que2ndOpps {
    public static void main(String [] args){
        Bank b1 = new Bank("Sanket",94849,500);
        b1.deposite(400);
        b1.displayInfo();
        System.out.println(b1.getBalance());
    }
}
class Bank{
    private int accountNumber;
    private String accountHolder;
    private int balance;

    Bank(String accountHolder,int accountNumber, int balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    void displayInfo(){
        System.out.println("Name = "+accountHolder);
        System.out.println("Account Number = "+accountNumber);
        System.out.println("Balance = "+balance);
    }
    public void deposite(int amount){
        if (amount >0) {
            balance = balance + amount;
        }
    }
    public void withdraw(int amount){
        if (amount > 0 && amount <= balance){
            balance = balance - amount;
        }
        else {
            System.out.println("Please enter valid amount");
        }
    }
     public int getBalance(){
         return balance;

    }
}

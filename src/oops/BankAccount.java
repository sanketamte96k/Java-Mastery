package oops;

public class BankAccount {
    public static void main(String[] args){
        Account b1 = new Account("Sanket",768,500);
        Account b2 = new Account("Rohan",657,600);

        b1.displayBalance();
        b2.displayBalance();
        Account.showBankName();
    }
}
class Account{
    static String bankName = "HDFC Bank";
    String accountHolder;
    int accountNumber;
    double balance;

    // use constructor
    Account(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

        void deposit () {
            System.out.println("Money Added sucessfully ");
        }
        void withdraw () {
            System.out.println("Money Withdraw done");
        }
        void displayBalance () {
            System.out.println("Balance = " + balance);
        }
        static void showBankName(){
            System.out.println(Account.bankName);
        }
    }
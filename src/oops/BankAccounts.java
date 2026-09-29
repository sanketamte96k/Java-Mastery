package oops;

public class BankAccounts {
    public static void main(String[] args){
        DemoBankAccount b1 = new DemoBankAccount("Sanket", 84647,600);
        b1.displayInfo();
        b1.deposite(100);
        b1.withdraw(-200);
        System.out.println(b1.getAccountBalance());
    }
}
class DemoBankAccount{
    private String accountholder;
    private int accountNumber;
    private double accountBalance;

    DemoBankAccount(String accountholder,int accountNumber,double accountBalance){
        this.accountholder = accountholder;
        if (accountNumber > 0) {
            this.accountNumber = accountNumber;
        }else {
            System.out.println("Invalid Account Number, Setting to 0");
            this.accountNumber = 0;
        }
        if (accountBalance >= 0) {
            this.accountBalance = accountBalance;
        }else {
            System.out.println("Invalid Account Balance, Setting to 0");
            this.accountBalance = 0;
        }
    }
    void displayInfo(){
        System.out.println("Name = "+accountholder);
        System.out.println("Account No = "+accountNumber);
        System.out.println("Account Balance = "+accountBalance);
    }
    void deposite(double Amount){
        if (Amount > 0){
            accountBalance = accountBalance + Amount;
            System.out.println("New Account Balance = "+accountBalance);
        }else {
            System.out.println("Please Enter Valid Amount to Deposite");
        }
    }
    void withdraw(double Amount){
        if (Amount <= accountBalance && Amount > 0){
            accountBalance = accountBalance - Amount;
            System.out.println("New Account Balance = "+accountBalance);
        }else {
            System.out.println("Please Enter Valid Amount to Withdraw");
        }
    }
    double getAccountBalance(){
        return accountBalance;
    }

}

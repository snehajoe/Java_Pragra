package assignment4;
public class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;
    String accountType;


    public BankAccount(int accountNumber, String accountHolderName, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
    }


    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + ", New balance: $" + balance);
    }


    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ", New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds, Current balance: $" + balance);
        }
    }


    public void accountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Current Balance: $" + balance);
    }

}
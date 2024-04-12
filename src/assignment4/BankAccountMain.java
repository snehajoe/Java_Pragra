package assignment4;

public class BankAccountMain {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(123456789, "Joe", 1000.0, "Chequing Account");

        account.deposit(500.0);
        account.withdraw(200.0);

        account.accountDetails();
    }
}

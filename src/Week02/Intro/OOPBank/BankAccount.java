package Week02.Intro.OOPBank;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private AccountHolder accountHolder; // Association with AccountHolder

    public BankAccount(String accountNumber, double initialBalance, AccountHolder accountHolder) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.accountHolder = accountHolder;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds.");
            return;
        }
        balance -= amount;
    }

    public double checkBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public AccountHolder getAccountHolder() {
        return accountHolder;
    }
}

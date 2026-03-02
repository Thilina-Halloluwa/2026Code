package Week02.Encapsulation.GettersSetters;

public class BankAccount {
    private double balance;
    private String accountNumber;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("111000");
        account.setBalance(10000);
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Account number: " + account.getAccountNumber());

    }
}



package Week02.Encapsulation.StaticEx.StaticVar;

public class BankAccount {
    private double balance;
    private String accountNumber;
    private String accountHolder;

    public static int totalAccounts = 0;


    public BankAccount(double balance, String accountNumber, String accountHolder) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void PrintTot(){
        System.out.println("Total Accounts: " + totalAccounts);
    }

}

class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(5000, "123", "123");
        BankAccount.totalAccounts++;
        bankAccount.PrintTot();
    }
}

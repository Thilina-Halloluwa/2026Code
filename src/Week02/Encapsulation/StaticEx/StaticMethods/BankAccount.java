package Week02.Encapsulation.StaticEx.StaticMethods;

public class BankAccount {
    private String accountHolder;
    private double balance;

    BankAccount(String name, double balance) {
        this.accountHolder = name;
        this.balance = balance;
    }

    void showInterest(int years) {
        double interest = Bank.calculateInterest(balance, years);
        System.out.println(accountHolder + " earns $" + interest + " in " + years + " years.");
    }


}

class Bank {
    static double interestRate = 5.0;

    static double calculateInterest(double balance, int years) {
        return (balance * interestRate * years) / 100;
    }


}

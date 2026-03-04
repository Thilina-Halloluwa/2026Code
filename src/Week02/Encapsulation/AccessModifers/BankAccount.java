package Week02.Encapsulation.AccessModifers;

public class BankAccount {
    private double balance;
    private String accountNumber;
    private String accountHolder;
    private double interestRate;
}

//If a class is declared public, the filename MUST exactly match the class name (including case), followed by .java
class Main {
    public static void main(String[] args) {
        //creating an account object
        BankAccount account = new BankAccount();
        // account.balance = 1000.0;

    }
}


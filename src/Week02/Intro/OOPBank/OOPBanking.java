package Week02.Intro.OOPBank;

public class OOPBanking {

    public static void main(String[] args) {

        Bank bank = new Bank();

        // Creating account holders
        bank.createAccountHolder("001", "Jack Johnson", "jack@uq.com.au");
        bank.createAccountHolder("002", "Jill Smith", "jill@uq.com.au");

        // Creating accounts linked to account holders
        bank.createAccount("A123", 1000, "001");
        bank.createAccount("B456", 2000, "002");

        // Performing transactions
        bank.deposit("A123", 500);
        bank.withdraw("B456", 300);

        // Checking balances
        bank.checkBalance("A123"); // Expected: Balance for A123: $1500.0
        bank.checkBalance("B456"); // Expected: Balance for B456: $1700.0

        // Displaying all accounts
        bank.displayAllAccounts();
    }
}
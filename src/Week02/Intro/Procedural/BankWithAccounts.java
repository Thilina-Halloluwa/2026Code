package Week02.Intro.Procedural;

public class BankWithAccounts {
    static final int MAX_ACCOUNTS = 10;
    static String[] accountNumbers = new String[MAX_ACCOUNTS];
    static double[] balances = new double[MAX_ACCOUNTS];
    static int accountCount = 0;

    public static void createAccount(String accountNumber, double initialBalance) {
        if (accountCount >= MAX_ACCOUNTS) {
            System.out.println("Maximum number of accounts reached.");
            return;
        }

        accountNumbers[accountCount] = accountNumber;
        balances[accountCount] = initialBalance;
        accountCount++;
    }

    public static int findAccountIndex(String accountNumber) {
        for (int i = 0; i < accountCount; i++) {
            if (accountNumbers[i].equals(accountNumber)) {
                return i;
            }
        }
        return -1; // Account not found
    }

    public static void deposit(String accountNumber, double amount) {
        int index = findAccountIndex(accountNumber);
        if (index == -1) {
            System.out.println("Account not found.");
            return;
        }
        balances[index] += amount;
    }

    public static void withdraw(String accountNumber, double amount) {
        int index = findAccountIndex(accountNumber);
        if (index == -1) {
            System.out.println("Account not found.");
            return;
        }

        if (balances[index] < amount) {
            System.out.println("Insufficient funds.");
            return;
        }

        balances[index] -= amount;
    }

    public static void checkBalance(String accountNumber) {
        int index = findAccountIndex(accountNumber);
        if (index == -1) {
            System.out.println("Account not found.");
            return;
        }

        System.out.println("Balance for " + accountNumber + ": $" + balances[index]);
    }

    public static void main(String[] args) {
        createAccount("A123", 1000);
        createAccount("B456", 2000);

        deposit("A123", 500);
        withdraw("B456", 300);

        checkBalance("A123"); // Expected: Balance for A123: $1500.0
        checkBalance("B456"); // Expected: Balance for B456: $1700.0
    }
}


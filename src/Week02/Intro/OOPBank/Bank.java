package Week02.Intro.OOPBank;

public class Bank {

    private static final int MAX_ACCOUNTS = 10;

    private BankAccount[] accounts = new BankAccount[MAX_ACCOUNTS];
    private int accountCount = 0;

    private AccountHolder[] accountHolders = new AccountHolder[MAX_ACCOUNTS];
    private int holderCount = 0;

    // Method to create an account holder
    public void createAccountHolder(String id, String name, String contactInfo) {
        if (holderCount >= MAX_ACCOUNTS) {
            System.out.println("Maximum account holders reached.");
            return;
        }

        accountHolders[holderCount] = new AccountHolder(id, name, contactInfo);
        holderCount++;
    }

    // Method to find an account holder by ID
    private AccountHolder findAccountHolder(String id) {
        for (int i = 0; i < holderCount; i++) {
            if (accountHolders[i].getId().equals(id)) {
                return accountHolders[i];
            }
        }
        return null;
    }

    // Method to create a bank account for an existing account holder
    public void createAccount(String accountNumber, double initialBalance, String holderId) {
        if (accountCount >= MAX_ACCOUNTS) {
            System.out.println("Maximum accounts reached.");
            return;
        }

        AccountHolder holder = findAccountHolder(holderId);
        if (holder == null) {
            System.out.println("Account holder not found.");
            return;
        }

        accounts[accountCount] = new BankAccount(accountNumber, initialBalance, holder);
        accountCount++;
    }

    // Method to find a bank account
    private BankAccount findAccount(String accountNumber) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                return accounts[i];
            }
        }
        return null;
    }

    // Method to deposit money
    public void deposit(String accountNumber, double amount) {
        BankAccount account = findAccount(accountNumber);
        if (account == null) {
            System.out.println("Account not found.");
            return;
        }

        account.deposit(amount);
    }

    // Method to withdraw money
    public void withdraw(String accountNumber, double amount) {
        BankAccount account = findAccount(accountNumber);
        if (account == null) {
            System.out.println("Account not found.");
            return;
        }

        account.withdraw(amount);
    }

    // Method to check balance
    public void checkBalance(String accountNumber) {
        BankAccount account = findAccount(accountNumber);
        if (account == null) {
            System.out.println("Account not found.");
            return;
        }

        System.out.println("Balance for " + accountNumber + ": $" + account.checkBalance());
    }

    // Method to display all accounts and their holders
    public void displayAllAccounts() {
        for (int i = 0; i < accountCount; i++) {
            BankAccount account = accounts[i];
            AccountHolder holder = account.getAccountHolder();

            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Holder ID: " + holder.getId());
            System.out.println("Holder Name: " + holder.getName());
            System.out.println("Contact Info: " + holder.getContactInfo());
            System.out.println("Balance: $" + account.checkBalance());
            System.out.println("---------------------------");
        }
    }
}
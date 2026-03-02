package Week02.Intro.Procedural;

public class BankBasic {

    static double bankBalance = 0; // Single balance for the entire bank

    public static void deposit(double amount) {
        bankBalance += amount;
    }

    public static void withdraw(double amount) {
        if (bankBalance >= amount) {
            bankBalance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public static void checkBalance() {
        System.out.println("Bank Balance: $" + bankBalance);
    }

    public static void main(String[] args) {
        deposit(5000);
        withdraw(2000);
        checkBalance(); // Output: Bank Balance: $3000.0
    }
}



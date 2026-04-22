package Week08.Scanners;

import java.util.Scanner;

public class ScannerTextEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three words:");
        String word1 = scanner.next();  // reads up to first space
        String word2 = scanner.next();
        String word3 = scanner.next();

        System.out.println("You entered: " + word1 + ", " + word2 + ", " + word3);

    }
}

package Week08.Scanners;

import java.util.Scanner;

public class ScannerStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        System.out.println("You entered: " + input);

        scanner.close();
    }
}

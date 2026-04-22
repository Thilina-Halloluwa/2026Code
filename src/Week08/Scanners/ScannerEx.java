package Week08.Scanners;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        readInts(new InputStreamReader(System.in));
    }

    private static void readInts(Reader reader){
        Scanner scanner = new Scanner(reader);
        int total = 0;
        while(scanner.hasNextInt()){
            int newInt = scanner.nextInt();
            total += newInt;
        }
        System.out.println(total);
    }

}

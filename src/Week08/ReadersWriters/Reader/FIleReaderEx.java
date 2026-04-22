package Week08.ReadersWriters.Reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FIleReaderEx {
    //For demonstration only: main throws IOException to keep the example simple.
    public static void main(String[] args) throws IOException {
        readAndPrint(new FileReader("output.txt"));

    }

    private static void readAndPrint(Reader reader) throws IOException {
        char[] letters = new char[10];
        for (int i = 0; i < 10; i++) {
            letters[i] = (char) reader.read();

        }
        System.out.println(letters);
    }
}

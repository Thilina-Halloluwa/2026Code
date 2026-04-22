package Week08.ReadersWriters.Reader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReaderEx {
    //For demonstration only: main throws IOException to keep the example simple.
    public static void main(String[] args) throws IOException {
        readAndPrint(new InputStreamReader(System.in));

    }

    private static void readAndPrint(Reader reader) throws IOException {
        char[] letters = new char[10];
        for (int i = 0; i < 10; i++) {
            letters[i] = (char) reader.read();

        }
        System.out.println(letters);
    }
}

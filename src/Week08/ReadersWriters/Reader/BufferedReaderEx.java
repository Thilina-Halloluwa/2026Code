package Week08.ReadersWriters.Reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx {
    //For demonstration only: main throws IOException to keep the example simple.
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new FileReader("readwithbuffer.txt"));



        for (int i = 0; i < 5; i++) {
            System.out.println(reader.readLine());
        }
    }

}

package Week08.Streams.Inputstream.BufferedInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Foo {
    //main should not throw an exception. This is only for demonstration.
    public static void main(String[] args) throws IOException {
        // readAll(new FileInputStream("output.txt"));

        readAll(new BufferedInputStream(new FileInputStream("output.txt")));
    }

    private static void readAll(InputStream input) throws IOException {
        int in = 0;
        while (in != -1) {
            in = input.read();
            System.out.print((char) in);
        }
    }
}
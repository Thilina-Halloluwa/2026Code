package Week08.Streams.Inputstream.BufferedInputStream.trywithresources;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Foo {
    public static void main(String[] args) {
        try (BufferedInputStream input = new BufferedInputStream(new FileInputStream("output.txt"))) {
            readAll(input);
        } catch (IOException e) {
            System.out.println("Error: File Not Found " + e);
        }
    }

    private static void readAll(InputStream input) throws IOException {
        int in = 0;
        while (in != -1) {
            in = input.read();
            System.out.print((char) in);
        }
    }
}

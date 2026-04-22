package Week08.Streams;

import java.io.*;

public class StreamDemo {
    public static void main(String[] args) throws IOException {
        String text = "Aé";

        // Byte stream demo
        byte[] bytes = text.getBytes();
        InputStream in = new ByteArrayInputStream(bytes);

        System.out.println("Byte stream:");
        int b;
        while ((b = in.read()) != -1) {
            System.out.println(b);
        }

        // Character stream demo
        Reader reader = new StringReader(text);

        System.out.println("Character stream:");
        int ch;
        while ((ch = reader.read()) != -1) {
            System.out.println((char) ch);
        }
    }
}

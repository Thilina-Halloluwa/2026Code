package Week08.NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Deleting {
    public static void main(String[] args) throws IOException {
        Path myPath= Path.of("src","Week08","NIO","myfile.txt");
        Files.deleteIfExists(myPath);
    }
}

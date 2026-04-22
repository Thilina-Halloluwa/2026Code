package Week08.NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Reading {
    public static void main(String[] args) throws IOException {
        Path myPath = Path.of("src", "Week08", "NIO", "myfile.txt");

        List<String> lines = Files.readAllLines(myPath);
        for (String line : lines) {
            System.out.println(line);
        }
    }
}

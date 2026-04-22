package Week08.NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Writing {
    public static void main(String[] args) throws IOException {
        Path myPath= Path.of("src","Week08","NIO","myfile.txt");
        Files.write(myPath, List.of("Hello","World"));
        Files.writeString(myPath, "Hello CSSE2002 Welcome");
    }
}

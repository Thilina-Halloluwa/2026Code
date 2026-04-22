package Week08.NIO;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;

public class paths {
    public static void main(String[] args) throws URISyntaxException {
        Path p1 = Path.of("docs/output.txt");
        Path p2 = Path.of("docs", "output.txt");

        Path p4 = Path.of("docs","folder1", "floder2", "folder4", "output.txt");


        System.out.println(p4);
        Path p3 = Path.of(new URI("file:///docs/output.txt"));
    }
}

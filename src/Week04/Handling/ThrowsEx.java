package Week04.Handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsEx {
    public static void main(String[] args){
        try {
            findFile();
        }
        catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

    public static void findFile() throws FileNotFoundException {
        // code that may generate FileNotFoundException
        File newFile = new File("file.txt");
        FileInputStream stream = new FileInputStream(newFile);
    }
}

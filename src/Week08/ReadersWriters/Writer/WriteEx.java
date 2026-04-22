package Week08.ReadersWriters.Writer;

import java.io.PrintWriter;

public class WriteEx {
    public static void main(String[] args) {
        PrintWriter printWriter = new PrintWriter(System.out);
        printWriter.println("I love CSSE2002");
        printWriter.printf("Formatted number: %.2f%n", 123.45336);
        printWriter.flush();
        //Try closing this and see what happens and why it's happening.. (HW)


        //System.out can format too.
        System.out.printf("Name: %s, Age: %d%n", "Sam", 21);
        System.out.format("Formatted number: %.2f%n", 123.45336);




    }
}

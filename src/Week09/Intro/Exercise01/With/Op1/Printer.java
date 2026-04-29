package Week09.Intro.Exercise01.With.Op1;

public class Printer {
    public <T> void print(T data) {
        System.out.println("Lets shout " + data + "!!!");
    }

    public static void main(String[] args) {
        String data = "I love CSSE2002";
        Printer printer = new Printer();

        printer.print(data);
        printer.print(123);
    }

}

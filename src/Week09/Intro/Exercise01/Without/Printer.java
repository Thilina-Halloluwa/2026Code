package Week09.Intro.Exercise01.Without;

public class Printer {
    public void print(String data) {
        System.out.println("Lets shout " + data + "!!!");
    }

    public static void main(String[] args) {
        String data = "I love CSSE2002";
        Printer printer = new Printer();
        printer.print(data);
    }

}

package Week09.Bounded.Ex02;

public class Printer {
    public <T extends Number> void print(T data) {
        System.out.println("Lets shout " + data + "!!!");
    }

    public static void main(String[] args) {
        Printer printer = new Printer();

        printer.print(123);
        printer.print(123.2);
        //printer.print("123");
    }
}


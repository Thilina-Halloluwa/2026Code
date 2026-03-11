package Week03.Plymorphism;

public class CompPolymorphism {
    static String print(int value) {
        return "number";
    }
    static String print(String value) {
        return "text";
    }

    public static void main(String[] args) {
        System.out.println(print(21));
        System.out.println(print("21"));
    }

}

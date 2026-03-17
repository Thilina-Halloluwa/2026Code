package Week04.Handling;

public class throwing {

    public static void main(String[] args) {

            checkEntry(17);

    }

    public static void checkEntry(int age) {
        if (age < 18) {
            throw new IllegalArgumentException ("Access denied ");
        }
        else {
            System.out.println("Access granted ");
        }
    }
}

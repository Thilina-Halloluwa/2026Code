package Week04.Handling;

public class withTryCatch {
    public static void main(String[] args) {
        int result;
        try {
            result = 5 / 0;

        } catch (ArithmeticException e) {
            System.out.println(e); // print out error message
            result = Integer.MAX_VALUE; // Assign a default or fallback value

        }

    }
}
